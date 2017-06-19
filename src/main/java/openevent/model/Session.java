package openevent.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "title",
        "subtitle",
        "short-abstract",
        "long-abstract",
        "comments",
        "starts-at",
        "ends-at",
        "session-type",
        "track",
        "language",
        "slides",
        "videos",
        "audios",
        "signup-url",
        "microlocation",
        "speakers",
        "state"
})
public class Session {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("subtitle")
    private String subtitle;
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
    @JsonProperty("slides")
    private String slidesUrl;
    @JsonProperty("video")
    private String videoUrl;
    @JsonProperty("audio")
    private String audioUrl;
    @JsonProperty("signup-url")
    private String signupUrl;
    @JsonProperty("state")
    private String state;
    @JsonProperty("session-type")
    private SessionType sessionType;
    @JsonProperty("track")
    private Track track;
    @JsonProperty("microlocation")
    private Microlocation microlocation;
    @JsonProperty("speakers")
    private List<Speaker> speakers;

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

    @JsonProperty("slides")
    public String getSlidesUrl() {
        return slidesUrl;
    }

    @JsonProperty("slides")
    public void setSlidesUrl(String slidesUrl) {
        this.slidesUrl = slidesUrl;
    }

    @JsonProperty("video")
    public String getVideoUrl() {
        return videoUrl;
    }

    @JsonProperty("video")
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @JsonProperty("audio")
    public String getAudioUrl() {
        return audioUrl;
    }

    @JsonProperty("audio")
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

    @JsonProperty("session-type")
    public SessionType getSessionType() {
        return sessionType;
    }

    @JsonProperty("session-type")
    public void setSessionType(SessionType sessionType) {
        this.sessionType = sessionType;
    }

    @JsonProperty("track")
    public Track getTrack() {
        return track;
    }

    @JsonProperty("track")
    public void setTrack(Track track) {
        this.track = track;
    }

    @JsonProperty("microlocation")
    public Microlocation getMicrolocation() {
        return microlocation;
    }

    @JsonProperty("microlocation")
    public void setMicrolocation(Microlocation microlocation) {
        this.microlocation = microlocation;
    }

    @JsonProperty("speakers")
    public List<Speaker> getSpeakers() {
        return speakers;
    }

    @JsonProperty("speakers")
    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    @Override
    public String toString() {
        return "ApiSession{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", short-abstract='" + shortAbstract + '\'' +
                ", long-abstract='" + longAbstract + '\'' +
                ", comments='" + comments + '\'' +
                ", starts-at='" + startsAt + '\'' +
                ", ends-at='" + endsAt + '\'' +
                ", session-type='" + sessionType + '\'' +
                ", track='" + track + '\'' +
                ", language='" + language + '\'' +
                ", slides='" + slidesUrl + '\'' +
                ", video='" + videoUrl + '\'' +
                ", audio='" + audioUrl + '\'' +
                ", signup-url='" + signupUrl + '\'' +
                ", microlocation='" + microlocation + '\'' +
                ", speakers='" + speakers + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
