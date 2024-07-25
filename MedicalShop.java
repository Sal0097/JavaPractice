public class MedicalShop {
	public static void main(String[] args){
		MedicalShop.order("Crocin");
		MedicalShop.order("Crocin", 2);
		MedicalShop.order("Dhanvi", "abc@mail.com ", 9000000001l , "marathalli , bengaluru , karnataka");
		
	}
	
	
	static void order(String item){
		System.out.println("Name of medicine = " + item ); // intrsnsic
	}
	
	static void order(String item , int quantity){
		System.out.println("Name of medicine = " + item + "Quantity needed = "+ quantity);
	}
	static void order(String name , String email, long mobile ,String address){
		System.out.println("Customer name = " + name + " email id = "+ email + " Mobile number = "+ mobile+ " Address of Customer = "+ address);
	}
}