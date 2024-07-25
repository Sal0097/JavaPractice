public class Laptop{
	public static void connect(int speed){
		System.out.print("this is Connect class \n");
		System.out.print("the Speed in laptop is : " + speed + " \n");
		Router.network(speed);
		
	}
} 