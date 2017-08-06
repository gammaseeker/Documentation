package queue;

import java.util.*;

public class Queue {
	
	private List<Integer> theQueue = new ArrayList<Integer>();
	private int length;

	public Queue(int length)
	{
		this.length = length;
	}
	
	public int size()
	{
		return length;
	}
	public boolean isFull()
	{
		return theQueue.size() == length;
	}
	
	public boolean isEmpty()
	{
		return theQueue.size() == 0;
	}
	
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("The queue is full");
			return;
		}
		theQueue.add(data);
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("The queue is empty");
			return -1;
		}
		return theQueue.remove(0);
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("The queue is empty");
			return -1;
		}
		return theQueue.get(0);
	}
}
