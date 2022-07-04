package main.day9;
import java.util.Scanner

public class Addressbook {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private  String state;
    private  long zip;
    private  long phoneNumber;
    private  String email;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address=address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city=city;
    }
    public long getZip() {
        return zip;
    }
    public void setZip(long zip) {
        this.zip = zip;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }

    public String toString() {
        return "AddressBook[firstName=" +firstName+",  lastName="+ lastName+" ,address=" +address+", city=" +city+" ,state=" +state+ ",zip=" +zip+", phoneNumber="+phoneNumber+", email="+email+"]";

    }
    public Addressbook(String firstName, String lastName, String address, String city, String state, long phoneNumber,
                       long zip, String email) {
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;

    }

}


