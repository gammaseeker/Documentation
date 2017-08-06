package linkedLists;

public class CircularSinglyLinkedList extends LinkedList 
{
	public CircularSinglyLinkedList()
	{
		super();
		head.setNext(head);
	}
	
	public CircularSinglyLinkedList(Node node)
	{
		super(node);
		node.setNext(node);
	}

	@Override
	 public void add(Node node)//Finished
    {
    	
    	lastNode().setNext(node);
    	node.setNext(head);
    	length++;
    }

	@Override
	 public void insert(Node node, int index)//Finished
    {
    	
    	if(index > length)
    	{
    		System.out.println("Index must be less than length");
    		return;
    	}
    	
    	if(index == 0)
    	{
    		
    		node.setNext(head);
    		lastNode().setNext(node);
    		head = node;
    		length++;
    	}
    	else
    	{
    		if(index == length)
        	{
        		add(node);
        	}
    		else
    		{
    			Node x = head;
    			for(int i = 0; i < index-1; i++)
    	    	{
    	    		x = x.getNext();
    	    	}
    	    	Node temp = x;
    	    	node.setNext(temp.getNext());
    	    	temp.setNext(node);
    	    	length++;
    		}
    	}
		
    }

	@Override
	public void delete(int index)//TODO
    {
    	if(index == (length-1))
    	{
    		
    		lastNode().setNext(head);
    	}
    	else
    	{
    		if(index == 0)
    		{
    			lastNode().setNext(head.getNext());
    			Node temp = head;
    			head = temp.getNext();
    			temp.setNext(null);
    		}
    		else
    		{
    			Node x = head;
    			for(int i = 0; i < index-1; i++)
    			{
    				x = x.getNext();
    			}
    			Node temp = x;
    			temp.setNext(x.getNext().getNext());
    	    	x.getNext().setNext(null);
    
    		}
    	}
    	length--;
    }
	
	/**
	 * Helper method to traverse to last node of a linked list
	 * @return last node of a linked list
	 */
	private Node lastNode()
	{
		Node x = head;
		for(int i = 0; i < length-1; i++)
		{
			x = x.getNext();
		}
		return x;
	}
	/**
	 * Traverses linked list twice
	 */
	public void display()
	{
		Node x = head;
		for(int i = 0; i < 2*length; i++)
		{
			
			System.out.println(x.getData());
			x = x.getNext();
			System.out.println("WORKING");
		}
	}
}
