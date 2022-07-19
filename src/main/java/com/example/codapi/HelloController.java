package com.example.codapi;


import org.json.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HelloController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TextField inputName;

    @FXML
    private Button submitButton, lifetimeButton, weaponButton;

    private Pane lifetimePane, weaponPane;

    private JSONObject object;

    private Lifetime lifetime;

    private UILifetimeStats uiLifetimeStats;

    private UIWeaponTable uiWeaponTable;

    private final ArrayList<ArrayList<Object>> weaponClassList;

    public HelloController()
    {
        weaponClassList = new ArrayList<>();
    }

    /**
     * Once the submit button is clicked, we will make a call to get the data for the user that was entered.
     * If the user is not found, then there will be an "Invalid Activision Username" text displayed.
     * If the user is found but has their profile set to private, there will be a message indicating that.
     * Otherwise, we will get an HTTP response and format it, map it to appropriate data and initiate the
     * frontend aspect of the project using helper functions below.
     */
    @FXML
    protected void onSubmitButtonClick() throws IOException, InterruptedException
    {
        submitButton.setDisable(true);
        enableSubmitButton();
        String username = inputName.getText().strip();//Get username input
        username = username.replace("#", "%23");//Replace the # with %23 because HTTP Request format
        username = username.replace(" ", "%20");//Request replaces spaces with %20
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .header("X-RapidAPI-Host", "call-of-duty-modern-warfare.p.rapidapi.com")
                .header("X-RapidAPI-Key", "4125e08ab5msh1e35e54946ee894p1de70djsn0b70aa45221f")
                .uri(URI.create("https://call-of-duty-modern-warfare.p.rapidapi.com/multiplayer/"+username+"/acti"))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = removeProperties(response.body());//Assign the HTTP response to a string. Remove Properties' field from it.
        System.out.println(responseBody);
        try
        {
            evaluateData(responseBody);
        }
        catch (JSONException e)
        {
            if (responseBody.contains("not allowed"))
            {
                System.out.println("User does not allow their info to be shared with third party apps");
            }
            else
            {
                System.out.println("Invalid Activision Username");
            }
        }
    }

    /**
     * Removing all the Properties' field from the response along with their corresponding '}'.
     * With this, we do not have to deal with 130+ Properties files.
     * @param data The HTTP response body as a string.
     * @return The modified response that can be mapped with the files we have in the directory.
     */
    public String removeProperties(String data)
    {
        data = data.replaceAll("\"properties\":\\{", "");
        data = data.replaceAll("}},", "\\},");
        data += '}';//Have to add an extra bracket at the end to make it valid.
        return data;
    }

    /**
     * Taking in the modified response body, we can now map the data to its corresponding class.
     * Even though there are a lot of classes, we will not be using all of them, but a decent amount still.
     * Able to assign the lifetime object. Also assigning the weapon classes list to be used when their
     * respective buttons are clicked on the front end.
     * @param data The modified HTTP response body
     */
    public void evaluateData(String data) throws IOException
    {
        object = new JSONObject(data);//Define the JSONObject global variable
        lifetime = retLifetime();//Assign the lifetime object
        ArrayList<Object> arList = lifetime.getItemData().getWeaponAssaultRifle().getArList();//Assign weapon class lists respectively
        ArrayList<Object> smgList = lifetime.getItemData().getWeaponSmg().getSmgList();
        ArrayList<Object> lmgList = lifetime.getItemData().getWeaponLmg().getLMGList();
        ArrayList<Object> shotgunList = lifetime.getItemData().getWeaponShotgun().getShotgunList();
        ArrayList<Object> marksmanList = lifetime.getItemData().getWeaponMarksman().getMarksmanList();
        ArrayList<Object> sniperList = lifetime.getItemData().getWeaponSniper().getSniperList();
        ArrayList<Object> pistolList = lifetime.getItemData().getWeaponPistol().getPistolList();
        ArrayList<Object> launcherList = lifetime.getItemData().getWeaponLauncher().getLauncherList();
        ArrayList<Object> allWeaponList = new ArrayList<>();//Array List containing each individual weapon object amongst every weapon class.
        Collections.addAll(weaponClassList, arList, smgList, lmgList, shotgunList, marksmanList, sniperList, pistolList, launcherList);//Add all weapon class lists to the complete one
        for (Collection<?> o : weaponClassList)//For each weapon class. arList, smgList etc.
        {
            allWeaponList.addAll(o);
        }
        weaponClassList.add(allWeaponList);//Add the Array List containing every weapon object.
        initializeLifetimePane();
        initializeWeaponPane();
//        showWeaponPane();
        showLifetimePane();
    }

    /**
     * Initialize the LifetimeStats Pane once, so it can just be loaded each time the user wants to view it.
     */
    public void initializeLifetimePane() throws IOException
    {
        FXMLLoader loader1 = new FXMLLoader();
        loader1.setLocation(HelloApplication.class.getResource("LifetimeStats.fxml"));//Load Lifetime fxml
        lifetimePane = loader1.load();
        uiLifetimeStats = loader1.getController();
    }

    /**
     * Initialize the WeaponTable Pane once, so it can just be loaded each time the user wants to view it.
     */
    public void initializeWeaponPane() throws IOException
    {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(HelloApplication.class.getResource("WeaponTable.fxml"));//Load WeaponTable fxml
        weaponPane = loader2.load();
        uiWeaponTable = loader2.getController();
    }

    /**
     * Method to display the LifetimeStats screen
     */
    public void showLifetimePane()
    {
        borderPane.setBottom(lifetimePane);
        uiLifetimeStats.setLifetime(lifetime);
        uiLifetimeStats.setFields();
    }

    /**
     * Method to display the WeaponTable screen
     */
    public void showWeaponPane()
    {
        borderPane.setBottom(weaponPane);
        uiWeaponTable.setWeaponClassList(weaponClassList);
    }

    /**
     * Creating a lifetime object which would have all the data needed for presenting on the application interface
     * @return Lifetime object
     */
    public Lifetime retLifetime() throws JsonProcessingException
    {
        RetrieveLifetime rl = new RetrieveLifetime(object);
        return rl.getLifetimeProperties();
    }

    /**
     * If the text in the input field is changed, enable the submit button again.
     */
    public void enableSubmitButton()
    {
        inputName.textProperty().addListener((observable, oldValue, newValue) ->
                submitButton.setDisable(false));
    }

    /**
     * After loading a pane, the interactive elements of hello-view need to be refocused.
     */
    public void refocus()
    {
        inputName.requestFocus();
        submitButton.requestFocus();
        lifetimeButton.requestFocus();
        weaponButton.requestFocus();
    }

}

//General Kenobi#7520759

//    long startTime = System.currentTimeMillis();
//            long endTime = System.currentTimeMillis();
//            System.out.println("That took " + (endTime - startTime) + " milliseconds");

//{"title":"mw","platform":"uno","username":"General Kenobi#7520759","type":"mp","level":71,"maxLevel":1,"levelXpRemainder":13306,"levelXpGained":29594,"prestige":0,"prestigeId":0,"maxPrestige":0,"totalXp":1545404,"paragonRank":0,"paragonId":0,"s":1,"p":1,"lifetime":{"all":{"recordLongestWinStreak":19,"recordXpInAMatch":38302,"accuracy":0.20828208327293396,"losses":1350,"totalGamesPlayed":5820,"score":16179637,"winLossRatio":0.7562962770462036,"totalShots":513011,"bestScoreXp":0,"gamesPlayed":5820,"bestSquardKills":0,"bestSguardWave":0,"bestConfirmed":112,"deaths":44641,"wins":1021,"bestSquardCrates":0,"kdRatio":1.0267019271850586,"bestAssists":35,"bestFieldgoals":0,"bestScore":15025,"recordDeathsInAMatch":83,"scorePerGame":2780.0063573883162,"bestSPM":2546,"bestKillChains":0,"recordKillsInAMatch":79,"suicides":763,"wlRatio":0.7562962770462036,"currentWinStreak":18,"bestMatchBonusXp":0,"bestMatchXp":0,"bestSguardWeaponLevel":0,"bestKD":14,"kills":45833,"bestKillsAsInfected":4,"bestReturns":2,"bestStabs":2,"bestKillsAsSurvivor":14,"timePlayedTotal":1017941,"bestDestructions":1,"headshots":9406,"bestRescues":5,"assists":9042,"ties":15,"recordKillStreak":17,"bestPlants":3,"misses":406160,"bestDamage":0,"bestSetbacks":1,"bestTouchdowns":0,"scorePerMinute":953.6684542620839,"bestDeaths":83,"bestMedalXp":0,"bestDefends":34,"bestSquardRevives":0,"bestKills":79,"bestDefuses":2,"bestCaptures":19,"hits":106851,"bestKillStreak":17,"bestDenied":18},"mode":{"gun":{"kills":579,"score":63574,"timePlayed":11222,"kdRatio":1.1264591439688716,"setBacks":10,"scorePerMinute":339.9073248975227,"stabs":12,"deaths":514},"dom":{"kills":4742,"score":810550,"timePlayed":120834,"kdRatio":0.9345683878596768,"captures":1203,"defends":1453,"scorePerMinute":402.477779432941,"deaths":5074},"war":{"kills":6459,"score":871800,"timePlayed":148914,"kdRatio":1.0273580404008271,"assists":1320,"scorePerMinute":351.26314517103833,"deaths":6287},"hq":{"kills":307,"score":44285,"timePlayed":14439,"kdRatio":0.7599009900990099,"captures":91,"defends":29,"scorePerMinute":184.0224392270933,"deaths":404},"hc_dom":{"kills":2306,"score":354390,"timePlayed":38314,"kdRatio":0.9082315872390705,"captures":410,"defends":633,"scorePerMinute":554.9772928955473,"deaths":2539},"hc_conf":{"kills":2040,"score":307845,"timePlayed":33545,"kdRatio":0.99609375,"confirms":963,"scorePerMinute":550.6245342077806,"denies":375,"deaths":2048},"koth":{"kills":5504,"score":823670,"timePlayed":117467,"kdRatio":1.0207715133531157,"defends":478,"objTime":8893,"scorePerMinute":420.7156052338104,"deaths":5392},"conf":{"kills":1975,"score":339020,"timePlayed":57044,"kdRatio":1.0561497326203209,"confirms":1402,"scorePerMinute":356.5878970619171,"denies":554,"deaths":1870},"hc_hq":{"kills":1,"score":185,"timePlayed":329,"kdRatio":0.09090909090909091,"captures":0,"defends":0,"scorePerMinute":33.73860182370821,"deaths":11},"arena":{"kills":282,"score":147250,"timePlayed":51007,"damage":29859,"kdRatio":1.00355871886121,"assists":25,"scorePerMinute":173.2115199874527,"deaths":281},"br_dmz":{"wins":0,"kills":123,"kdRatio":0.8785714285714286,"downs":132,"topTwentyFive":0,"objTime":0,"topTen":0,"contracts":4,"revives":4,"topFive":0,"score":58278,"timePlayed":14386,"gamesPlayed":20,"tokens":0,"scorePerMinute":243.06130960656193,"cash":320,"deaths":140},"br":{"wins":69,"kills":6401,"kdRatio":1.1596014492753624,"downs":6121,"topTwentyFive":1306,"objTime":0,"topTen":592,"contracts":1729,"revives":1189,"topFive":307,"score":7714810,"timePlayed":2186731,"gamesPlayed":2226,"tokens":0,"scorePerMinute":211.6806319570171,"cash":0,"deaths":5520},"sd":{"kills":2254,"score":1468420,"timePlayed":1009865,"kdRatio":1.2105263157894737,"plants":87,"scorePerMinute":87.24453268506187,"defuses":45,"deaths":1862},"grnd":{"kills":0,"score":0,"timePlayed":5,"kdRatio":0,"defends":0,"objTime":0,"scorePerMinute":0,"deaths":0},"cyber":{"kills":277,"score":85110,"timePlayed":36916,"kdRatio":1.08203125,"plants":14,"scorePerMinute":138.33026330046593,"revives":0,"deaths":256},"hc_war":{"kills":1846,"score":242085,"timePlayed":33060,"kdRatio":1.0353337072349973,"assists":272,"scorePerMinute":439.3557168784029,"deaths":1783},"br_all":{"wins":69,"kills":6524,"kdRatio":1.1526501766784452,"downs":6253,"topTwentyFive":1306,"objTime":0,"topTen":592,"contracts":1733,"revives":1193,"topFive":307,"score":7773088,"timePlayed":2201117,"gamesPlayed":2246,"tokens":0,"scorePerMinute":211.88572892763085,"cash":320,"deaths":5660},"hc_sd":{"kills":0,"score":0,"timePlayed":0,"kdRatio":0,"plants":0,"scorePerMinute":0,"defuses":0,"deaths":0},"arm":{"kills":345,"score":67685,"timePlayed":28398,"kdRatio":0.6117021276595744,"captures":60,"defends":25,"scorePerMinute":143.00654975702514,"deaths":564},"hc_cyber":{"kills":0,"score":0,"timePlayed":0,"kdRatio":0,"plants":0,"scorePerMinute":0,"revives":0,"deaths":0},"infect":{"kills":163,"score":85345,"infected":36,"timePlayed":11886,"kdRatio":0.9209039548022598,"scorePerMinute":430.8177688036345,"time":6089,"deaths":177}},"map":{},"itemData":{"weapon_assault_rifle":{"iw8_ar_tango21":{"hits":4352,"kills":971,"kdRatio":1.0542888165038002,"headshots":170,"accuracy":0.19818753130834738,"shots":21959,"deaths":921},"iw8_ar_mike4":{"hits":15568,"kills":5199,"kdRatio":1.0636252045826513,"headshots":1139,"accuracy":0.1783664256825655,"shots":87281,"deaths":4888},"iw8_ar_valpha":{"hits":4185,"kills":1296,"kdRatio":1.0666666666666667,"headshots":303,"accuracy":0.18771024893473873,"shots":22295,"deaths":1215},"iw8_ar_falpha":{"hits":2628,"kills":828,"kdRatio":0.9627906976744186,"headshots":251,"accuracy":0.28677433435181143,"shots":9164,"deaths":860},"iw8_ar_mcharlie":{"hits":6186,"kills":1081,"kdRatio":0.9310938845822567,"headshots":272,"accuracy":0.2176406431411181,"shots":28423,"deaths":1161},"iw8_ar_akilo47":{"hits":2470,"kills":706,"kdRatio":1.0291545189504374,"headshots":189,"accuracy":0.20252541816989178,"shots":12196,"deaths":686},"iw8_ar_asierra12":{"hits":2022,"kills":778,"kdRatio":0.9604938271604938,"headshots":198,"accuracy":0.19856623784739272,"shots":10183,"deaths":810},"iw8_ar_galima":{"hits":2952,"kills":887,"kdRatio":0.9456289978678039,"headshots":177,"accuracy":0.1927144535840188,"shots":15318,"deaths":938},"iw8_ar_sierra552":{"hits":4103,"kills":887,"kdRatio":1.1213653603034135,"headshots":178,"accuracy":0.2256379234491861,"shots":18184,"deaths":791},"iw8_ar_falima":{"hits":1640,"kills":680,"kdRatio":0.9672830725462305,"headshots":174,"accuracy":0.2851182197496523,"shots":5752,"deaths":703},"iw8_ar_anovember94":{"hits":1773,"kills":413,"kdRatio":0.9386363636363636,"headshots":90,"accuracy":0.24287671232876712,"shots":7300,"deaths":440},"iw8_ar_kilo433":{"hits":4313,"kills":810,"kdRatio":1.1587982832618027,"headshots":165,"accuracy":0.22513963564232395,"shots":19157,"deaths":699},"iw8_ar_scharlie":{"hits":2304,"kills":689,"kdRatio":0.936141304347826,"headshots":160,"accuracy":0.19330480745028947,"shots":11919,"deaths":736}},"weapon_shotgun":{"iw8_sh_mike26":{"hits":58,"kills":24,"kdRatio":24,"headshots":5,"accuracy":0.4393939393939394,"shots":132,"deaths":1},"iw8_sh_charlie725":{"hits":680,"kills":538,"kdRatio":0.9196581196581196,"headshots":81,"accuracy":0.5638474295190713,"shots":1206,"deaths":585},"iw8_sh_oscar12":{"hits":1283,"kills":585,"kdRatio":1.057866184448463,"headshots":80,"accuracy":0.41134979159987173,"shots":3119,"deaths":553},"iw8_sh_aalpha12":{"hits":879,"kills":366,"kdRatio":1.0892857142857142,"headshots":43,"accuracy":0.4764227642276423,"shots":1845,"deaths":336},"iw8_sh_romeo870":{"hits":649,"kills":471,"kdRatio":0.9573170731707317,"headshots":60,"accuracy":0.573321554770318,"shots":1132,"deaths":492},"iw8_sh_dpapa12":{"hits":890,"kills":444,"kdRatio":0.9386892177589852,"headshots":73,"accuracy":0.5767984445884641,"shots":1543,"deaths":473}},"weapon_marksman":{"iw8_sn_sbeta":{"hits":501,"kills":370,"kdRatio":1.0364145658263306,"headshots":109,"accuracy":0.4859359844810863,"shots":1031,"deaths":357},"iw8_sn_crossbow":{"hits":108,"kills":166,"kdRatio":1.129251700680272,"headshots":25,"accuracy":0.2634146341463415,"shots":410,"deaths":147},"iw8_sn_romeo700":{"hits":750,"kills":606,"kdRatio":0.8244897959183674,"headshots":133,"accuracy":0.4848093083387201,"shots":1547,"deaths":735},"iw8_sn_kilo98":{"hits":601,"kills":552,"kdRatio":1.0298507462686568,"headshots":210,"accuracy":0.46916471506635443,"shots":1281,"deaths":536},"iw8_sn_mike14":{"hits":893,"kills":420,"kdRatio":0.9610983981693364,"headshots":137,"accuracy":0.28331218274111675,"shots":3152,"deaths":437},"iw8_sn_sksierra":{"hits":743,"kills":329,"kdRatio":1.0751633986928104,"headshots":108,"accuracy":0.2638494318181818,"shots":2816,"deaths":306}},"weapon_sniper":{"iw8_sn_alpha50":{"hits":411,"kills":429,"kdRatio":0.8881987577639752,"headshots":111,"accuracy":0.4147325933400605,"shots":991,"deaths":483},"iw8_sn_hdromeo":{"hits":459,"kills":460,"kdRatio":0.8228980322003577,"headshots":132,"accuracy":0.4005235602094241,"shots":1146,"deaths":559},"iw8_sn_delta":{"hits":498,"kills":403,"kdRatio":0.930715935334873,"headshots":111,"accuracy":0.3143939393939394,"shots":1584,"deaths":433},"iw8_sn_xmike109":{"hits":42,"kills":46,"kdRatio":1,"headshots":11,"accuracy":0.2625,"shots":160,"deaths":46}},"tacticals":{"equip_gas_grenade":{"extraStat1":95,"uses":207},"equip_snapshot_grenade":{"extraStat1":347,"uses":465},"equip_decoy":{"extraStat1":386,"uses":77},"equip_smoke":{"extraStat1":0,"uses":1409},"equip_concussion":{"extraStat1":1510,"uses":2477},"equip_hb_sensor":{"extraStat1":0,"uses":14755},"equip_flash":{"extraStat1":239,"uses":403},"equip_adrenaline":{"extraStat1":1836,"uses":49}},"lethals":{"equip_frag":{"kills":36,"uses":462},"equip_thermite":{"kills":666,"uses":3918},"equip_semtex":{"kills":552,"uses":3229},"equip_claymore":{"kills":4,"uses":167},"equip_c4":{"kills":46,"uses":380},"equip_at_mine":{"kills":34,"uses":397},"equip_throwing_knife":{"kills":46,"uses":261},"equip_molotov":{"kills":40,"uses":414}},"weapon_lmg":{"iw8_lm_kilo121":{"hits":1517,"kills":345,"kdRatio":0.9857142857142858,"headshots":95,"accuracy":0.18416899356561856,"shots":8237,"deaths":350},"iw8_lm_mkilo3":{"hits":2185,"kills":528,"kdRatio":0.8903878583473862,"headshots":117,"accuracy":0.17510819041513062,"shots":12478,"deaths":593},"iw8_lm_mgolf34":{"hits":3063,"kills":679,"kdRatio":1.1297836938435941,"headshots":188,"accuracy":0.15252464893934867,"shots":20082,"deaths":601},"iw8_lm_lima86":{"hits":2306,"kills":649,"kdRatio":1.2153558052434457,"headshots":185,"accuracy":0.18946676526168763,"shots":12171,"deaths":534},"iw8_lm_pkilo":{"hits":2833,"kills":680,"kdRatio":0.9927007299270073,"headshots":110,"accuracy":0.16743498817966904,"shots":16920,"deaths":685},"iw8_lm_sierrax":{"hits":2741,"kills":553,"kdRatio":1.05736137667304,"headshots":149,"accuracy":0.20499588662029766,"shots":13371,"deaths":523},"iw8_lm_mgolf36":{"hits":5363,"kills":1077,"kdRatio":0.9514134275618374,"headshots":244,"accuracy":0.2203731097961867,"shots":24336,"deaths":1132}},"weapon_launcher":{"iw8_la_gromeo":{"hits":116,"kills":162,"kdRatio":0.6612244897959184,"headshots":4,"accuracy":0.2871287128712871,"shots":404,"deaths":245},"iw8_la_rpapa7":{"hits":188,"kills":215,"kdRatio":0.6935483870967742,"headshots":2,"accuracy":0.25033288948069243,"shots":751,"deaths":310},"iw8_la_juliet":{"hits":102,"kills":164,"kdRatio":0.4079601990049751,"headshots":0,"accuracy":0.19960861056751467,"shots":511,"deaths":402},"iw8_la_kgolf":{"hits":141,"kills":192,"kdRatio":0.49230769230769234,"headshots":3,"accuracy":0.24394463667820068,"shots":578,"deaths":390},"iw8_la_mike32":{"hits":0,"kills":0,"kdRatio":0,"headshots":0,"accuracy":0,"shots":5,"deaths":0}},"supers":{"super_emp_drone":{"kills":0,"misc1":8,"misc2":0,"uses":7},"super_trophy":{"kills":0,"misc1":10,"misc2":0,"uses":69},"super_ammo_drop":{"kills":12,"misc1":746,"misc2":0,"uses":210},"super_weapon_drop":{"kills":0,"misc1":0,"misc2":0,"uses":2},"super_fulton":{"kills":0,"misc1":0,"misc2":0,"uses":7},"super_armor_drop":{"kills":0,"misc1":0,"misc2":0,"uses":172},"super_select":{"kills":0,"misc1":0,"misc2":0,"uses":0},"super_tac_insert":{"kills":0,"misc1":16,"misc2":0,"uses":24},"super_recon_drone":{"kills":0,"misc1":53,"misc2":0,"uses":127},"super_deadsilence":{"kills":2386,"misc1":8,"misc2":0,"uses":4076},"super_supply_drop":{"kills":0,"misc1":0,"misc2":0,"uses":600},"super_tac_cover":{"kills":0,"misc1":31408,"misc2":0,"uses":147},"super_support_box":{"kills":130,"misc1":0,"misc2":0,"uses":312}},"weapon_pistol":{"iw8_pi_cpapa":{"hits":480,"kills":461,"kdRatio":1.0244444444444445,"headshots":93,"accuracy":0.44077134986225897,"shots":1089,"deaths":450},"iw8_pi_mike9":{"hits":415,"kills":72,"kdRatio":2.5714285714285716,"headshots":13,"accuracy":0.3410024650780608,"shots":1217,"deaths":28},"iw8_pi_mike1911":{"hits":635,"kills":322,"kdRatio":0.8429319371727748,"headshots":78,"accuracy":0.3181362725450902,"shots":1996,"deaths":382},"iw8_pi_golf21":{"hits":1754,"kills":354,"kdRatio":1.77,"headshots":57,"accuracy":0.3575214023644517,"shots":4906,"deaths":200},"iw8_pi_decho":{"hits":430,"kills":371,"kdRatio":0.973753280839895,"headshots":70,"accuracy":0.34099920697858843,"shots":1261,"deaths":381},"iw8_pi_papa320":{"hits":594,"kills":322,"kdRatio":0.930635838150289,"headshots":58,"accuracy":0.3088923556942278,"shots":1923,"deaths":346}},"weapon_other":{"iw8_me_riotshield":{"hits":6,"kills":252,"kdRatio":0.48554913294797686,"headshots":0,"accuracy":6,"shots":0,"deaths":519}},"weapon_smg":{"iw8_sm_mpapa7":{"hits":6429,"kills":1235,"kdRatio":1.109613656783468,"headshots":246,"accuracy":0.2236796325934173,"shots":28742,"deaths":1113},"iw8_sm_augolf":{"hits":2341,"kills":575,"kdRatio":0.968013468013468,"headshots":111,"accuracy":0.20277176266782157,"shots":11545,"deaths":594},"iw8_sm_papa90":{"hits":2657,"kills":525,"kdRatio":1.109936575052854,"headshots":141,"accuracy":0.20924555048039062,"shots":12698,"deaths":473},"iw8_sm_charlie9":{"hits":2381,"kills":468,"kdRatio":0.9158512720156555,"headshots":131,"accuracy":0.22736822001527884,"shots":10472,"deaths":511},"iw8_sm_mpapa5":{"hits":2408,"kills":532,"kdRatio":0.994392523364486,"headshots":128,"accuracy":0.20169193399782226,"shots":11939,"deaths":535},"iw8_sm_smgolf45":{"hits":2339,"kills":600,"kdRatio":0.8862629246676514,"headshots":84,"accuracy":0.23105798676281736,"shots":10123,"deaths":677},"iw8_sm_beta":{"hits":2177,"kills":533,"kdRatio":0.8973063973063973,"headshots":118,"accuracy":0.19153616047862046,"shots":11366,"deaths":594},"iw8_sm_victor":{"hits":2548,"kills":464,"kdRatio":0.9009708737864077,"headshots":112,"accuracy":0.19814915623298857,"shots":12859,"deaths":515},"iw8_sm_uzulu":{"hits":2095,"kills":597,"kdRatio":0.9313572542901716,"headshots":121,"accuracy":0.20636327817178882,"shots":10152,"deaths":641}},"weapon_melee":{"iw8_me_akimboblunt":{"hits":0,"kills":0,"kdRatio":0,"headshots":0,"accuracy":0,"shots":0,"deaths":0},"iw8_me_akimboblades":{"hits":0,"kills":0,"kdRatio":0,"headshots":0,"accuracy":0,"shots":0,"deaths":0},"iw8_knife":{"hits":13,"kills":281,"kdRatio":0.5531496062992126,"headshots":0,"accuracy":13,"shots":0,"deaths":508}}},"scorestreakData":{"lethalScorestreakData":{"precision_airstrike":{"extraStat1":166,"uses":488,"awardedCount":135},"cruise_predator":{"extraStat1":428,"uses":446,"awardedCount":522},"manual_turret":{"extraStat1":2,"uses":6,"awardedCount":6},"white_phosphorus":{"extraStat1":6,"uses":2,"awardedCount":2},"hover_jet":{"extraStat1":446,"uses":134,"awardedCount":139},"chopper_gunner":{"extraStat1":6,"uses":1,"awardedCount":1},"gunship":{"extraStat1":0,"uses":0,"awardedCount":0},"sentry_gun":{"extraStat1":0,"uses":11,"awardedCount":2},"toma_strike":{"extraStat1":86,"uses":351,"awardedCount":92},"nuke":{"extraStat1":0,"uses":0,"awardedCount":0},"juggernaut":{"extraStat1":0,"uses":0,"awardedCount":0},"pac_sentry":{"extraStat1":30,"uses":10,"awardedCount":9},"chopper_support":{"extraStat1":0,"uses":0,"awardedCount":0},"bradley":{"extraStat1":0,"uses":0,"awardedCount":0}},"supportScorestreakData":{"airdrop":{"extraStat1":0,"uses":0,"awardedCount":0},"radar_drone_overwatch":{"extraStat1":0,"uses":836,"awardedCount":1219},"scrambler_drone_guard":{"extraStat1":0,"uses":1,"awardedCount":0},"uav":{"extraStat1":10435,"uses":3032,"awardedCount":1883},"airdrop_multiple":{"extraStat1":0,"uses":0,"awardedCount":0},"directional_uav":{"extraStat1":0,"uses":23,"awardedCount":0}}},"accoladeData":{"classChanges":104,"highestAvgAltitude":163,"killsFromBehind":167,"lmgDeaths":86,"riotShieldDamageAbsorbed":33,"flashbangHits":32,"meleeKills":68,"tagsLargestBank":0,"shotgunKills":136,"sniperDeaths":169,"timeProne":57,"killstreakWhitePhosphorousKillsAssists":0,"shortestLife":134,"deathsFromBehind":184,"higherRankedKills":200,"mostAssists":120,"leastKills":161,"tagsDenied":56,"killstreakWheelsonKills":6,"sniperHeadshots":123,"killstreakJuggernautKills":0,"smokesUsed":190,"avengerKills":158,"decoyHits":0,"killstreakCarePackageUsed":0,"molotovKills":16,"gasHits":2,"comebackKills":220,"lmgHeadshots":171,"smgDeaths":164,"carrierKills":16,"deployableCoverUsed":1,"thermiteKills":23,"arKills":177,"c4Kills":0,"suicides":101,"clutch":0,"survivorKills":1,"killstreakGunshipKills":0,"timeSpentAsPassenger":3,"returns":1,"smgHeadshots":143,"launcherDeaths":100,"oneShotOneKills":138,"ammoBoxUsed":0,"spawnSelectSquad":1,"weaponPickups":17,"pointBlankKills":255,"tagsCaptured":44,"killstreakGroundKills":7,"distanceTraveledInVehicle":1,"longestLife":150,"stunHits":58,"spawnSelectFlag":0,"shotgunHeadshots":101,"bombDefused":9,"snapshotHits":4,"noKillsWithDeath":9,"killstreakAUAVAssists":0,"killstreakPersonalUAVKills":0,"tacticalInsertionSpawns":1,"launcherKills":25,"spawnSelectVehicle":0,"mostKillsLeastDeaths":33,"mostKills":110,"defends":83,"timeSpentAsDriver":2,"bombDetonated":6,"arHeadshots":231,"timeOnPoint":28,"lmgKills":175,"killstreakUAVAssists":163,"carepackagesCaptured":5,"mostKillsLongestStreak":65,"killstreakCruiseMissileKills":210,"longestStreak":165,"destroyedKillstreaks":49,"hipfireKills":228,"stimDamageHealed":3,"skippedKillcams":135,"leastAssists":425,"mostMultikills":117,"highestRankedKills":146,"killstreakAirstrikeKills":9,"distanceTravelled":116,"killstreakKills":132,"semtexKills":196,"penetrationKills":161,"explosionsSurvived":173,"highestMultikill":264,"arDeaths":130,"longshotKills":257,"proximityMineKills":8,"tagsMegaBanked":24,"mostKillsMostHeadshots":53,"firstInfected":2,"killstreakCUAVAssists":1,"throwingKnifeKills":6,"executionKills":15,"lastSurvivor":3,"reconDroneMarks":0,"deadSilenceKills":124,"revengeKills":140,"infectedKills":1,"killEnemyTeam":129,"sniperKills":120,"killstreakCluserStrikeKills":21,"meleeDeaths":169,"timeWatchingKillcams":39,"killstreakTankKills":0,"noKillNoDeath":2,"shotgunDeaths":106,"killstreakChopperGunnerKills":1,"shotsFired":72,"stoppingPowerKills":0,"pistolPeaths":198,"killstreakShieldTurretKills":1,"timeCrouched":521,"noDeathsFromBehind":1415,"bombPlanted":14,"setbacks":1,"smgKills":93,"claymoreKills":1,"kills10NoDeaths":2,"pistolHeadshots":14,"killstreakVTOLJetKills":54,"headshots":264,"mostDeaths":126,"adsKills":122,"empDroneHits":3,"defenderKills":196,"launcherHeadshots":0,"timesSelectedAsSquadLeader":0,"killstreakAirKills":143,"assaults":21,"fragKills":18,"killstreakEmergencyAirdropUsed":0,"captures":58,"killstreakChopperSupportKills":0,"spawnSelectBase":1,"noKill10Deaths":1,"leastDeaths":238,"killstreakSentryGunKills":0,"longestTimeSpentOnWeapon":1,"lowerRankedKills":111,"trophySystemHits":0,"clutchRevives":0,"lowestAvgAltitude":97,"pickups":17,"pistolKills":38,"reloads":107}},"weekly":{"all":{"kills":48,"medalXp":3110,"matchXp":9118,"averageSpeedDuringMatch":2014.2949250000001,"scoreXp":21370,"accuracy":0.1721311475409836,"losses":13,"wallBangs":0,"avgLifeTime":41.14736842105263,"shotsLanded":63,"score":21370,"totalXp":40571,"headshots":2,"assists":8,"draws":0,"rank":702,"scorePerMinute":328.0122793553338,"distanceTraveled":166747.39719999998,"deaths":82,"wins":0,"kdRatio":0.5853658536585366,"shotsMissed":303,"scorePerGame":1643.8461538461538,"timePlayed":3909,"headshotPercentage":0.041666666666666664,"executions":0,"matchesPlayed":13,"suicides":1,"seasonRank":143,"wlRatio":0,"nearmisses":203,"percentTimeMoving":1059.272042,"miscXp":0,"longestStreak":6,"damageDone":4893,"shotsFired":366,"damageTaken":9097},"mode":{"arena":{"kills":4,"medalXp":860,"matchXp":1014,"averageSpeedDuringMatch":0,"scoreXp":400,"accuracy":0.2631578947368421,"wallBangs":0,"losses":1,"avgLifeTime":64.2,"shotsLanded":5,"score":400,"totalXp":2747,"headshots":0,"assists":0,"rank":54,"draws":0,"scorePerMinute":74.76635514018692,"distanceTraveled":1810.7874,"deaths":4,"wins":0,"kdRatio":1,"shotsMissed":14,"scorePerGame":400,"timePlayed":321,"headshotPercentage":0,"matchesPlayed":1,"executions":0,"suicides":0,"seasonRank":11,"wlRatio":0,"nearmisses":11,"percentTimeMoving":0,"miscXp":0,"longestStreak":3,"damageDone":400,"shotsFired":19,"damageTaken":400},"infect":{"kills":44,"medalXp":2250,"matchXp":8104,"averageSpeedDuringMatch":2014.2949250000001,"scoreXp":20970,"accuracy":0.16714697406340057,"wallBangs":0,"losses":12,"avgLifeTime":39.86666666666667,"shotsLanded":58,"score":20970,"totalXp":37824,"headshots":2,"assists":8,"rank":648,"draws":0,"scorePerMinute":350.66889632107024,"distanceTraveled":164936.60979999998,"deaths":78,"wins":0,"kdRatio":0.5641025641025641,"shotsMissed":289,"scorePerGame":1747.5,"timePlayed":3588,"headshotPercentage":0.045454545454545456,"matchesPlayed":12,"executions":0,"suicides":1,"seasonRank":132,"wlRatio":0,"nearmisses":192,"percentTimeMoving":1059.272042,"miscXp":0,"longestStreak":6,"damageDone":4493,"shotsFired":347,"damageTaken":8697}},"map":{},"engagement":null}}

