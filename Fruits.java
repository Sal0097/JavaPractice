import java.util.Arrays; //Java Arrays.toString() is a static method of Arrays class which belongs to java.util package It contains various methods for manipulating array.

public class Fruits{
	public static void main (String[] args){
		
	String fruit[]={"mango","Orange","papaya","banaba","strawberry","tomato", "lichi", "guava","musk melon","cherry","blue berries","mango1"};
	System.out.println("the fruits are " + Arrays.toString(fruit));
	int len=fruit.length;
	System.out.println("Length of array "+fruit.length);
	}
}