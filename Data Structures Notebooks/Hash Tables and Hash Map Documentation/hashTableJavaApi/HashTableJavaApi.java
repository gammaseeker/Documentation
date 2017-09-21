package hashTableJavaApi;
import java.util.*;

public class HashTableJavaApi {
	public static void main(String[] args)
	{
		Hashtable<String, Integer> nums = new Hashtable<String, Integer>();
		nums.put("one", 1);
		nums.put("two", 2);
		nums.put("three", 3);
		Integer n = nums.get("two");
		if(n != null)
			System.out.println("two = " + n);
		System.out.println(nums.containsKey("one"));
		System.out.println(nums.containsValue(5));
		System.out.println(nums.hashCode());
	}
}
