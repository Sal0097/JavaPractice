public class Hotel {
	public static void main(String[] args) { 

        Hotel.takeOrder("Burger");
        Hotel.takeOrder("Idli", "not found");
        Hotel.takeOrder("vada", "not found", 3);
    }
    // Method to take item
    public static void takeOrder(String item) {
        System.out.println("Order item: " + item);
    }

    // Method to take item and price
    public static void takeOrder(String item, String price) {
        System.out.println("Order item: " + item + " with price: Rs " + price);
    }

    // Method to take item, price and quantity
    public static void takeOrder(String item, String price, int quantity) {
		if (quantity<1 || quantity>10){
        System.out.println("NO");	
		} else{
        System.out.println("YES");
		}
	}
}