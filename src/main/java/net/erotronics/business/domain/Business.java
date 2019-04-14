package net.erotronics.business.domain;



import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "business")
public class Business {

    @Id
    private String id;
    private String businessName;
    private String businessLocation;
    private String webAddress;
    private String phoneNumber;
    private String emailAddress;
    private String category;

public Business() {}

public Business(String id, String businessName, String businessLocation, String webAddress, String phoneNumber,
                String emailAddress, String category) {
    this.id = id;
    this.businessName = businessName;
    this.businessLocation = businessLocation;
    this.webAddress = webAddress;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.category = category;
}

    public String getId() {
        return id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getBusinessLocation() {
        return businessLocation;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getCategory() {
        return category;
    }
}
