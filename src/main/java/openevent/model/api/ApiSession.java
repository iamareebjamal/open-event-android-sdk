package openevent.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

@Type("session")
public class ApiSession {

    //TODO: Add relationships with other classes(event, track, microlocation, session-type)

    @Id
    @JsonProperty
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("level")
    private String level;
    @JsonProperty("short-abstract")
    private String shortAbstract;
    @JsonProperty("long-abstract")
    private String longAbstract;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("starts-at")
    private String startsAt;
    @JsonProperty("ends-at")
    private String endsAt;
    @JsonProperty("language")
    private String language;
    @JsonProperty("slides-url")
    private String slidesUrl;
    @JsonProperty("videos-url")
    private String videoUrl;
    @JsonProperty("audios-url")
    private String audioUrl;
    @JsonProperty("signup-url")
    private String signupUrl;
    @JsonProperty("state")
    private String state;
    @JsonProperty("created-at")
    private String createdAt;
    @JsonProperty("deleted-at")
    private String deletedAt;
    @JsonProperty("submitted-at")
    private String submittedAt;
    @JsonProperty("is-mail-sent")
    private String isMailSent;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("short-abstract")
    public String getShortAbstract() {
        return shortAbstract;
    }

    @JsonProperty("short-abstract")
    public void setShortAbstract(String shortAbstract) {
        this.shortAbstract = shortAbstract;
    }

    @JsonProperty("long-abstract")
    public String getLongAbstract() {
        return longAbstract;
    }

    @JsonProperty("long-abstract")
    public void setLongAbstract(String longAbstract) {
        this.longAbstract = longAbstract;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("starts-at")
    public String getStartsAt() {
        return startsAt;
    }

    @JsonProperty("starts-at")
    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    @JsonProperty("ends-at")
    public String getEndsAt() {
        return endsAt;
    }

    @JsonProperty("ends-at")
    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("slides-url")
    public String getSlidesUrl() {
        return slidesUrl;
    }

    @JsonProperty("slides-url")
    public void setSlidesUrl(String slidesUrl) {
        this.slidesUrl = slidesUrl;
    }

    @JsonProperty("videos-url")
    public String getVideoUrl() {
        return videoUrl;
    }

    @JsonProperty("videos-url")
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @JsonProperty("audios-url")
    public String getAudioUrl() {
        return audioUrl;
    }

    @JsonProperty("audios-url")
    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    @JsonProperty("signup-url")
    public String getSignupUrl() {
        return signupUrl;
    }

    @JsonProperty("signup-url")
    public void setSignupUrl(String signupUrl) {
        this.signupUrl = signupUrl;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("created-at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created-at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("deleted-at")
    public String getDeletedAt() {
        return deletedAt;
    }

    @JsonProperty("deleted-at")
    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    @JsonProperty("submitted-at")
    public String getSubmittedAt() {
        return submittedAt;
    }

    @JsonProperty("submitted-at")
    public void setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
    }

    @JsonProperty("is-mail-sent")
    public String getIsMailSent() {
        return isMailSent;
    }

    @JsonProperty("is-mail-sent")
    public void setIsMailSent(String isMailSent) {
        this.isMailSent = isMailSent;
    }

    @Override
    public String toString() {
        return "ApiSession{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", level='" + level + '\'' +
                ", short-abstract='" + shortAbstract + '\'' +
                ", long-abstract='" + longAbstract + '\'' +
                ", comments='" + comments + '\'' +
                ", starts-at='" + startsAt + '\'' +
                ", ends-at='" + endsAt + '\'' +
                ", language='" + language + '\'' +
                ", slides-url='" + slidesUrl + '\'' +
                ", videos-url='" + videoUrl + '\'' +
                ", audios-url='" + audioUrl + '\'' +
                ", signup-url='" + signupUrl + '\'' +
                ", state='" + state + '\'' +
                ", created-at='" + createdAt + '\'' +
                ", ends-at='" + endsAt + '\'' +
                ", deleted-at='" + deletedAt + '\'' +
                ", submitted-at='" + submittedAt + '\'' +
                ", is-mail-sent='" + isMailSent + '\'' +
                '}';
    }
}
