package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;

@Data
@Type("attendee")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class Attendee {
    @Id(IntegerIdHandler.class)
    private int id;
    private String city;
    private String firstname;
    private String lastname;
    private boolean isCheckedIn;
    private String state;
    private String address;
    private String pdfUrl;
    private String country;
    private String email;
}
