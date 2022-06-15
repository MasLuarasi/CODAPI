
package com.example.codapi;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "iw8_la_gromeo",
    "iw8_la_rpapa7",
    "iw8_la_juliet",
    "iw8_la_kgolf",
    "iw8_la_mike32"
})
@Generated("jsonschema2pojo")
public class WeaponLauncher {

    @JsonProperty("iw8_la_gromeo")
    private Iw8LaGromeo iw8LaGromeo;
    @JsonProperty("iw8_la_rpapa7")
    private Iw8LaRpapa7 iw8LaRpapa7;
    @JsonProperty("iw8_la_juliet")
    private Iw8LaJuliet iw8LaJuliet;
    @JsonProperty("iw8_la_kgolf")
    private Iw8LaKgolf iw8LaKgolf;
    @JsonProperty("iw8_la_mike32")
    private Iw8LaMike32 iw8LaMike32;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeaponLauncher() {
    }

    /**
     * 
     * @param iw8LaGromeo
     * @param iw8LaRpapa7
     * @param iw8LaMike32
     * @param iw8LaJuliet
     * @param iw8LaKgolf
     */
    public WeaponLauncher(Iw8LaGromeo iw8LaGromeo, Iw8LaRpapa7 iw8LaRpapa7, Iw8LaJuliet iw8LaJuliet, Iw8LaKgolf iw8LaKgolf, Iw8LaMike32 iw8LaMike32) {
        super();
        this.iw8LaGromeo = iw8LaGromeo;
        this.iw8LaRpapa7 = iw8LaRpapa7;
        this.iw8LaJuliet = iw8LaJuliet;
        this.iw8LaKgolf = iw8LaKgolf;
        this.iw8LaMike32 = iw8LaMike32;
    }

    @JsonProperty("iw8_la_gromeo")
    public Iw8LaGromeo getIw8LaGromeo() {
        return iw8LaGromeo;
    }

    @JsonProperty("iw8_la_gromeo")
    public void setIw8LaGromeo(Iw8LaGromeo iw8LaGromeo) {
        this.iw8LaGromeo = iw8LaGromeo;
    }

    @JsonProperty("iw8_la_rpapa7")
    public Iw8LaRpapa7 getIw8LaRpapa7() {
        return iw8LaRpapa7;
    }

    @JsonProperty("iw8_la_rpapa7")
    public void setIw8LaRpapa7(Iw8LaRpapa7 iw8LaRpapa7) {
        this.iw8LaRpapa7 = iw8LaRpapa7;
    }

    @JsonProperty("iw8_la_juliet")
    public Iw8LaJuliet getIw8LaJuliet() {
        return iw8LaJuliet;
    }

    @JsonProperty("iw8_la_juliet")
    public void setIw8LaJuliet(Iw8LaJuliet iw8LaJuliet) {
        this.iw8LaJuliet = iw8LaJuliet;
    }

    @JsonProperty("iw8_la_kgolf")
    public Iw8LaKgolf getIw8LaKgolf() {
        return iw8LaKgolf;
    }

    @JsonProperty("iw8_la_kgolf")
    public void setIw8LaKgolf(Iw8LaKgolf iw8LaKgolf) {
        this.iw8LaKgolf = iw8LaKgolf;
    }

    @JsonProperty("iw8_la_mike32")
    public Iw8LaMike32 getIw8LaMike32() {
        return iw8LaMike32;
    }

    @JsonProperty("iw8_la_mike32")
    public void setIw8LaMike32(Iw8LaMike32 iw8LaMike32) {
        this.iw8LaMike32 = iw8LaMike32;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WeaponLauncher.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("iw8LaGromeo");
        sb.append('=');
        sb.append(((this.iw8LaGromeo == null)?"<null>":this.iw8LaGromeo));
        sb.append(',');
        sb.append("iw8LaRpapa7");
        sb.append('=');
        sb.append(((this.iw8LaRpapa7 == null)?"<null>":this.iw8LaRpapa7));
        sb.append(',');
        sb.append("iw8LaJuliet");
        sb.append('=');
        sb.append(((this.iw8LaJuliet == null)?"<null>":this.iw8LaJuliet));
        sb.append(',');
        sb.append("iw8LaKgolf");
        sb.append('=');
        sb.append(((this.iw8LaKgolf == null)?"<null>":this.iw8LaKgolf));
        sb.append(',');
        sb.append("iw8LaMike32");
        sb.append('=');
        sb.append(((this.iw8LaMike32 == null)?"<null>":this.iw8LaMike32));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
