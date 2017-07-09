package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;

@Data
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
}
