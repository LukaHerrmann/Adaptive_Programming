public class Main {
    public static void main(String[] arg) {
        Address adr1 = new Address("Nagtglasstraat 26", "4331 WJ", "Middelburg", "Nederland");
        Address adr2 = new Address("Heidelberglaand 15", "3584 CS", "Utrecht", "Nederland");
        Order o1 = new Order(26, 4, 2021);
        Order o2 = new Order(16, 9, 2011);
        Buyer b1 = new Buyer("Luka Herrmann");
        b1.setDeliveryAdress(adr1);
        Seller s1 = new Seller("Willem de Vries");
        s1.setReturnAddress(adr2);
        Product p1 = new Product("Badkuip");
        p1.setPrice(199.99);
        Product p2 = new Product("Fiets");
        o1.setBuyer(b1);
        o1.setSeller(s1);
        o1.setProduct(p1);
        o2.setProduct(p2);
        System.out.println("Eerste order:\n" + o1);
        System.out.println("Tweede order:\n" + o2);
        System.out.println(o2.getProduct());
        System.out.println(o1.getBuyer());
    }
}
