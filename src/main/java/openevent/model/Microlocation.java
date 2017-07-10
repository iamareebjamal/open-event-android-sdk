package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;

@Data
@Type("microlocation")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Microlocation {
    @Id(IntegerIdHandler.class)
    private int id;
    private String name;
    private String latitude;
    private String longitude;
    private String floor;
    private String room;
}
