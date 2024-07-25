class Primitives{
	public static void main(String[] args){
		Primitives.voting(18);
		Primitives.marriage(17);
		Primitives.policeService(18 , 5.9 , 70);
		Primitives.product(25 , 3 , 560037, 7259516937l );
		Primitives.aadhar(789534567816l);
		
	}
	
	
	
	
	static void voting(int age){   // methods
		if (age >= 18){
			System.out.println("you are eligible to vote");
		}
		else{
			System.out.println("wait till you are 18");
		}
	}
	
	static void marriage(int age){
		String name = "Lagritha";                                 //explicite variable declatation
		System.out.println("your name is "+ name);
		if (age >= 18){
			System.out.println("you are eligible to marry");
		}
		else{
			System.out.println("you are not eligible to marry");
		}
	}
	
	static void policeService(int age, double height, double weight){   // methods
		if (age >= 18 && height >= 5.7 && weight >= 65){
			System.out.println("you are eligible for Police service");
		}
		else{
			System.out.println("Sorry you aren't eligbe for police service");
		}
	}
	
	static void product(double price, double quantity, int pincode , long mobile ){   // methods
		double totalPrice= price * quantity;
		if (quantity >= 1 || quantity <=100){
			System.out.println("your product of "+ quantity + " total quantity price is "+ totalPrice + " and your pincode, mobile number is "+  pincode+ " , " + mobile);
		}
		else{
			System.out.println("Product quantity should be greater than 1 ");
		}
	}
	
	static void aadhar(long number){   // methods
		if (number <= 999999999999l){
			System.out.println("your aadhar number is valid");
		}
		else{
			System.out.println("incorrect aadhar number must be less than 12 digits");
		}
	}
}