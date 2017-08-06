package linkedLists;

public class DoublyLinkedList extends LinkedList
{
	public DoublyLinkedList()
	{
		super();
	}
	
	public DoublyLinkedList(Node node)
	{
		super(node);
	}
	
	@Override
	public void add(Node node)
    {
		node.setPrev(lastNode());
    	lastNode().setNext(node);
    	length++;
    }

	@Override
	public void insert(Node node, int index) {
		if(index > length)
    	{
    		System.out.println("Index must be less than length");
    		return;
    	}

    	if(index == 0)
    	{
    		head.setPrev(node);
    		node.setNext(head.getNext());
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
    	    	node.setPrev(x);
    	    	node.setNext(temp.getNext());
    	    	temp.setNext(node);
    	    	length++;
    		}
    	}
	}

	@Override
	public void delete(int index) {
		if(index == (length-1))
    	{
			Node x = head;
			for(int i = 0; i < length-2; i++)
			{
				x = x.getNext();
			}
			x.setNext(null);
			lastNode().setPrev(null);
    		lastNode().setNext(null);
    	}
    	else
    	{
    		if(index == 0)
    		{
    			Node temp = head;
    			head = head.getNext();
    			temp.setNext(null);
    			head.setPrev(null);
    		}
    		else
    		{
    			Node x = head;
    			for(int i = 0; i < index-1; i++)
    			{
    				x = x.getNext();
    			}
    			Node temp = x;
    			x.setNext(temp.getNext().getNext());
    	    	temp.getNext().setNext(null);
    	    	temp.getNext().setPrev(null);
    		}
    	}
    	length--;
		
	}
	
	private Node lastNode()
	{
		Node x = head;
		for(int i = 0; i < length-1; i++)
		{
			x = x.getNext();
		}
		return x;
	}
}
