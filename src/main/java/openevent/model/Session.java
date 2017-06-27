package openevent.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;

import java.util.List;

@Type("session")
public class Session {

    @Id(IntegerIdHandler.class)
    private int id;
    private String title;
    private String subtitle;
    private String level;
    private String shortAbstract;
    private String longAbstract;
    private String comments;
    private String startsAt;
    private String endsAt;
    private String language;
    private String slidesUrl;
    private String videoUrl;
    private String audioUrl;
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
    private Track track;

    @Relationship("microlocation")
    private Microlocation microlocation;

    @Relationship("speakers")
    private List<Speaker> speakers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @JsonSetter("short-abstract")
    public void setShortAbstract(String shortAbstract) {
        this.shortAbstract = shortAbstract;
    }

    @JsonSetter("short_abstract")
    private void setShortAbstractForOldModel(String shortAbstract) {
        this.shortAbstract = shortAbstract;
    }

    public String getLongAbstract() {
        return longAbstract;
    }

    @JsonSetter("long-abstract")
    public void setLongAbstract(String longAbstract) {
        this.longAbstract = longAbstract;
    }

    @JsonSetter("long_abstract")
    private void setLongAbstractForOldModel(String longAbstract) {
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

    @JsonSetter("starts-at")
    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    @JsonSetter("start_time")
    private void setStartsAtForOldModel(String startsAt) {
        this.startsAt = startsAt;
    }

    public String getEndsAt() {
        return endsAt;
    }

    @JsonSetter("ends-at")
    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    @JsonSetter("end_time")
    private void setEndsAtForOldModel(String endsAt) {
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

    @JsonSetter("slides-url")
    public void setSlidesUrl(String slidesUrl) {
        this.slidesUrl = slidesUrl;
    }

    @JsonSetter("slides")
    private void setSlidesUrlForOldModel(String slidesUrl) {
        this.slidesUrl = slidesUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    @JsonSetter("videos-url")
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @JsonSetter("video")
    private void setVideoUrlForOldModel(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    @JsonSetter("audios-url")
    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    @JsonSetter("audio")
    private void setAudioUrlForOldModel(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getSignupUrl() {
        return signupUrl;
    }

    @JsonSetter("signup-url")
    public void setSignupUrl(String signupUrl) {
        this.signupUrl = signupUrl;
    }

    @JsonSetter("signup_url")
    private void setSignupUrlForOldModel(String signupUrl) {
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

    public SessionType getSessionTypeForOldModel() {
        return sessionType;
    }

    @JsonSetter("session_type")
    private void setSessionTypeForOldModel(SessionType sessionType) {
        this.sessionType = sessionType;
    }

    @JsonSetter("session-type")
    public void setSessionType(SessionType sessionType) {
        this.sessionType = sessionType;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Microlocation getMicrolocation() {
        return microlocation;
    }

    public void setMicrolocation(Microlocation microlocation) {
        this.microlocation = microlocation;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", level='" + level + '\'' +
                ", shortAbstract='" + shortAbstract + '\'' +
                ", longAbstract='" + longAbstract + '\'' +
                ", comments='" + comments + '\'' +
                ", startsAt='" + startsAt + '\'' +
                ", endsAt='" + endsAt + '\'' +
                ", language='" + language + '\'' +
                ", slidesUrl='" + slidesUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", audioUrl='" + audioUrl + '\'' +
                ", signupUrl='" + signupUrl + '\'' +
                ", state='" + state + '\'' +
                ", created-at='" + createdAt + '\'' +
                ", deleted-at='" + deletedAt + '\'' +
                ", submitted-at='" + submittedAt + '\'' +
                ", is-mail-sent='" + isMailSent + '\'' +
                ", sessionType=" + sessionType +
                ", track=" + track +
                ", microlocation=" + microlocation +
                ", speakers=" + speakers +
                '}';
    }
}
