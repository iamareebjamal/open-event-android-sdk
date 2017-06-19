package openevent.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Id;

import java.util.List;

import openevent.model.Session;

/**
 * Created by arpitdec5 on 19-06-2017.
 */

public class ApiSpeaker {

    @Id
    @JsonProperty
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("photo")
    private String imageUrl;
    @JsonProperty("organisation")
    private String organisation;
    @JsonProperty("position")
    private String position;
    @JsonProperty("country")
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
    @JsonProperty("sessions")
    private List<Session> sessions;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("photo")
    public String getPhoto() {
        return imageUrl;
    }

    @JsonProperty("photo")
    public void setPhoto(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("organisation")
    public String getOrganisation() {
        return organisation;
    }

    @JsonProperty("organisation")
    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("short-biography")
    public String getShortBiography() {
        return shortBiography;
    }

    @JsonProperty("short-biography")
    public void setShortBiography(String shortBiography) {
        this.shortBiography = shortBiography;
    }

    @JsonProperty("long-biography")
    public String getLongBiography() {
        return longBiography;
    }

    @JsonProperty("long-biography")
    public void setLongBiography(String longBiography) {
        this.longBiography = longBiography;
    }

    @JsonProperty("speaking-experience")
    public String getSpeakingExperience() {
        return speakingExperience;
    }

    @JsonProperty("speaking-experience")
    public void setSpeakingExperience(String speakingExperience) {
        this.speakingExperience = speakingExperience;
    }

    @JsonProperty("website")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @JsonProperty("website")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @JsonProperty("twitter")
    public String getTwitterUrl() {
        return twitterUrl;
    }

    @JsonProperty("twitter")
    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    @JsonProperty("facebook")
    public String getFbUrl() {
        return fbUrl;
    }

    @JsonProperty("facebook")
    public void setFbUrl(String fbUrl) {
        this.fbUrl = fbUrl;
    }

    @JsonProperty("github")
    public String getGithubUrl() {
        return githubUrl;
    }

    @JsonProperty("github")
    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    @JsonProperty("linkedin")
    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    @JsonProperty("linkedin")
    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    @JsonProperty("is-featured")
    public boolean getFeatured() {
        return isFeatured;
    }

    @JsonProperty("is-featured")
    public void setFeatured(boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    @JsonProperty("sessions")
    public List<Session> getSessions() {
        return sessions;
    }

    @JsonProperty("sessions")
    public void setSessions(List<Session> sessions) {
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