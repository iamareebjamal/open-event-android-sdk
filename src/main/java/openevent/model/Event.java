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
@Type("event")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class Event {
    @Id(IntegerIdHandler.class)
    private int id;
    private String paymentCountry;
    private String paypalEmail;
    private String codeOfConduct;
    private boolean canPayByBank;
    private String schedulePublishedOn;
    private String paymentCurrency;
    private String organizerDescription;
    private String xcalUrl;
    private String originalImageUrl;
    private String topic;
    private String onsiteDetails;
    private String organizerName;
    private String largeImageUrl;
    private String timezone;
    private String deletedAt;
    private String ticketUrl;
    private boolean canPayByStripe;
    private String locationName;
    private String privacy;
    private String state;
    private String latitude;
    private boolean isTaxEnabled;
    private boolean canPayOnsite;
    private String type;
    private String email;
    private String startsAt;
    private String searchableLocationName;
    private String description;
    private String pentabarfUrl;
    private String logoUrl;
    private boolean isTicketingEnabled;
    private boolean hasOrganizerInfo;
    private String externalEventUrl;
    private String icalUrl;
    private boolean canPayByPaypal;
    private boolean isMapShown;
    private boolean isSponsorsEnabled;
    private String name;
    private String subTopic;
    private String iconImageUrl;
    private String thumbnailImageUrl;
    private String createdAt;
    private String longitude;
    private boolean canPayByCheque;
    private String bankDetails;
    private String chequeDetails;
    private boolean isSessionsSpeakersEnabled;
    private String identifier;
    private String endsAt;
    @Relationship("social-links")
    private List<SocialLink> socialLinks;
    private Copyright copyright;
    private CallForPapers callForPapers;
}