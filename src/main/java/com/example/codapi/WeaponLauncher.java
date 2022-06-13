
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

}
