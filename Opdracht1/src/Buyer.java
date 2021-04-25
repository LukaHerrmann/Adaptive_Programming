public class Buyer {
    private String name;
    private Address deliveryAdress;

    public Buyer(String nm) {
        name = nm;
    }

    public void setDeliveryAdress(Address deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public Address getDeliveryAdress() {
        return deliveryAdress;
    }

    public String toString() {
        String adressstring = "";
        if (deliveryAdress==null) {adressstring="Geen adres gedefinieerd\n";}
        else {adressstring=deliveryAdress.toString();}
        return "Gekocht door: " + name + ", kan afgeleverd worden op: \n" + adressstring;
    }
}
