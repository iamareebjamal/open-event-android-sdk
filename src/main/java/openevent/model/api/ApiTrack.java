package openevent.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import openevent.model.Session;

import java.util.List;

@Type("track")
public class ApiTrack {

    @Id
    private String id;
    private String name;
    private String description;
    private String color;
    @JsonProperty("font-color")
    private String fontColor;

    @Relationship("sessions")
    private List<ApiSession> sessions;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public List<ApiSession> getSessions() {
        return sessions;
    }

    public void setSessions(List<ApiSession> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "ApiTrack{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", fontColor='" + fontColor + '\'' +
                ", sessions=" + sessions +
                '}';
    }
}
