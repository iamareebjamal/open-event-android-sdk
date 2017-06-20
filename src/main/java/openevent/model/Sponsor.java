package openevent.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sponsor {
	
	@JsonProperty
	private String id;
	private String description;
	private String level;
	private String url;
	@JsonProperty("sponsor_type")
	private String type;
	@JsonProperty("logo")
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
	public String toString() {
		return "Sponsor{" +
				"id='" + id + '\'' +
				", description='" + description + '\'' +
				", level='" + level + '\'' +
				", url='" + url + '\'' +
				", type='" + type + '\'' +
				", logoUrl='" + logoUrl + '\'' +
				", name='" + name + '\'' +
				'}';
	}

}
