package linkedLists;

public class ReverseLinkedList {

	public static void main(String[] args)
	{
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		LinkedList list = new SinglyLinkedList(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		reverse(a);
	}
	
	public static Node reverse(Node node)
	{
		Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        node = prev;
        return node;
	}
}
