package openevent.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Event {

    private String identifier;
    private String name;
    private double latitude;
    private double longitude;
    @JsonProperty("location-name")
    private String locationName;
    @JsonProperty("starts-at")
    private String startsAt;
    @JsonProperty("ends-at")
    private String endsAt;
    private String timezone;
    private String description;
    @JsonProperty("logo-url")
    private String logoUrl;
    @JsonProperty("organizer-name")
    private String organizerName;
    @JsonProperty("organizer-description")
    private String organizerDescription;
    @JsonProperty("social-links")
    private List<SocialLink> socialLinks = null;
    @JsonProperty("ticket-url")
    private String ticketUrl;
    private String privacy;
    private String type;
    private String topic;
    @JsonProperty("sub-topic")
    private Object subTopic;
    @JsonProperty("code-of-conduct")
    private Object codeOfConduct;
    private Copyright copyright;
    @JsonProperty("call-for-papers")
    private CallForPapers callForPapers;
    private String email;
    @JsonProperty("has-session-speakers")
    private boolean hasSessionSpeakers;
    @JsonProperty("schedule-published-on")
    private String schedulePublishedOn;
    @JsonProperty("searchable-location-name")
    private Object searchableLocationName;
    private String state;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getOrganizerDescription() {
        return organizerDescription;
    }

    public void setOrganizerDescription(String organizerDescription) {
        this.organizerDescription = organizerDescription;
    }

    public List<SocialLink> getSocialLinks() {
        return socialLinks;
    }

    public void setSocialLinks(List<SocialLink> socialLinks) {
        this.socialLinks = socialLinks;
    }

    public String getTicketUrl() {
        return ticketUrl;
    }

    public void setTicketUrl(String ticketUrl) {
        this.ticketUrl = ticketUrl;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Object getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(Object subTopic) {
        this.subTopic = subTopic;
    }

    public Object getCodeOfConduct() {
        return codeOfConduct;
    }

    public void setCodeOfConduct(Object codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasSessionSpeakers() {
        return hasSessionSpeakers;
    }

    public void setHasSessionSpeakers(boolean hasSessionSpeakers) {
        this.hasSessionSpeakers = hasSessionSpeakers;
    }

    public String getSchedulePublishedOn() {
        return schedulePublishedOn;
    }

    public void setSchedulePublishedOn(String schedulePublishedOn) {
        this.schedulePublishedOn = schedulePublishedOn;
    }

    public Object getSearchableLocationName() {
        return searchableLocationName;
    }

    public void setSearchableLocationName(Object searchableLocationName) {
        this.searchableLocationName = searchableLocationName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Event{" +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", locationName='" + locationName + '\'' +
                ", startsAt='" + startsAt + '\'' +
                ", endsAt='" + endsAt + '\'' +
                ", timezone='" + timezone + '\'' +
                ", description='" + description + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", organizerName='" + organizerName + '\'' +
                ", organizerDescription='" + organizerDescription + '\'' +
                ", socialLinks=" + socialLinks +
                ", ticketUrl='" + ticketUrl + '\'' +
                ", privacy='" + privacy + '\'' +
                ", type='" + type + '\'' +
                ", topic='" + topic + '\'' +
                ", subTopic=" + subTopic +
                ", codeOfConduct=" + codeOfConduct +
                ", copyright=" + copyright +
                ", callForPapers=" + callForPapers +
                ", email='" + email + '\'' +
                ", hasSessionSpeakers=" + hasSessionSpeakers +
                ", schedulePublishedOn='" + schedulePublishedOn + '\'' +
                ", searchableLocationName=" + searchableLocationName +
                ", state='" + state + '\'' +
                '}';
    }
}