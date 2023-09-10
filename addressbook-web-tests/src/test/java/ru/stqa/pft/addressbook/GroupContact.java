package ru.stqa.pft.addressbook;

public class GroupContact {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String company;
    private final String address;
    private final String homeNumberPhone;
    private final String mobileNumberPhone;
    private final String workNumberPhone;
    private final String email1;
    private final String email2;
    private final String email3;
    private final String address2;
    private final String numberPhone2;
    private final String notes;

    public GroupContact(String firstname, String middlename, String lastname, String Company, String address, String homeNumberPhone, String mobileNumberPhone, String workNumberPhone, String email1, String email2, String email3, String address2, String numberPhone2, String notes) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        company = Company;
        this.address = address;
        this.homeNumberPhone = homeNumberPhone;
        this.mobileNumberPhone = mobileNumberPhone;
        this.workNumberPhone = workNumberPhone;
        this.email1 = email1;
        this.email2 = email2;
        this.email3 = email3;
        this.address2 = address2;
        this.numberPhone2 = numberPhone2;
        this.notes = notes;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomeNumberPhone() {
        return homeNumberPhone;
    }

    public String getMobileNumberPhone() {
        return mobileNumberPhone;
    }

    public String getWorkNumberPhone() {
        return workNumberPhone;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }

    public String getAddress2() {
        return address2;
    }

    public String getNumberPhone2() {
        return numberPhone2;
    }

    public String getNotes() {
        return notes;
    }
}
