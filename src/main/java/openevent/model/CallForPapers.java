package openevent.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallForPapers {

    private String announcement;
    @JsonProperty("starts-at")
    private String startsAt;
    private String privacy;
    @JsonProperty("ends-at")
    private String endsAt;

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    @Override
    public String toString() {
        return "CallForPapers{" +
                "announcement='" + announcement + '\'' +
                ", startsAt='" + startsAt + '\'' +
                ", privacy='" + privacy + '\'' +
                ", endsAt='" + endsAt + '\'' +
                '}';
    }
}