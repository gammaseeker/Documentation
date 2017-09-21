package hashTable;

public class Test {
	public static void main(String[] args)
	{
		Node n1 = new Node(1, 500);
		Node n2 = new Node(2, 680);
		Node n3 = new Node(5, 237);
		
		HashTable myTable = new HashTable();
		myTable.insert(n1);
		myTable.insert(n2);
		myTable.insert(n3);
		myTable.display();
	}
}
