public class Product{
	public static void main(String[] args){
		System.out.println("the product name is :"+ Product.name());
		System.out.println("the price is :"+ Product.price());
		System.out.println(Product.quantity(4));
		System.out.println("the quality is :"+ quality());
		System.out.println("the date is :"+ date());
		System.out.println("the brand name is :"+ brand());

	}
	
	public static String name(){
		return "Shoes";
		
	}
	public static int price(){
		return 99 ;
	}
	public static int quantity(int quant1){
		System.out.println("the quantity is :"+ quant1);
		return 3 ;
	}
	public static String quality(){
		return "Excellent";
	}
	public static String date(){
		return "15/07/2024";
	}
	public static String brand(){
		return "Abibas";
	}
	
	
}