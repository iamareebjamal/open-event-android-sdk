package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

@Type("user")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class User {
    
    @Id(IntegerIdHandler.class)
    private int id;

    private boolean isAdmin;
    private String lastName;
    private String instagramUrl;
    private boolean isSuperAdmin;
    private String thumbnailImageUrl;
    private String createdAt;
    private String lastAccessedAt;
    private String email;
    private String iconImageUrl;
    private String contact;
    private String deletedAt;
    private String smallImageUrl;
    private String facebookUrl;
    private String details;
    private boolean isVerified;
    private String firstName;
    private String avatarUrl;
    private String twitterUrl;
    private String googlePlusUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public boolean getIsSuperAdmin() {
        return isSuperAdmin;
    }

    public void setIsSuperAdmin(boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }

    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public void setThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLastAccessedAt() {
        return lastAccessedAt;
    }

    public void setLastAccessedAt(String lastAccessedAt) {
        this.lastAccessedAt = lastAccessedAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public void setIconImageUrl(String iconImageUrl) {
        this.iconImageUrl = iconImageUrl;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean verified) {
        isVerified = verified;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getGooglePlusUrl() {
        return googlePlusUrl;
    }

    public void setGooglePlusUrl(String googlePlusUrl) {
        this.googlePlusUrl = googlePlusUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", isAdmin=" + isAdmin +
                ", lastName='" + lastName + '\'' +
                ", instagramUrl='" + instagramUrl + '\'' +
                ", isSuperAdmin=" + isSuperAdmin +
                ", thumbnailImageUrl='" + thumbnailImageUrl + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", lastAccessedAt='" + lastAccessedAt + '\'' +
                ", email='" + email + '\'' +
                ", iconImageUrl='" + iconImageUrl + '\'' +
                ", contact='" + contact + '\'' +
                ", deletedAt='" + deletedAt + '\'' +
                ", smallImageUrl='" + smallImageUrl + '\'' +
                ", facebookUrl='" + facebookUrl + '\'' +
                ", details='" + details + '\'' +
                ", isVerified=" + isVerified +
                ", firstName='" + firstName + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", twitterUrl='" + twitterUrl + '\'' +
                ", googlePlusUrl='" + googlePlusUrl + '\'' +
                '}';
    }
}
