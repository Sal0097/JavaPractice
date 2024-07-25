public class fort{
	public static void main(String[] args){
		System.out.println("location of forts");
		String ref = fort.fortName("bangalore");
		System.out.println(ref);
		
		
	}
	public static String fortName(String location){
		if(location == "mysore"){
			return "mysore fort";
		}
		if(location == "delhi"){
			return "delhi fort";
		}
		if(location == "bidar"){
			return "bidar fort";
		}
		return "location not there";
	} 
	
}