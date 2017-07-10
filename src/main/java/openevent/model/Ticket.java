package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;

@Data
@Type("ticket")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class Ticket {
    @Id(IntegerIdHandler.class)
    private int id;
    private String name;
    private String description;
    private String type;
    private double price;
    private int quantity;
    private boolean descriptionToggle;
    private String position;
    private String isFeeAbsorbed;
    private String salesStartsAt;
    private String salesEndsAt;
    private boolean isHidden;
    private int minOrder;
    private int maxOrder;
}
