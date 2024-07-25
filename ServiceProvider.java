class ServiceProvider
{
   static boolean send(String name,String msg)
   {
	   System.out.println("Start send in ServiceProvider.");
	   boolean ref= MessageProvider.send(name,msg);
	   return ref;
	}
}