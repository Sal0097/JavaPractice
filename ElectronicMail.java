//-- type var-name[]; array declaration
//-- type[] var-name;

public class ElectronicMail{
	public static void main (String[] args){
		String[] EmailArray; // declaration pf array of String data type
		EmailArray = new String[25];  //memory allocation in java
		EmailArray[0] = "123@gmail.com";
		EmailArray[1] = "123dfd@gmail.com";
		EmailArray[2] = "123fghxd@gmail.com";
		EmailArray[3] = "123wert@gmail.com";
		EmailArray[4] = "123xcv@gmail.com";
		EmailArray[5] = "123sdf@gmail.com";
		EmailArray[6] = "123sdcfvgbhj@gmail.com";
		EmailArray[7] = "123dcvbn@gmail.com";
		EmailArray[8] = "123dvV@gmail.com";
		EmailArray[9] = "123hjd@gmail.com";
		EmailArray[10] = "123cvgh@gmail.com";
		EmailArray[11] = "123ees@gmail.com";
		EmailArray[12] = "1232ww@gmail.com";
		EmailArray[13] = "123rf@gmail.com";
		EmailArray[14] = "123rf@gmail.com";
		EmailArray[15] = "123cd@gmail.com";
		EmailArray[16] = "123ww@gmail.com";
		EmailArray[17] = "123ww@gmail.com";
		EmailArray[18] = "123ww@gmail.com";
		EmailArray[19] = "123wccw@gmail.com";
		EmailArray[20] = "123wpcw@gmail.com";
		EmailArray[21] = "123ww3e4w@gmail.com";
		EmailArray[22] = "123wjkw@gmail.com";
		EmailArray[23] = "123ww90l@gmail.com";
		EmailArray[24] = "123wwdss@gmail.com";
		//EmailArray[25] = "123ww12s@gmail.com";
		//EmailArray[26] = "123wlpppw@gmail.com"; Error!! shows array index out of bounds
		
		int length = EmailArray.length;
		System.out.println("the length of array"+ length);    
		
		for (int i=0;i< EmailArray.length ; i++){           //for(initialization; condition; increment/ decrement)  requirement of curly braces is optional
			System.out.println("the contents of array at index :"+i +"  "+EmailArray[i]); // printing array in for loop direct method will bring pnly hex code
		}
	}
}