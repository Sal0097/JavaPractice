public class variable1{
	public static void main(String[] args){
		byte one=1;
		System.out.println(one);
		byte two=127;
		System.out.println(two);
		short three= 32767;
		System.out.println(three);
		int four= -2147483648; // + or - int value is max 
		System.out.println(four);
		long five= 9223372036854775807l; // the last didgit is L to tell its a long integer or else will throw error
		System.out.println(five);
		boolean isDay = true;
		System.out.println(isDay);
		boolean isnight = false;
		double costOfPetrole = 102.3555555555555555; // ptints all the numbers post decimal point
		System.out.println(costOfPetrole );
		float carTopSpeed = 140.4578888899f; //  prints 140.45789 the float doesnot print more than 6-7 decimal precision
		System.out.println(carTopSpeed);
		char numb='!'; // char can print all 256 ASCII characters
		char num= 45; // using number will assign the respective character in ASCII table
		String message= "Hello world!!!!!";
		System.out.println(message);
		
		int intOne = 1123456; // varible declaration with data type and variableName
		System.out.println(intOne);
		intOne = 420420; // variable re-initialization
		System.out.println(intOne);
	}
}