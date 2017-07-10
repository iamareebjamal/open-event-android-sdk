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
@Type("session")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class Session {
    @Id(IntegerIdHandler.class)
    private int id;
    private String title;
    private String subtitle;
    private String level;
    private String shortAbstract;
    private String longAbstract;
    private String comments;
    private String startsAt;
    private String endsAt;
    private String language;
    private String slidesUrl;
    private String videoUrl;
    private String audioUrl;
    private String signupUrl;
    private String state;
    private String createdAt;
    private String deletedAt;
    private String submittedAt;
    private String isMailSent;

    @Relationship("session-type")
    private SessionType sessionType;

    @Relationship("track")
    private Track track;

    @Relationship("microlocation")
    private Microlocation microlocation;

    @Relationship("speakers")
    private List<Speaker> speakers;
}
