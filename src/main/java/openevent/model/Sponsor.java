package openevent.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

@Type("sponsor")
public class Sponsor {

    @Id
    private String id;
    private String name;
    private String description;
    private String level;
    private String url;
    private String type;
    private String logoUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonGetter("type")
    public String getType() {
        return type;
    }

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("sponsor_type")
    private String getTypeForOldModel() {
        return type;
    }

    @JsonSetter("sponsor_type")
    private void setTypeForOldModel(String type) {
        this.type = type;
    }

    @JsonGetter("logo-url")
    public String getLogoUrl() {
        return logoUrl;
    }

    @JsonSetter("logo-url")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @JsonGetter("logo")
    private String getLogoUrlForOldModel() {
        return logoUrl;
    }

    @JsonSetter("logo")
    private void setLogoUrlForOldModel(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                '}';
    }

}
