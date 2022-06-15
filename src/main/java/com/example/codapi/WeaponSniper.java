
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
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeaponSniper() {
    }

    /**
     * 
     * @param iw8SnHdromeo
     * @param iw8SnDelta
     * @param iw8SnXmike109
     * @param iw8SnAlpha50
     */
    public WeaponSniper(Iw8SnAlpha50 iw8SnAlpha50, Iw8SnHdromeo iw8SnHdromeo, Iw8SnDelta iw8SnDelta, Iw8SnXmike109 iw8SnXmike109) {
        super();
        this.iw8SnAlpha50 = iw8SnAlpha50;
        this.iw8SnHdromeo = iw8SnHdromeo;
        this.iw8SnDelta = iw8SnDelta;
        this.iw8SnXmike109 = iw8SnXmike109;
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
        sb.append(WeaponSniper.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("iw8SnAlpha50");
        sb.append('=');
        sb.append(((this.iw8SnAlpha50 == null)?"<null>":this.iw8SnAlpha50));
        sb.append(',');
        sb.append("iw8SnHdromeo");
        sb.append('=');
        sb.append(((this.iw8SnHdromeo == null)?"<null>":this.iw8SnHdromeo));
        sb.append(',');
        sb.append("iw8SnDelta");
        sb.append('=');
        sb.append(((this.iw8SnDelta == null)?"<null>":this.iw8SnDelta));
        sb.append(',');
        sb.append("iw8SnXmike109");
        sb.append('=');
        sb.append(((this.iw8SnXmike109 == null)?"<null>":this.iw8SnXmike109));
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
