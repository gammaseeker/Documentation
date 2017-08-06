package queue;
import java.util.*;

public class PriorityQueueDemo {
	
	public static void main(String[] args)//Priority is determined by default via Comparable
	{
		PriorityQueue<String> q = new PriorityQueue<>();
		q.offer("Oklahoma");
		q.offer("Indiana");
		q.offer("Georgia");
		q.offer("Texas");
		
		System.out.println("Priority queue using Comparable:");
		while(q.size() > 0)
		{
			System.out.print(q.remove() + " ");
		}
		
	}
	

}
