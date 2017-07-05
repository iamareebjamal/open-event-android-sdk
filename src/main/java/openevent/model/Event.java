package openevent.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;

import java.util.List;

@Type("event")
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
    private boolean isSessionSpeakersEnabled;
    private String identifier;
    private String endsAt;
    @Relationship("social-links")
    private List<SocialLink> socialLinks;
    private Copyright copyright;
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

    public boolean getIsTaxEnabled() {
        return isTaxEnabled;
    }

    public void setIsTaxEnabled(boolean taxEnabled) {
        this.isTaxEnabled = taxEnabled;
    }

    public boolean getCanPayOnsite() {
        return canPayOnsite;
    }

    public void setCanPayOnsite(boolean canPayOnSite) {
        this.canPayOnsite = canPayOnSite;
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

    public boolean getIsTicketingEnabled() {
        return isTicketingEnabled;
    }

    public void setIsTicketingEnabled(boolean ticketingEnabled) {
        this.isTicketingEnabled = ticketingEnabled;
    }

    public String getExternalEventUrl() {
        return externalEventUrl;
    }

    public void setExternalEventUrl(String externalEventUrl) {
        this.externalEventUrl = externalEventUrl;
    }

    public String getIcalUrl() {
        return icalUrl;
    }

    public void setIcalUrl(String icalUrl) {
        this.icalUrl = icalUrl;
    }

    public boolean getCanPayByPaypal() {
        return canPayByPaypal;
    }

    public void setCanPayByPaypal(boolean canPayByPaypal) {
        this.canPayByPaypal = canPayByPaypal;
    }

    public boolean getIsMapShown() {
        return isMapShown;
    }

    public void setIsMapShown(boolean mapShown) {
        isMapShown = mapShown;
    }

    public boolean getisSponsorsEnabled() {
        return isSponsorsEnabled;
    }

    public void setIsSponsorsEnabled(boolean sponsorsEnabled) {
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

    public boolean getCanPayByCheque() {
        return canPayByCheque;
    }

    public void setCanPayByCheque(boolean canPayByChecque) {
        this.canPayByCheque = canPayByChecque;
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

    public boolean getIsSessionsSpeakersEnabled() {
        return isSessionSpeakersEnabled;
    }

    public void setIsSessionsSpeakersEnabled(boolean sessionSpeakersEnabled) {
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

    public boolean isHasOrganizerInfo() {
        return hasOrganizerInfo;
    }

    public void setHasOrganizerInfo(boolean hasOrganizerInfo) {
        this.hasOrganizerInfo = hasOrganizerInfo;
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
                ", canPayOnsite=" + canPayOnsite +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", startsAt='" + startsAt + '\'' +
                ", searchableLocationName='" + searchableLocationName + '\'' +
                ", description='" + description + '\'' +
                ", pentabarfUrl='" + pentabarfUrl + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", isTicketingEnabled=" + isTicketingEnabled +
                ", externalEventUrl='" + externalEventUrl + '\'' +
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
                ", canPayByCheque=" + canPayByCheque +
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