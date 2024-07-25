public class Recieverg{
	public static boolean sendMsgg(String name,String msg,int quantity){
		System.out.println("the details ="+ name+"  "+msg+" "+quantity+" ");
		if (name == "Spoorthi"){
			return true;
		}
		else{
			return false;
		}
	}
}