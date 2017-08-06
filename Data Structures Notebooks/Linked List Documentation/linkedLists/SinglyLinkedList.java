package linkedLists;

public class SinglyLinkedList extends LinkedList
{
	
	public SinglyLinkedList() 
    { 
    	super();
    }
	
    public SinglyLinkedList(Node node) 
    { 
    	super(node);
    }
    
    /**
    * Appends node to end of linked list
 	* @param node the node to be added.
 	*/
    public void add(Node node)
    {
    	lastNode().setNext(node);
    	length++;
    }
    
    /**
	 * Inserts node at specified index.
	 * @param node the node to be inserted
	 * @param index the position of where to insert the node
	 */
    public void insert(Node node, int index)
    {
    	
    	if(index > length)
    	{
    		System.out.println("Index must be less than length");
    		return;
    	}

    	if(index == 0)
    	{
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
    	    	node.setNext(temp.getNext());
    	    	temp.setNext(node);
    	    	length++;
    		}
    	}
    	
    	
    }
    
    /**
	 * Deletes node at index
	 * @param index the position of the node to be deleted
	 */
    public void delete(int index)
    {
    	if(index == (length-1))
    	{
    		Node x = head;
    		for(int i = 0; i < length-1; i++)
    		{
    			x = x.getNext();
    		}
    		x.setNext(null);
    	}
    	else
    	{
    		if(index == 0)
    		{
    			Node temp = head;
    			head = head.getNext();
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
    			x.setNext(temp.getNext().getNext());
    	    	temp.getNext().setNext(null);
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
    
    public void sort()
    {
    	
    }

}

