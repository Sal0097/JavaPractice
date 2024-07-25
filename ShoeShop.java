public class ShoeShop {
    public static double purchase(String brand) {
        double price = ShoeFactory.order(brand);
        return price;
    }
}