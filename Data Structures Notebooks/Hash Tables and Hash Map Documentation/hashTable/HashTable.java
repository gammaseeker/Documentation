package hashTable;
import java.util.*;

public class HashTable {
	
	private LinkedList<Integer>[] hashTable;
	private int capacity = 11;
	private int m = 3;
	@SuppressWarnings("unchecked")//Tells compiler to trust programmer, everything will compile
	public HashTable()
	{
		this.hashTable = new LinkedList[11];
	}
	
	@SuppressWarnings("unchecked")
	public HashTable(int capacity)
	{
		this.hashTable = new LinkedList[capacity];
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public void setCapacity(int capacity)
	{
		if(capacity < this.capacity)
		{
			System.out.println("Capacity must be greater than " + this.capacity);
		}
		else
		{
			this.capacity = capacity;
		}
	}
	private int hash(int key)
	{
		return divisionMethod(key);
		//return myHash(key);
	}
	
	private int divisionMethod(int key)
	{
		return key % this.m;
	}	
	
	private int myHash(int key)
	{
		int num = key % this.m;
		if(num%2 == 0)
		{
			return num % 19;
		}
		else
		{
			return num % 16;
		}
	}
	
/*	public void insert(int key, int data)
	{
		int index = hash(key);
		this.hashTable[index].add(data);
	}*/
	
	public void insert(Node n)
	{
		int index = hash(n.getKey());
		if(this.hashTable[index] == null)
		{
			LinkedList<Integer> chain = new LinkedList<Integer>();
			chain.add(n.getData());
			this.hashTable[index] = chain;
		}
		else
		{
			this.hashTable[index].add(n.getData());
		}
	}
	
	public LinkedList<Integer> search(int key)
	{
		int index = hash(key);
		if(this.hashTable[index] != null)
		{
			return this.hashTable[index];
		}
		return null;
	}
	
	public Integer search(Node n)
	{
		int index = hash(n.getKey());
		for(int i = 0; i < this.hashTable[index].size(); i++)
		{
			if(this.hashTable[index].get(i) == n.getData())
			{
				return this.hashTable[index].get(i);
			}
		}	
		return null;
	}
	
	public void delete(int key)
	{
		int index = hash(key);
		this.hashTable[index] = null;
	}
	
	public void delete(Node n)
	{
		int index = hash(n.getKey());
		for(int i = 0; i < this.hashTable[index].size(); i++)
		{
			if(this.hashTable[index].get(i) == n.getData())
			{
				this.hashTable[index].remove(i);
			}
		}	
		
	}
	
	public void display()
	{
		for(int i = 0; i < hashTable.length; i++)
		{
			System.out.print(i + " ");
			if(hashTable[i] != null)
			{
				for(int j = 0; j < hashTable[i].size(); j++)
				{
					System.out.print(hashTable[i].get(j) + " ");
				}
			}
			System.out.println();
		}
	}
}
