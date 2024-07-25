public class Router{
	public static void network(int speed){
		System.out.print("this is Network class \n");
		System.out.print("the the speed from router is "+ speed + "\n");
		Provider.provide(speed);
		
	}
} 