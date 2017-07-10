package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;

@Data
@Type("social-link")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class SocialLink {
    @Id(IntegerIdHandler.class)
    private int id;
    private String link;
    private String name;
}