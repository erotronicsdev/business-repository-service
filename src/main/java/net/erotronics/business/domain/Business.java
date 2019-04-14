package net.erotronics.business.domain;

import javax.persistence.Entity;

@Entity
public class Business {

    private String id;
    private String businessName;
    private String businessLocation;
    private String webAddress;
    private String phoneNumber;
    private String emailAddress;

public Business() {}

public Business(String id, String businessName, String businessLocation, String webAddress, String phoneNumber,
                String emailAddress) {
    this.id = id;
    this.businessName = businessName;
    this.businessLocation = businessLocation;
    this.webAddress = webAddress;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
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
}
