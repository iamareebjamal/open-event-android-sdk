package openevent.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import openevent.model.Microlocation;
import openevent.model.SessionType;

import java.util.List;

@Type("session")
public class ApiSession {

    @Id
    private String id;
    private String title;
    private String subtitle;
    private String level;
    @JsonProperty("short-abstract")
    private String shortAbstract;
    @JsonProperty("long-abstract")
    private String longAbstract;
    private String comments;
    @JsonProperty("starts-at")
    private String startsAt;
    @JsonProperty("ends-at")
    private String endsAt;
    private String language;
    @JsonProperty("slides-url")
    private String slidesUrl;
    @JsonProperty("videos-url")
    private String videoUrl;
    @JsonProperty("audios-url")
    private String audioUrl;
    @JsonProperty("signup-url")
    private String signupUrl;
    private String state;
    @JsonProperty("created-at")
    private String createdAt;
    @JsonProperty("deleted-at")
    private String deletedAt;
    @JsonProperty("submitted-at")
    private String submittedAt;
    @JsonProperty("is-mail-sent")
    private String isMailSent;

    @Relationship("session-type")
    private SessionType sessionType;

    @Relationship("track")
    private ApiTrack track;

    @Relationship("microlocation")
    private Microlocation microlocation;

    @Relationship("speakers")
    private List<ApiSpeaker> speakers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getShortAbstract() {
        return shortAbstract;
    }

    public void setShortAbstract(String shortAbstract) {
        this.shortAbstract = shortAbstract;
    }

    public String getLongAbstract() {
        return longAbstract;
    }

    public void setLongAbstract(String longAbstract) {
        this.longAbstract = longAbstract;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSlidesUrl() {
        return slidesUrl;
    }

    public void setSlidesUrl(String slidesUrl) {
        this.slidesUrl = slidesUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getSignupUrl() {
        return signupUrl;
    }

    public void setSignupUrl(String signupUrl) {
        this.signupUrl = signupUrl;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
    }

    public String getIsMailSent() {
        return isMailSent;
    }

    public void setIsMailSent(String isMailSent) {
        this.isMailSent = isMailSent;
    }

    public SessionType getSessionType() {
        return sessionType;
    }

    public void setSessionType(SessionType sessionType) {
        this.sessionType = sessionType;
    }

    public ApiTrack getTrack() {
        return track;
    }

    public void setTrack(ApiTrack track) {
        this.track = track;
    }

    public Microlocation getMicrolocation() {
        return microlocation;
    }

    public void setMicrolocation(Microlocation microlocation) {
        this.microlocation = microlocation;
    }

    public List<ApiSpeaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<ApiSpeaker> speakers) {
        this.speakers = speakers;
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
                ", session-type='" + sessionType + '\'' +
                ", track='" + track + '\'' +
                ", microlocation='" + microlocation + '\'' +
                ", speakers='" + speakers + '\'' +
                '}';
    }
}
