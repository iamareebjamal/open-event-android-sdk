package openevent.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

@Type("ticket")
public class Ticket {
    
    @Id(IntegerIdHandler.class)
    private int id;

    private String name;
    private String description;
    private String type;
    private double price;
    private int quantity;
    @JsonProperty("description-toggle")
    private boolean descriptionToggle;
    private String position;
    @JsonProperty("is-fee-absorbed")
    private String isFeeAbsorbed;
    @JsonProperty("sales-starts-at")
    private String salesStartsAt;
    @JsonProperty("sales-ends-at")
    private String salesEndsAt;
    @JsonProperty("is-hidden")
    private boolean isHidden;
    @JsonProperty("min-order")
    private int minOrder;
    @JsonProperty("max-order")
    private int maxOrder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isDescriptionToggle() {
        return descriptionToggle;
    }

    public void setDescriptionToggle(boolean descriptionToggle) {
        this.descriptionToggle = descriptionToggle;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIsFeeAbsorbed() {
        return isFeeAbsorbed;
    }

    public void setIsFeeAbsorbed(String isFeeAbsorbed) {
        this.isFeeAbsorbed = isFeeAbsorbed;
    }

    public String getSalesStartsAt() {
        return salesStartsAt;
    }

    public void setSalesStartsAt(String salesStartsAt) {
        this.salesStartsAt = salesStartsAt;
    }

    public String getSalesEndsAt() {
        return salesEndsAt;
    }

    public void setSalesEndsAt(String salesEndsAt) {
        this.salesEndsAt = salesEndsAt;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public int getMinOrder() {
        return minOrder;
    }

    public void setMinOrder(int minOrder) {
        this.minOrder = minOrder;
    }

    public int getMaxOrder() {
        return maxOrder;
    }

    public void setMaxOrder(int maxOrder) {
        this.maxOrder = maxOrder;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", descriptionToggle=" + descriptionToggle +
                ", position='" + position + '\'' +
                ", isFeeAbsorbed='" + isFeeAbsorbed + '\'' +
                ", salesStartsAt='" + salesStartsAt + '\'' +
                ", salesEndsAt='" + salesEndsAt + '\'' +
                ", isHidden=" + isHidden +
                ", minOrder=" + minOrder +
                ", maxOrder=" + maxOrder +
                '}';
    }
}
