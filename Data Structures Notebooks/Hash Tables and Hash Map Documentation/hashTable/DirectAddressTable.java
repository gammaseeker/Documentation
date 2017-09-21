package hashTable;

public class DirectAddressTable {
	Node[] table;
	public DirectAddressTable(int m)
	{
		table = new Node[m];
		for(int i = 0; i < m; i++)
		{
			table[i] = new Node(i, i);
			table[i].setKey(i);
		}
	}
	
	public Node search(int k)
	{
		return table[k];
	}
	
	public void insert(Node x)
	{
		table[x.getKey()] = x;
	}
	
	public void delete(Node x)
	{
		table[x.getKey()] = null;
	}
}
