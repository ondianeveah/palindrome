package ThursdayHomework;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShoppingCart cartContents = new ShoppingCart("Kale and chicken");
        cartContents.addToCart();
        cartContents.removeFromCart();
        cartContents.checkout();
}
}