class Product {
    private int proid;
    private String proname;
    private int price;

    Product(int proid, String proname, int price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }

    public void productDetails() {
        System.out.println(proid + " " + proname + " " + price);
    }
}

public class ProductDetails {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Pen", 20);
        Product product2 = new Product(2, "Pencil", 10);
        Product product3 = new Product(3, "Box", 100);
        Product product4 = new Product(4, "Eraser", 5);
        Product product5 = new Product(5, "Laptop", 50000);

        product1.productDetails();
        product2.productDetails();
        product3.productDetails();
        product4.productDetails();
        product5.productDetails();
    }
}
