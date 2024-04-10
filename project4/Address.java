package project4;

public class Address {
    public String street;
    public int houseNumber;
    public String city;
    public String state;
    public int zip;
    public int appartmentNumber;

    public void setAddress(String street, int houseNumber, String city, String state, int zip) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.appartmentNumber = appartmentNumber;
    }

    public void appartmentAddress(int appartmentNumber) {
        this.appartmentNumber = appartmentNumber;
    }

    public void printAddress(Address address) {
        System.out.println(houseNumber + " " + street + " " + appartmentNumber);
        System.out.println(city + " " + state + " " + zip);
    }
    public void printAppartmentAddress(Address address) {
        System.out.println(houseNumber + " " + street + "Appartment " + appartmentNumber);
        System.out.println(city + " " + state + " " + zip);
    }


}
