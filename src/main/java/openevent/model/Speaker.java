package openevent.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Speaker {

    private String id;
    private String name;
    private String email;
    private String mobile;
    @JsonProperty("photo")
    private String imageUrl;
    private String organisation;
    private String position;
    private String country;
    @JsonProperty("short_biography")
    private String shortBiography;
    @JsonProperty("long_biography")
    private String longBiography;
    @JsonProperty("speaking_experience")
    private String speakingExperience;
    @JsonProperty("website")
    private String websiteUrl;
    @JsonProperty("twitter")
    private String twitterUrl;
    @JsonProperty("facebook")
    private String fbUrl;
    @JsonProperty("github")
    private String githubUrl;
    @JsonProperty("linkedin")
    private String linkedinUrl;
    @JsonProperty("featured")
    private boolean isFeatured;
    private List<Session> sessions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhoto() {
        return imageUrl;
    }

    public void setPhoto(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getShortBiography() {
        return shortBiography;
    }

    public void setShortBiography(String shortBiography) {
        this.shortBiography = shortBiography;
    }

    public String getLongBiography() {
        return longBiography;
    }

    public void setLongBiography(String longBiography) {
        this.longBiography = longBiography;
    }

    public String getSpeakingExperience() {
        return speakingExperience;
    }

    public void setSpeakingExperience(String speakingExperience) {
        this.speakingExperience = speakingExperience;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getFbUrl() {
        return fbUrl;
    }

    public void setFbUrl(String fbUrl) {
        this.fbUrl = fbUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    public boolean getFeatured() {
        return isFeatured;
    }

    public void setFeatured(boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", organisation='" + organisation + '\'' +
                ", position='" + position + '\'' +
                ", country='" + country + '\'' +
                ", shortBiography='" + shortBiography + '\'' +
                ", longBiography='" + longBiography + '\'' +
                ", speakingExperience='" + speakingExperience + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", twitterUrl='" + twitterUrl + '\'' +
                ", fbUrl='" + fbUrl + '\'' +
                ", githubUrl='" + githubUrl + '\'' +
                ", linkedinUrl='" + linkedinUrl + '\'' +
                ", isFeatured=" + isFeatured +
                ", sessions=" + sessions +
                '}';
    }
}