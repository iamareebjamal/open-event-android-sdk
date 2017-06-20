package openevent.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import openevent.model.CallForPapers;
import openevent.model.Copyright;
import openevent.model.SocialLink;

import java.util.List;

@Type("event")
public class Event {

    @Id
    private String id;
    @JsonProperty("payment-country")
    private String paymentCountry;
    @JsonProperty("paypal-email")
    private String paypalEmail;
    @JsonProperty("code-of-conduct")
    private String codeOfConduct;
    @JsonProperty("pay-by-bank")
    private boolean payByBank;
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
    @JsonProperty("pay-by-stripe")
    private boolean payByStripe;
    @JsonProperty("location-name")
    private String locationName;
    private String privacy;
    private String state;
    private String latitude;
    @JsonProperty("tax-allow")
    private boolean taxAllow;
    @JsonProperty("pay-onsite")
    private boolean payOnsite;
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
    @JsonProperty("ticket-include")
    private boolean ticketInclude;
    @JsonProperty("event-url")
    private String eventUrl;
    @JsonProperty("ical-url")
    private String icalUrl;
    @JsonProperty("pay-by-paypal")
    private boolean payByPaypal;
    @JsonProperty("show-map")
    private int showMap;
    @JsonProperty("sponsors-enabled")
    private boolean sponsorsEnabled;
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
    @JsonProperty("pay-by-cheque")
    private boolean payByCheque;
    @JsonProperty("bank-details")
    private String bankDetails;
    @JsonProperty("cheque-details")
    private String chequeDetails;
    @JsonProperty("has-session-speakers")
    private boolean hasSessionSpeakers;
    private String identifier;
    @JsonProperty("ends-at")
    private String endsAt;
    @Relationship("social-links")
    @JsonProperty("social-links")
    private List<SocialLink> socialLinks;
    private Copyright copyright;
    @JsonProperty("call-for-papers")
    private CallForPapers callForPapers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public boolean isPayByBank() {
        return payByBank;
    }

    public void setPayByBank(boolean payByBank) {
        this.payByBank = payByBank;
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

    public boolean isPayByStripe() {
        return payByStripe;
    }

    public void setPayByStripe(boolean payByStripe) {
        this.payByStripe = payByStripe;
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

    public boolean isTaxAllow() {
        return taxAllow;
    }

    public void setTaxAllow(boolean taxAllow) {
        this.taxAllow = taxAllow;
    }

    public boolean isPayOnsite() {
        return payOnsite;
    }

    public void setPayOnsite(boolean payOnsite) {
        this.payOnsite = payOnsite;
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

    public boolean isTicketInclude() {
        return ticketInclude;
    }

    public void setTicketInclude(boolean ticketInclude) {
        this.ticketInclude = ticketInclude;
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

    public boolean isPayByPaypal() {
        return payByPaypal;
    }

    public void setPayByPaypal(boolean payByPaypal) {
        this.payByPaypal = payByPaypal;
    }

    public int getShowMap() {
        return showMap;
    }

    public void setShowMap(int showMap) {
        this.showMap = showMap;
    }

    public boolean isSponsorsEnabled() {
        return sponsorsEnabled;
    }

    public void setSponsorsEnabled(boolean sponsorsEnabled) {
        this.sponsorsEnabled = sponsorsEnabled;
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

    public boolean isPayByCheque() {
        return payByCheque;
    }

    public void setPayByCheque(boolean payByCheque) {
        this.payByCheque = payByCheque;
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

    public boolean isHasSessionSpeakers() {
        return hasSessionSpeakers;
    }

    public void setHasSessionSpeakers(boolean hasSessionSpeakers) {
        this.hasSessionSpeakers = hasSessionSpeakers;
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

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", paymentCountry='" + paymentCountry + '\'' +
                ", paypalEmail='" + paypalEmail + '\'' +
                ", codeOfConduct='" + codeOfConduct + '\'' +
                ", payByBank=" + payByBank +
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
                ", payByStripe=" + payByStripe +
                ", locationName='" + locationName + '\'' +
                ", privacy='" + privacy + '\'' +
                ", state='" + state + '\'' +
                ", latitude='" + latitude + '\'' +
                ", taxAllow=" + taxAllow +
                ", payOnsite=" + payOnsite +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", startsAt='" + startsAt + '\'' +
                ", searchableLocationName='" + searchableLocationName + '\'' +
                ", description='" + description + '\'' +
                ", pentabarfUrl='" + pentabarfUrl + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", ticketInclude=" + ticketInclude +
                ", eventUrl='" + eventUrl + '\'' +
                ", icalUrl='" + icalUrl + '\'' +
                ", payByPaypal=" + payByPaypal +
                ", showMap=" + showMap +
                ", sponsorsEnabled=" + sponsorsEnabled +
                ", name='" + name + '\'' +
                ", subTopic='" + subTopic + '\'' +
                ", iconImageUrl='" + iconImageUrl + '\'' +
                ", thumbnailImageUrl='" + thumbnailImageUrl + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", longitude='" + longitude + '\'' +
                ", payByCheque=" + payByCheque +
                ", bankDetails='" + bankDetails + '\'' +
                ", chequeDetails='" + chequeDetails + '\'' +
                ", hasSessionSpeakers=" + hasSessionSpeakers +
                ", identifier='" + identifier + '\'' +
                ", endsAt='" + endsAt + '\'' +
                ", socialLinks=" + socialLinks +
                ", copyright=" + copyright +
                ", callForPapers=" + callForPapers +
                '}';
    }
}