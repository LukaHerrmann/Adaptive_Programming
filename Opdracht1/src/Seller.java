public class Seller {
    private String name;
    private Adress returnAdress;

    public Seller(String nm) {
        name = nm;
    }

    public void setReturnAdress(Adress returnAdress) {
        this.returnAdress = returnAdress;
    }

    public Adress getReturnAdress() {
        return returnAdress;
    }

    public String toString() {
        return "Verkocht door: " + name + ", kan gereturnd worden naar: \n" + returnAdress.toString();
    }
}
