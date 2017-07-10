package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class Copyright {
    private String holder;
    private String holderUrl;
    private String licence;
    private String licenceUrl;
    private String logo;
    private int year;
}