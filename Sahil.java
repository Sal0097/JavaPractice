class Sahil
{
	static String sendMsg(String name,String msg,int quantity)
	{
		System.out.println("Start sendMsg in sahil");
		String ref2= Queue.accept(name,msg,quantity);
		return ref2;
	}
}