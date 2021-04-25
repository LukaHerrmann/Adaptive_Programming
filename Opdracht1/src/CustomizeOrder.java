public interface CustomizeOrder {
    void setBuyer(Buyer byr);

    Buyer getBuyer();

    void setSeller(Seller slr);

    Seller getSeller();

    void setProduct(Product prd);

    Product getProduct();

    String toString();
}
