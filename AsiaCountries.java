public class AsiaCountries{
	public static void main (String[] args){
		String[] countries; // declaration pf array of String data type
		countries = new String[7];  //memory allocation can be more than needed but not less
		countries[0] = "India";
		countries[1] = "Russia";
		countries[2] = "China";
		countries[3] = "Mangolia";
		countries[4] = "Afghanisthan";
		countries[5] = "Nepal";
		for(String ref:countries){          //for loop for each element by traversing the array
			System.out.println("Few Asian countries are :"+ ref);
		}
	}
}