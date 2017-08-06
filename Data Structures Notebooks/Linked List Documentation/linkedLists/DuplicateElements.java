package linkedLists;

public class DuplicateElements {

	public static void main(String[] args)
	{
		Node head = new Node(5);
		Node n1 = new Node(2);
		Node n2 = new Node(42);
		Node n3 = new Node(5);
		Node n4 = new Node(42);
		Node n5 = new Node(7);
		
		SinglyLinkedList list = new SinglyLinkedList(head);
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		loopMethod(list);
	}
	
	private static void loopMethod(LinkedList list)
	{
		for(int i = 0; i < list.size()-1; i++)
		{
			for(int k = i+1; k < list.size(); k++)
			{
				
			}
		}
	}
}
