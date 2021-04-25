public class Buyer {
    private String name;
    private Address deliveryAddress;

    public Buyer(String nm) {
        name = nm;
    }

    public void setDeliveryAdress(Address deliveryAdress) {
        this.deliveryAddress = deliveryAdress;
    }

    public Address getDeliveryAdress() {
        return deliveryAddress;
    }

    public String toString() {
        String adressstring = "";
        if (deliveryAddress==null) {adressstring="Geen adres gedefinieerd\n";}
        else {adressstring=deliveryAddress.toString();}
        return "Gekocht door: " + name + ", kan afgeleverd worden op: \n" + adressstring;
    }
}
