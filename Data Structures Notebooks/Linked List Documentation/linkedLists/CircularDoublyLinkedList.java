package linkedLists;

public class CircularDoublyLinkedList extends LinkedList
{
	public CircularDoublyLinkedList()
	{
		super();
		head.setPrev(head);
	}
	
	public CircularDoublyLinkedList(Node node)
	{
		super(node);
		node.setPrev(node);
	}

	@Override
	public void add(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Node node, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		
	}
}
