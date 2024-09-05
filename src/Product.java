
public class Product {
    private String productName;
    private int price;
    private int quantity;
    private int totalPrice;
    private final Category category;



    Product(String productName, int price, int quantity, Category category){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = price * quantity;
        this.category = category;
    }


    //Getter Setter
    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public Category getCategory() {
        return category;
    }

}
