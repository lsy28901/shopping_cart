public enum Category {
    FOOD("음식"),
    CLOTHES("의류"),
    ETC("잡화"),
    DEVICE("전자기기");

    private final String categoryName;
    Category(String categoryName){
        this.categoryName = categoryName;
    }

    public String getCategoryNmae(){
        return this.categoryName;
    }
}
