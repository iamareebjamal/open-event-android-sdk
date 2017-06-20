package openevent.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

@Type("sponsor")
public class ApiSponsor {
	
	@Id
	@JsonProperty
	private String id;
	private String description;
	private String level;
	private String url;
	private String type;
	@JsonProperty("logo-url")
	private String logoUrl;
	private String name;

    public String getId() {
		return id;
	}

    public void setId(String id) {
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "ApiSponsor{" + 
				"id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' + 
                ", logo-url='" + logoUrl + '\'' +
                ", name='" + name + '\'' +
                '}';
	}

}