public class Hospital{
	public static void main(String[] args){
		System.out.println("the name of Hospital
		is :"+ Hospital.name());
		System.out.println("the specilization availble is :"+ Hospital.specialization());
		System.out.println("the location is :"+ Hospital.area());
		System.out.println("the opening time is :"+ Hospital.opentime());
		System.out.println("the closing time is :"+ Hospital.closetime());
		System.out.println(Hospital.generalcounslting());
		
	}
	
	public static String name(){
		return "Jeevika Hospital";
		
	}
	public static String specialization(){
		return "ENT" ;
	}
	public static String area(){
		return "Kadubesnahalli" ;
	}
	
	public static String closetime(){
		return "9:00pm" ;
	}
	public static String opentime(){
		return "11:00am" ;
	}
	public static String generalcounslting(){
		return " available from monday to saturday between 9am to 3pm " ;
	}
	
	
}