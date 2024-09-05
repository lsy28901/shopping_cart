import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> shoppingCart = new ArrayList<>();

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    //수량 순 정렬
    public List<Product> maxQuantityAlign(List<Product> myCart){
        return myCart.stream().sorted((p1, p2) -> p2.getQuantity() - p1.getQuantity()).toList();
    }
    //가격 합계 순 정렬
    public List<Product> maxTotalPriceAlign(List<Product> myCart){
        return myCart.stream().sorted((p1, p2) -> p2.getTotalPrice()- p1.getTotalPrice()).toList();
    }
    //이름 가나다 순 정렬
    public List<Product> nameWordAlign(List<Product> myCart){
        return myCart.stream().sorted((p1, p2) -> p1.getProductName().compareTo(p2.getProductName())).toList();
    }

    //가격이 10000원 이상인 상품 필터
    public List<Product> highPriceFilter(List<Product> myCart){
        return myCart.stream().filter(p -> p.getTotalPrice() > 10_000).toList();
    }
    //검색 키워드가 상품 이름에 포함된 필터
    public List<Product> searchProductsFilter(List<Product> myCart, String keyword){
        return myCart.stream().filter(p -> p.getProductName().contains(keyword)).toList();
    }
    //카테고리 별로 정렬된 상품 필터
    public List<Product> categoryAlignFilter(List<Product> myCart, Category category){
        return myCart.stream().filter(p -> p.getCategory().equals(category)).toList();
    }



}
