public class ShoppingCartTest {
    public static void main(String[] args) {
        //사용자 만들기
        User user = new User("user1","이수연","서울","010-1234-1234");
        //사용자 정보 조회
        user.printMyInfo();
        System.out.println();

        //사용자 정보 업데이트
        user.updateUserInfo(user,"홍길동","부산","010-4567-4567");
        //사용자 정보 조회
        user.printMyInfo();
        System.out.println();


        //장바구니에 들어갈 상품 선택
        Product p1 = new Product("신발",50_000,1,Category.CLOTHES);
        Product p2 = new Product("노트",3_000,4,Category.ETC);
        Product p3 = new Product("손톱깎이",2_000,1,Category.ETC);
        Product p4 = new Product("컵라면",1_500,5,Category.FOOD);
        Product p5 = new Product("가방",7_000,1,Category.ETC);
        Product p6 = new Product("신라면",1_000,3,Category.FOOD);

        //상품 넣고 출력해보기
        user.addProduct(p1); //신발
        user.addProduct(p2); //노트
        user.addProduct(p3); //손톱깎이
        user.addProduct(p4); //컵라면
        user.addProduct(p5); //가방
        user.addProduct(p6); //신라면

        //일반 출력
        System.out.println("*** 일반 출력 ***");
        user.viewProducts();
        System.out.println();

        //수량 많은 순 정렬 출력
        System.out.println("*** 수량 많은순 출력 ***");
        user.viewMaxQuantityProducts();
        System.out.println();

        //가격 합계 높은 순 출력
        System.out.println("*** 가격 합계 높은 순 출력");
        user.viewMaxTotalPriceProducts();
        System.out.println();

        //가나다 순 정렬
        System.out.println("*** 상품명 가나다 순 정렬");
        user.viewNameWordAlignProducts();
        System.out.println();


        //가격 합계가 만원 이상인 상품 보기
        System.out.println("*** 가격합계가 만원 이상인 상품 필터 ***");
        user.viewHighPriceFilterProducts();
        System.out.println();

        //상품 이름에 검색 키워드 포함된 상품 보기
        System.out.println("*** 상품 이름에 검색 키워드 포함 필터 ***");
        user.viewSearchNameProducts("라면");
        System.out.println();
        user.viewSearchNameProducts("우동");
        System.out.println();

        //해당 카테고리의 상품 보기
        System.out.println("*** 원하는 카테고리의 상품 보기 필터 ***");
        user.viewProductsFilteredByCategory(Category.ETC);
        System.out.println();
        user.viewProductsFilteredByCategory(Category.DEVICE);
        System.out.println();

        //신발 상품 삭제하고 출력해보기
//        System.out.println();
//        System.out.println("*** 신발 삭제하고 출력 ***");
//        user.deleteProduct(p1);
//        user.viewProducts();

    }
}
