
package com.example.codapi;

import java.util.ArrayList;
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
    "iw8_sn_alpha50",
    "iw8_sn_hdromeo",
    "iw8_sn_delta",
    "iw8_sn_xmike109"
})
@Generated("jsonschema2pojo")
public class WeaponSniper {

    @JsonProperty("iw8_sn_alpha50")
    private Iw8SnAlpha50 iw8SnAlpha50;
    @JsonProperty("iw8_sn_hdromeo")
    private Iw8SnHdromeo iw8SnHdromeo;
    @JsonProperty("iw8_sn_delta")
    private Iw8SnDelta iw8SnDelta;
    @JsonProperty("iw8_sn_xmike109")
    private Iw8SnXmike109 iw8SnXmike109;
    @JsonIgnore
    private ArrayList<Object> snList;

    public WeaponSniper() {}

    public WeaponSniper(Iw8SnAlpha50 iw8SnAlpha50, Iw8SnHdromeo iw8SnHdromeo,
                        Iw8SnDelta iw8SnDelta, Iw8SnXmike109 iw8SnXmike109)
    {
        super();
        this.iw8SnAlpha50 = iw8SnAlpha50;
        this.iw8SnHdromeo = iw8SnHdromeo;
        this.iw8SnDelta = iw8SnDelta;
        this.iw8SnXmike109 = iw8SnXmike109;
        this.snList = new ArrayList<>();
    }

    @JsonProperty("iw8_sn_alpha50")
    public Iw8SnAlpha50 getIw8SnAlpha50() {
        return iw8SnAlpha50;
    }

    @JsonProperty("iw8_sn_alpha50")
    public void setIw8SnAlpha50(Iw8SnAlpha50 iw8SnAlpha50) {
        this.iw8SnAlpha50 = iw8SnAlpha50;
    }

    @JsonProperty("iw8_sn_hdromeo")
    public Iw8SnHdromeo getIw8SnHdromeo() {
        return iw8SnHdromeo;
    }

    @JsonProperty("iw8_sn_hdromeo")
    public void setIw8SnHdromeo(Iw8SnHdromeo iw8SnHdromeo) {
        this.iw8SnHdromeo = iw8SnHdromeo;
    }

    @JsonProperty("iw8_sn_delta")
    public Iw8SnDelta getIw8SnDelta() {
        return iw8SnDelta;
    }

    @JsonProperty("iw8_sn_delta")
    public void setIw8SnDelta(Iw8SnDelta iw8SnDelta) {
        this.iw8SnDelta = iw8SnDelta;
    }

    @JsonProperty("iw8_sn_xmike109")
    public Iw8SnXmike109 getIw8SnXmike109() {
        return iw8SnXmike109;
    }

    @JsonProperty("iw8_sn_xmike109")
    public void setIw8SnXmike109(Iw8SnXmike109 iw8SnXmike109) {
        this.iw8SnXmike109 = iw8SnXmike109;
    }

    @JsonAnyGetter
    public ArrayList<Object> getSniperList(){return this.snList;}

    @JsonAnySetter
    public void setSniperList(ArrayList<Object> list){this.snList = list;}


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Object o: snList)
        {
            sb.append(o.toString() + "---------------------------");
        }
        return sb.toString();
    }

}
