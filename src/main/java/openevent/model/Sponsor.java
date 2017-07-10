package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;

@Data
@Type("sponsor")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class Sponsor {
    @Id(IntegerIdHandler.class)
    private int id;
    private String name;
    private String description;
    private String level;
    private String url;
    private String type;
    private String logoUrl;
}
