package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;

import java.util.List;

@Type("event")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

    @Id(IntegerIdHandler.class)
    private int id;
    @JsonProperty("payment-country")
    private String paymentCountry;
    @JsonProperty("paypal-email")
    private String paypalEmail;
    @JsonProperty("code-of-conduct")
    private String codeOfConduct;
    @JsonProperty("can-pay-by-bank")
    private boolean canPayByBank;
    @JsonProperty("schedule-published-on")
    private String schedulePublishedOn;
    @JsonProperty("payment-currency")
    private String paymentCurrency;
    @JsonProperty("organizer-description")
    private String organizerDescription;
    @JsonProperty("xcal-url")
    private String xcalUrl;
    @JsonProperty("original-image-url")
    private String originalImageUrl;
    private String topic;
    @JsonProperty("onsite-details")
    private String onsiteDetails;
    @JsonProperty("organizer-name")
    private String organizerName;
    @JsonProperty("large-image-url")
    private String largeImageUrl;
    private String timezone;
    @JsonProperty("deleted-at")
    private String deletedAt;
    @JsonProperty("ticket-url")
    private String ticketUrl;
    @JsonProperty("can-pay-by-stripe")
    private boolean canPayByStripe;
    @JsonProperty("location-name")
    private String locationName;
    private String privacy;
    private String state;
    private String latitude;
    @JsonProperty("is-tax-enabled")
    private boolean isTaxEnabled;
    @JsonProperty("can-pay-onsite")
    private boolean canPayOnSite;
    private String type;
    private String email;
    @JsonProperty("starts-at")
    private String startsAt;
    @JsonProperty("searchable-location-name")
    private String searchableLocationName;
    private String description;
    @JsonProperty("pentabarf-url")
    private String pentabarfUrl;
    @JsonProperty("logo-url")
    private String logoUrl;
    @JsonProperty("is-ticketing-enabled")
    private boolean isTicketingEnabled;
    @JsonProperty("event-url")
    private String eventUrl;
    @JsonProperty("ical-url")
    private String icalUrl;
    @JsonProperty("can-pay-by-paypal")
    private boolean canPayByPaypal;
    @JsonProperty("is-map-shown")
    private boolean isMapShown;
    @JsonProperty("is-sponsors-enabled")
    private boolean isSponsorsEnabled;
    private String name;
    @JsonProperty("sub-topic")
    private String subTopic;
    @JsonProperty("icon-image-url")
    private String iconImageUrl;
    @JsonProperty("thumbnail-image-url")
    private String thumbnailImageUrl;
    @JsonProperty("created-at")
    private String createdAt;
    private String longitude;
    @JsonProperty("can-pay-by-cheque")
    private boolean canPayByChecque;
    @JsonProperty("bank-details")
    private String bankDetails;
    @JsonProperty("cheque-details")
    private String chequeDetails;
    private boolean isSessionSpeakersEnabled;
    private String identifier;
    @JsonProperty("ends-at")
    private String endsAt;
    @Relationship("social-links")
    @JsonProperty("social-links")
    private List<SocialLink> socialLinks;
    private Copyright copyright;
    @JsonProperty("call-for-papers")
    private CallForPapers callForPapers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentCountry() {
        return paymentCountry;
    }

    public void setPaymentCountry(String paymentCountry) {
        this.paymentCountry = paymentCountry;
    }

    public String getPaypalEmail() {
        return paypalEmail;
    }

    public void setPaypalEmail(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    public String getCodeOfConduct() {
        return codeOfConduct;
    }

    public void setCodeOfConduct(String codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    public boolean isCanPayByBank() {
        return canPayByBank;
    }

    public void setCanPayByBank(boolean canPayByBank) {
        this.canPayByBank = canPayByBank;
    }

    public String getSchedulePublishedOn() {
        return schedulePublishedOn;
    }

    public void setSchedulePublishedOn(String schedulePublishedOn) {
        this.schedulePublishedOn = schedulePublishedOn;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public String getOrganizerDescription() {
        return organizerDescription;
    }

    public void setOrganizerDescription(String organizerDescription) {
        this.organizerDescription = organizerDescription;
    }

    public String getXcalUrl() {
        return xcalUrl;
    }

    public void setXcalUrl(String xcalUrl) {
        this.xcalUrl = xcalUrl;
    }

    public String getOriginalImageUrl() {
        return originalImageUrl;
    }

    public void setOriginalImageUrl(String originalImageUrl) {
        this.originalImageUrl = originalImageUrl;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getOnsiteDetails() {
        return onsiteDetails;
    }

    public void setOnsiteDetails(String onsiteDetails) {
        this.onsiteDetails = onsiteDetails;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getTicketUrl() {
        return ticketUrl;
    }

    public void setTicketUrl(String ticketUrl) {
        this.ticketUrl = ticketUrl;
    }

    public boolean isCanPayByStripe() {
        return canPayByStripe;
    }

    public void setCanPayByStripe(boolean canPayByStripe) {
        this.canPayByStripe = canPayByStripe;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public boolean isTaxEnabled() {
        return isTaxEnabled;
    }

    public void setTaxEnabled(boolean taxEnabled) {
        this.isTaxEnabled = taxEnabled;
    }

    public boolean isCanPayOnSite() {
        return canPayOnSite;
    }

    public void setCanPayOnSite(boolean canPayOnSite) {
        this.canPayOnSite = canPayOnSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    public String getSearchableLocationName() {
        return searchableLocationName;
    }

    public void setSearchableLocationName(String searchableLocationName) {
        this.searchableLocationName = searchableLocationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPentabarfUrl() {
        return pentabarfUrl;
    }

    public void setPentabarfUrl(String pentabarfUrl) {
        this.pentabarfUrl = pentabarfUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public boolean isTicketingEnabled() {
        return isTicketingEnabled;
    }

    public void setTicketingEnabled(boolean ticketingEnabled) {
        this.isTicketingEnabled = ticketingEnabled;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public String getIcalUrl() {
        return icalUrl;
    }

    public void setIcalUrl(String icalUrl) {
        this.icalUrl = icalUrl;
    }

    public boolean isCanPayByPaypal() {
        return canPayByPaypal;
    }

    public void setCanPayByPaypal(boolean canPayByPaypal) {
        this.canPayByPaypal = canPayByPaypal;
    }

    public boolean isMapShown() {
        return isMapShown;
    }

    public void setMapShown(boolean mapShown) {
        isMapShown = mapShown;
    }

    public boolean isSponsorsEnabled() {
        return isSponsorsEnabled;
    }

    public void setSponsorsEnabled(boolean sponsorsEnabled) {
        this.isSponsorsEnabled = sponsorsEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public void setIconImageUrl(String iconImageUrl) {
        this.iconImageUrl = iconImageUrl;
    }

    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public void setThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public boolean isCanPayByChecque() {
        return canPayByChecque;
    }

    public void setCanPayByChecque(boolean canPayByChecque) {
        this.canPayByChecque = canPayByChecque;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getChequeDetails() {
        return chequeDetails;
    }

    public void setChequeDetails(String chequeDetails) {
        this.chequeDetails = chequeDetails;
    }

    public boolean isSessionSpeakersEnabled() {
        return isSessionSpeakersEnabled;
    }

    @JsonSetter("is-sessions-speakers-enabled")
    public void setSessionSpeakersEnabled(boolean sessionSpeakersEnabled) {
        this.isSessionSpeakersEnabled = sessionSpeakersEnabled;
    }


    @JsonSetter("has-session-speakers")
    public void setSessionSpeakersEnabledTemp(boolean sessionSpeakersEnabled) {
        this.isSessionSpeakersEnabled = sessionSpeakersEnabled;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    public List<SocialLink> getSocialLinks() {
        return socialLinks;
    }

    public void setSocialLinks(List<SocialLink> socialLinks) {
        this.socialLinks = socialLinks;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public CallForPapers getCallForPapers() {
        return callForPapers;
    }

    public void setCallForPapers(CallForPapers callForPapers) {
        this.callForPapers = callForPapers;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", paymentCountry='" + paymentCountry + '\'' +
                ", paypalEmail='" + paypalEmail + '\'' +
                ", codeOfConduct='" + codeOfConduct + '\'' +
                ", canPayByBank=" + canPayByBank +
                ", schedulePublishedOn='" + schedulePublishedOn + '\'' +
                ", paymentCurrency='" + paymentCurrency + '\'' +
                ", organizerDescription='" + organizerDescription + '\'' +
                ", xcalUrl='" + xcalUrl + '\'' +
                ", originalImageUrl='" + originalImageUrl + '\'' +
                ", topic='" + topic + '\'' +
                ", onsiteDetails='" + onsiteDetails + '\'' +
                ", organizerName='" + organizerName + '\'' +
                ", largeImageUrl='" + largeImageUrl + '\'' +
                ", timezone='" + timezone + '\'' +
                ", deletedAt='" + deletedAt + '\'' +
                ", ticketUrl='" + ticketUrl + '\'' +
                ", canPayByStripe=" + canPayByStripe +
                ", locationName='" + locationName + '\'' +
                ", privacy='" + privacy + '\'' +
                ", state='" + state + '\'' +
                ", latitude='" + latitude + '\'' +
                ", isTaxEnabled=" + isTaxEnabled +
                ", canPayOnSite=" + canPayOnSite +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", startsAt='" + startsAt + '\'' +
                ", searchableLocationName='" + searchableLocationName + '\'' +
                ", description='" + description + '\'' +
                ", pentabarfUrl='" + pentabarfUrl + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", isTicketingEnabled=" + isTicketingEnabled +
                ", eventUrl='" + eventUrl + '\'' +
                ", icalUrl='" + icalUrl + '\'' +
                ", canPayByPaypal=" + canPayByPaypal +
                ", isMapShown=" + isMapShown +
                ", isSponsorsEnabled=" + isSponsorsEnabled +
                ", name='" + name + '\'' +
                ", subTopic='" + subTopic + '\'' +
                ", iconImageUrl='" + iconImageUrl + '\'' +
                ", thumbnailImageUrl='" + thumbnailImageUrl + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", longitude='" + longitude + '\'' +
                ", canPayByChecque=" + canPayByChecque +
                ", bankDetails='" + bankDetails + '\'' +
                ", chequeDetails='" + chequeDetails + '\'' +
                ", isSessionSpeakersEnabled=" + isSessionSpeakersEnabled +
                ", identifier='" + identifier + '\'' +
                ", endsAt='" + endsAt + '\'' +
                ", socialLinks=" + socialLinks +
                ", copyright=" + copyright +
                ", callForPapers=" + callForPapers +
                '}';
    }
}