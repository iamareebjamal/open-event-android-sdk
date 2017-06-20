package openevent.model;

import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

@Type("social-link")
public class SocialLink {

    @Id
    private String id;
    private String link;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SocialLink{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}