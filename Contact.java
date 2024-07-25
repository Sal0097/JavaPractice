public class Contact{
	public static void main(String[] args){
		String aah = SaloonMethod.service("haircut");
		System.out.println("The service is = "+ aah);
		int price1 =1;
		System.out.println("The price is in main class = $ "+ price1);
		
	}

	public class name{
		public static String service(String saloonService){
			int price =0;
			System.out.println("The mobile number is = $ "+ price); // explicit call of variable
			if (saloonService == "anjan"){
			
			return "Haircut";
			}
			if (saloonService == "ravi"){
			return "Hair Color";
			}
			if (saloonService == "sahil"){
		
			
			return "Spa";
			}
			if (saloonService == "dhruva"){
			
			
			return "Facial";
			}
			if (saloonService == "karthik"){
			
			
			return "Pedicure";
			}
			if (saloonService == "tarun"){
			
			
			return "tarun";
			}
			if (saloonService == "shashank"){
			
			
			return "shashank";
			}
				// int price =1;
				// System.out.println("The price is = $ "+ price); // explicit call of variable will NOT WORK cause if condition satisfies it exits loop
			return "please select a valid service";
		}
	}
}