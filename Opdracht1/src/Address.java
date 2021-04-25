public class Address {
    private String street;
    private String postalCode;
    private String city;
    private String country;

    public Address(String str, String pc, String cy, String ctry) {
        street = str;
        postalCode = pc;
        city = cy;
        country = ctry;
    }

    public String toString() {
        return street + "\n" + postalCode + " "+ city + "\n" + country + "\n";
    }
}
