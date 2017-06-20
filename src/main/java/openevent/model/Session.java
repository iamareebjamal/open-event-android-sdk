package openevent.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Session {

    private String id;
    private String title;
    private String subtitle;
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
    @JsonProperty("slides")
    private String slidesUrl;
    @JsonProperty("video")
    private String videoUrl;
    @JsonProperty("audio")
    private String audioUrl;
    @JsonProperty("signup-url")
    private String signupUrl;
    private String state;
    @JsonProperty("session-type")
    private SessionType sessionType;
    private Track track;
    private Microlocation microlocation;
    private List<Speaker> speakers;

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

    public SessionType getSessionType() {
        return sessionType;
    }

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
                ", sessionType=" + sessionType +
                ", track=" + track +
                ", microlocation=" + microlocation +
                ", speakers=" + speakers +
                '}';
    }
}
