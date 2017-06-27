package openevent.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;

import java.util.List;

@Type("track")
public class Track {

    @Id
    private String id;
    private String name;
    private String description;
    private String color;
    private String fontColor;

    @Relationship("sessions")
    private List<Session> sessions;

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

    @JsonGetter("font-color")
    public String getFontColor() {
        return fontColor;
    }

    @JsonSetter("font-color")
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    @JsonGetter("font_color")
    private String getFontColorForOldModel() {
        return fontColor;
    }

    @JsonSetter("font_color")
    private void setFontColorForOldModel(String fontColor) {
        this.fontColor = fontColor;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", fontColor='" + fontColor + '\'' +
                ", sessions=" + sessions +
                '}';
    }
}
