public class Coffee2{
	public static void sellCoffee(String name, double cost){
		System.out.println("this is coffee 2 class ");
		System.out.println("this is coffee name is : "+ name +" and price" + cost);
		Coffee1.drinkCoffee(name, cost);
	}
}