package openevent.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "organisation"
})
public class Speaker {

    //TODO: Add remaining fields

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("organisation")
    private String organisation;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("organisation")
    public String getOrganization() {
        return organisation;
    }

    @JsonProperty("organisation")
    public void setOrganization(String organisation) {
        this.organisation = organisation;
    }

    @Override
    public String toString() {
        return "ApiSession{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", organisation='" + organisation + '\'' +
                '}';
    }
}
