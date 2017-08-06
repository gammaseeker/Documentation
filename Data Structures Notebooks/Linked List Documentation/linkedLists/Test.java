package linkedLists;

public class Test {
	public static void main(String[] args)
	{
		System.out.println("Begin test for Singly Linked List");
		//singlyLinkedListTest();
		System.out.println(new Node(5));
		/*	System.out.println("Begin test for Circular Singly Linked List");
		circularSinglyLinkedListTest();
		*/
		
		//doublyLinkedListTest();
	}
	
	public static void singlyLinkedListTest()
	{
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		SinglyLinkedList list = new SinglyLinkedList(node1);
		list.add(node2);
		list.add(node3);
		list.add(node5);
		list.insert(node6, 4);
		list.display();
		System.out.println("BOI " + list.get(4));
		System.out.println("Length of: " + list.size());
		System.out.println();
		list.delete(3);
		list.display();
		System.out.println("Begin list2");
		
		SinglyLinkedList list2 = new SinglyLinkedList(node7); //Cannot reuse nodes in other linked lists, the objects retain their properties from previous mutations
		list2.add(node8);
		list2.add(node9);
		list2.add(node4);
		list2.display();
	}
	
	public static void circularSinglyLinkedListTest()
	{
		CircularSinglyLinkedList cSList = new CircularSinglyLinkedList(new Node(1));
		cSList.add(new Node(2));
		cSList.add(new Node(3));
		cSList.add(new Node(4));
		cSList.add(new Node(5));
		//cSList.insert(new Node(8), 0);
		//cSList.delete(0);
		cSList.delete(2);
		cSList.display();
	}
	
	public static void doublyLinkedListTest()
	{
		DoublyLinkedList dList = new DoublyLinkedList(new Node(7));
		dList.add(new Node(8));
		dList.add(new Node(9));
		dList.add(new Node(10));
		dList.add(new Node(11));
		dList.insert(new Node(15), 1);
		dList.delete(1);
		dList.display();
	}
}
