package openevent.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

@Type("sponsor")
public class ApiSponsor {
	
	@Id
	@JsonProperty
	private String id;
	@JsonProperty("description")
	private String description;
	@JsonProperty("level")
	private String level;
	@JsonProperty("url")
	private String url;
	@JsonProperty("type")
	private String type;
	@JsonProperty("logo-url")
	private String logoUrl;
	@JsonProperty("name")
	private String name;
	
    @JsonProperty("id")
    public String getId() {
		return id;
	}
    
    @JsonProperty("id")
    public void setId(String id) {
		this.id = id;
	}
    
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}
	
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}
	
	@JsonProperty("level")
	public String getLevel() {
		return level;
	}
	
	@JsonProperty("level")
	public void setLevel(String level) {
		this.level = level;
	}
	
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}
	
	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}
	
	@JsonProperty("type")
	public String getType() {
		return type;
	}
	
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}
	
	@JsonProperty("logo-url")
	public String getLogoUrl() {
		return logoUrl;
	}
	
	@JsonProperty("logo-url")
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	
	@JsonProperty("name")
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
