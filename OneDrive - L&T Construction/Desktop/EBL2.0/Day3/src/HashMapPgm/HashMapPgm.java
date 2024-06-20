package HashMapPgm;

import java.util.HashMap;
import java.util.Map;

public class HashMapPgm {
	HashMap<Integer, String> hm=new HashMap<Integer,String>();
	void GetData()
	{
		hm.put(1, "Tiger");
		hm.put(2, "Lion");
		hm.put(3, "Elephant");
		hm.put(4, "Zebra");
	}
	void printData()
	{
		for(Map.Entry<Integer,String> mapEntry:hm.entrySet())
		{
			System.out.println(mapEntry.getKey());
			System.out.println(mapEntry.getValue());
		}
	}
public static void main(String[] args) {
	HashMapPgm hmp=new HashMapPgm();
	hmp.GetData();
	hmp.printData();
}
}
