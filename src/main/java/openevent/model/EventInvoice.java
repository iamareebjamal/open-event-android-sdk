package openevent.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.IntegerIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

@Type("event-invoice")
public class EventInvoice {

    @Id(IntegerIdHandler.class)
    private int id;
    
    private String status;
    private String city;
    private String identifier;
    @JsonProperty("paypal-token")
    private String paypalToken;
    @JsonProperty("exp-year")
    private String expYear;
    @JsonProperty("transaction-id")
    private String transactionId;
    private String country;
    private String brand;
    @JsonProperty("created-at")
    private String createdAt;
    private String zipcode;
    @JsonProperty("payment-mode")
    private String paymentMode;
    @JsonProperty("stripe-token")
    private String stripeToken;
    private String last4;
    private String state;
    private String address;
    @JsonProperty("exp-month")
    private String expMonth;
    private double amount;
    @JsonProperty("completed-at")
    private String completedAt;
    @JsonProperty("paid-via")
    private String paidVia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getPaypalToken() {
        return paypalToken;
    }

    public void setPaypalToken(String paypalToken) {
        this.paypalToken = paypalToken;
    }

    public String getExpYear() {
        return expYear;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getStripeToken() {
        return stripeToken;
    }

    public void setStripeToken(String stripeToken) {
        this.stripeToken = stripeToken;
    }

    public String getLast4() {
        return last4;
    }

    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public String getPaidVia() {
        return paidVia;
    }

    public void setPaidVia(String paidVia) {
        this.paidVia = paidVia;
    }

    @Override
    public String toString() {
        return "EventInvoice{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", city='" + city + '\'' +
                ", identifier='" + identifier + '\'' +
                ", paypalToken='" + paypalToken + '\'' +
                ", expYear='" + expYear + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", country='" + country + '\'' +
                ", brand='" + brand + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", stripeToken='" + stripeToken + '\'' +
                ", last4='" + last4 + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", expMonth='" + expMonth + '\'' +
                ", amount=" + amount +
                ", completedAt='" + completedAt + '\'' +
                ", paidVia='" + paidVia + '\'' +
                '}';
    }
}
