public class Buyer {
    private String name;
    private Adress deliveryAdress;

    public Buyer(String nm) {
        name = nm;
    }

    public void setDeliveryAdress(Adress deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public Adress getDeliveryAdress() {
        return deliveryAdress;
    }

    public String toString() {
        return "Gekocht door: " + name + ", kan afgeleverd worden op: \n" + deliveryAdress.toString();
    }
}
