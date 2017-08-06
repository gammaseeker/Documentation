package queue;

public class Test {
	public static void main(String[] args)
	{
		Queue myQueue = new Queue(5);
		System.out.println(myQueue.isFull());
		System.out.println(myQueue.isEmpty());
		for(int i = 0; i <= 4; i++)
		{
			myQueue.enqueue(i);
		}
		System.out.println(myQueue.size());
		System.out.println(myQueue.peek());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.size());
	}
}
