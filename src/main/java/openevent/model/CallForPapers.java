package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class CallForPapers {
    private String announcement;
    private String startsAt;
    private String privacy;
    private String endsAt;
}