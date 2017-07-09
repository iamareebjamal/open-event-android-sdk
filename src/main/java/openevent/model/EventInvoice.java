package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;

@Data
@Type("event-invoice")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class EventInvoice {
    @Id(IntegerIdHandler.class)
    private int id;
    private String status;
    private String city;
    private String identifier;
    private String paypalToken;
    private String expYear;
    private String transactionId;
    private String country;
    private String brand;
    private String createdAt;
    private String zipcode;
    private String paymentMode;
    private String stripeToken;
    private String last4;
    private String state;
    private String address;
    private String expMonth;
    private double amount;
    private String completedAt;
    private String paidVia;
}
