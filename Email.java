public class Email{
	public static void sendMsg(String msg){
		System.out.print("this is email class \n");
		System.out.print("the message sent is : " + msg + " \n");
		Person.readMsg(msg);
		
	}
}                                              //Email-->sendMsg(String msg)--->Person-->read(msg);

                                                     //Main--> Email.sendMsg("Good Day!!")