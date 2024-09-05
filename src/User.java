import java.util.List;

public class User {
    private final String userId;
    private String name;
    private String address;
    private String phoneNum;


    private final Cart cart = new Cart();
    private final List<Product> myShoppingCart = cart.getShoppingCart();

    User(String userId, String name, String address, String phoneNum){
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    public void updateUserInfo(User user,String newName,String newAddress,String newPhoneNum){
        user.setName(newName);
        user.setAddress(newAddress);
        user.setPhoneNum(newPhoneNum);
    }

    public void addProduct(Product product){
        myShoppingCart.add(product);
    }

    public void deleteProduct(Product product){
        myShoppingCart.remove(product);
    }
    public void viewProducts(){
        printProduct(myShoppingCart);
    }
    public void viewMaxQuantityProducts(){
        printProduct(cart.maxQuantityAlign(myShoppingCart));
    }
    public void viewMaxTotalPriceProducts(){
        printProduct(cart.maxTotalPriceAlign(myShoppingCart));
    }
    public void viewNameWordAlignProducts(){
        printProduct(cart.nameWordAlign(myShoppingCart));
    }
    public void viewHighPriceFilterProducts(){
        List<Product> filteredProducts = cart.highPriceFilter(myShoppingCart);
        System.out.println("가격 합계가 만원 이상인 상품을 검색합니다...");
        if (!filteredProducts.isEmpty()){
            printProduct(filteredProducts);
        }else {
            System.out.println("가격 합계가 만원 이상인 상품이 없습니다!");
        }
    }
    public void viewSearchNameProducts(String keyword){
        List<Product> searchedProducts = cart.searchProductsFilter(myShoppingCart,keyword);
        System.out.println(keyword+"으로 검색합니다...");
        if(!searchedProducts.isEmpty()){
            printProduct(searchedProducts);
        }else {
            System.out.println(keyword+"으로 검색된 상품이 없습니다!");
        }
    }
    public void viewProductsFilteredByCategory(Category category){
        List<Product> filteredProducts = cart.categoryAlignFilter(myShoppingCart,category);
        System.out.println(category.getCategoryNmae()+" 카테고리의 상품을 검색합니다...");
        if(!filteredProducts.isEmpty()){
            printProduct(filteredProducts);
        }else {
            System.out.println(category.getCategoryNmae()+" 카테고리인 상품이 없습니다!");
        }
    }


    public void printProduct(List<Product> products){
        System.out.println("===== "+this.getName()+"님의 장바구니 =====");
        for (Product product : products) {
            System.out.print("상품명: "+product.getProductName()+", ");
            System.out.print("카테고리: "+product.getCategory().getCategoryNmae()+", ");
            System.out.print("가격: "+product.getPrice()+", ");
            System.out.print("수량: "+product.getQuantity()+", ");
            System.out.print("가격 합계: "+product.getTotalPrice());
            System.out.println();
        }
    }

    public void printMyInfo(){
        System.out.println("===== "+this.getName()+"님의 정보 ===");
        System.out.println("아이디: "+this.getUserId());
        System.out.println("주소: "+this.getAddress());
        System.out.println("전화번호: "+this.getPhoneNum());
    }
    //userId의 setter 는 만들지 않을것

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

}
