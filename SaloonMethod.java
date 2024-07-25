public class SaloonMethod{
	public static String service(String saloonService){
		int price =1;
		System.out.println("The price is = $ "+ price); // explicit call of variable
		if (saloonService == "haircut"){
			
			return "Haircut";
		}
		if (saloonService == "hairColor"){
			return "Hair Color price : 100";
		}
		if (saloonService == "spa"){
		
			
			return "Spa price :200 ";
		}
		if (saloonService == "facial"){
			
			
			return "Facial price :300";
		}
		if (saloonService == "pedicure"){
			
			
			return "Pedicure price: 400";
		}
		if (saloonService == "headMassage"){
			
			
			return "Head Massage price :700";
		}
		if (saloonService == "trimming"){
			
			
			return "Trimming price : 150";
		}
		// int price =1;
		// System.out.println("The price is = $ "+ price); // explicit call of variable will NOT WORK cause if condition satisfies it exits loop
		return "please select a valid service";
	}
}