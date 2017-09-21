package hashTable;

public class Node  {
	private int data;
	private int key;
	private Node next;
	private Node prev;
	public Node()
	{
		
	}
	
	public Node(int key, int item)
	{
		this.key = key;
		this.data = item;
		this.next = null;
		this.prev = null;
	}
	
	public void setKey(int k)
	{
		this.key = k;
	}
	public boolean setPrev(Node next)
	{
		this.prev = next;
		return true;
	}
	
	public boolean setNext(Node next)
	{
		this.next = next;
		return true;
	}
	
	public Node getPrev()
	{
		return this.prev;
	}
	
	public Node getNext()
	{
		return this.next;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public int getKey()
	{
		return this.key;
	}
	public String toString()
	{
		return Integer.toString(this.data);
	}
}
