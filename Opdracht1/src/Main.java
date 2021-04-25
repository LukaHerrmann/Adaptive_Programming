public class Main {
    public static void main(String[] arg) {
        Adress adr1 = new Adress("Nagtglasstraat 26", "4331 WJ", "Middelburg", "Nederland");

        Buyer b1 = new Buyer("Willem");
        b1.setDeliveryAdress(adr1);

        Seller s1 = new Seller("Josef");
        s1.setReturnAdress(adr1);
        System.out.println(b1);
        System.out.println(s1);

        Product p1 = new Product("broodje");
        p1.setPrice(10.69);
        System.out.println(p1);
    }
}
