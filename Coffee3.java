public class Coffee3{
	public static void makeCoffee(String name, double cost){
		System.out.println("this is coffee 3 class ");
		System.out.println("this is coffee name is : "+ name +" and price" + cost);
		Coffee2.sellCoffee(name, cost);
	}
}