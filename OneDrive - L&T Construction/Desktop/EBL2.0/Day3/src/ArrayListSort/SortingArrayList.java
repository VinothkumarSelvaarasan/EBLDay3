package ArrayListSort;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
	ArrayList<String> arrayList=new ArrayList<String>();
	void insertData()
	{

		arrayList.add("Rohan");
		arrayList.add("Manoz");
		arrayList.add("Zainudeen");
		arrayList.add("Ravi");
		arrayList.add("Atul");
		Collections.sort(arrayList);
	}
	void printData()
	{
		for(String a:arrayList)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		SortingArrayList sal=new SortingArrayList();
		sal.insertData();
		sal.printData();
	}
	

}
