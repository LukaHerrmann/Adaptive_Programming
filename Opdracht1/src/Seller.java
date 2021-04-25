public class Seller {
    private String name;
    private Address returnAddress;

    public Seller(String nm) {
        name = nm;
    }

    public void setReturnAddress(Address returnAdress) {
        this.returnAddress = returnAdress;
    }

    public Address getReturnAddress() {
        return returnAddress;
    }

    public String toString() {
        String adressstring = "";
        if (returnAddress==null) {adressstring="Geen adres gedefinieerd\n";}
        else {adressstring=returnAddress.toString();}
        return "Verkocht door: " + name + ", kan gereturnd worden naar: \n" + adressstring;
    }
}
