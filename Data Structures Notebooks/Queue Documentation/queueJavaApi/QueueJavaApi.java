package queueJavaApi;
import java.util.*;

public class QueueJavaApi {

	public static void main(String[] args)
	{
		Queue<Integer> myQ = new ArrayDeque<Integer>();
		for(int i = 1; i <= 15; i++)
		{
			myQ.add(getRandomInt(1, 70));
		}
		System.out.println(myQ);
	}
	
	private static int getRandomInt(int lower, int upper)
	{
		return (int)(Math.random() * (upper - lower)) + lower;
	}
}
