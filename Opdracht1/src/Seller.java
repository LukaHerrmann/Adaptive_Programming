public class Seller {
    private String name;
    private Address returnAdress;

    public Seller(String nm) {
        name = nm;
    }

    public void setReturnAdress(Address returnAdress) {
        this.returnAdress = returnAdress;
    }

    public Address getReturnAdress() {
        return returnAdress;
    }

    public String toString() {
        String adressstring = "";
        if (returnAdress==null) {adressstring="Geen adres gedefinieerd\n";}
        else {adressstring=returnAdress.toString();}
        return "Verkocht door: " + name + ", kan gereturnd worden naar: \n" + adressstring;
    }
}
