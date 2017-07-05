package openevent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class Copyright {

    private String holder;
    private String holderUrl;
    private String licence;
    private String licenceUrl;
    private String logo;
    private int year;

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getHolderUrl() {
        return holderUrl;
    }

    public void setHolderUrl(String holderUrl) {
        this.holderUrl = holderUrl;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getLicenceUrl() {
        return licenceUrl;
    }

    public void setLicenceUrl(String licenceUrl) {
        this.licenceUrl = licenceUrl;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Copyright{" +
                "holder='" + holder + '\'' +
                ", holderUrl='" + holderUrl + '\'' +
                ", licence='" + licence + '\'' +
                ", licenceUrl='" + licenceUrl + '\'' +
                ", logo='" + logo + '\'' +
                ", year=" + year +
                '}';
    }
}