class Queue
{
	static boolean accept(String name,String msg,int quantity)
	{
		System.out.println("Start in queue");
		System.out.println("name of person:" + name);
		System.out.println("message sent is:" + msg);
		System.out.println("quantity:" + quantity);
		boolean ref1=ServiceProvider.send(name,msg);
		if(ref1==true)
		{
			return true;
		}else{
		System.out.println("End accept in Queue");
		return false;
		}
	}
}