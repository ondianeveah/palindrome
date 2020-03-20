package ThursdayHomework;
//properties
public class ShoppingCart {
    public String cartContents;

    // constructor
    public ShoppingCart(String cartContents) {
        this.cartContents = cartContents;
    } //method

    public void addToCart() {
        System.out.println(cartContents + " added to cart.");
        }
        public void removeFromCart(){
            System.out.println(cartContents + " removed from cart.");
    }
    public void checkout(){
        System.out.println(cartContents + " checked out from cart.");
    }
}



