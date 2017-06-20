package openevent.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;

import java.util.List;

@Type("speaker")
public class ApiSpeaker {

    @Id
    @JsonProperty
    private String id;
    private String name;
    private String email;
    private String mobile;
    @JsonProperty("photo")
    private String imageUrl;
    private String organisation;
    private String position;
    private String country;
    @JsonProperty("short-biography")
    private String shortBiography;
    @JsonProperty("long-biography")
    private String longBiography;
    @JsonProperty("speaking-experience")
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
    @JsonProperty("is-featured")
    private boolean isFeatured;

    @Relationship("sessions")
    private List<ApiSession> sessions;

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

    public List<ApiSession> getSessions() {
        return sessions;
    }

    public void setSessions(List<ApiSession> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "ApiSpeaker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", photo='" + imageUrl + '\'' +
                ", organisation='" + organisation + '\'' +
                ", position='" + position + '\'' +
                ", country='" + country + '\'' +
                ", short-biography='" + shortBiography + '\'' +
                ", long-biography='" + longBiography + '\'' +
                ", speaking-experience='" + speakingExperience + '\'' +
                ", website='" + websiteUrl + '\'' +
                ", twitter='" + twitterUrl + '\'' +
                ", facebook='" + fbUrl + '\'' +
                ", github='" + githubUrl + '\'' +
                ", linkedin='" + linkedinUrl + '\'' +
                ", is-featured='" + isFeatured + '\'' +
                ", sessions='" + sessions + '\'' +
                '}';
    }
}