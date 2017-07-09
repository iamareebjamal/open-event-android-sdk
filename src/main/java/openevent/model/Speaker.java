package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;

import java.util.List;

@Data
@Type("speaker")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class Speaker {
    @Id(IntegerIdHandler.class)
    private int id;
    private String name;
    private String email;
    private String mobile;
    private String photo;
    private String organisation;
    private String position;
    private String country;
    private String shortBiography;
    private String longBiography;
    private String speakingExperience;
    private String website;
    private String twitter;
    private String facebook;
    private String github;
    private String linkedin;
    private boolean isFeatured;

    @Relationship("sessions")
    private List<Session> sessions;
}