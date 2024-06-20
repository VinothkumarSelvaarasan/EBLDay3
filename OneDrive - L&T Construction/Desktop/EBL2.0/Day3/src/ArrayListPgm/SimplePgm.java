package ArrayListPgm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SimplePgm {
	ArrayList<String> arrayList=new ArrayList<String>();
	Scanner s=new Scanner(System.in);
	void insertData()
	{
		System.out.println("Enter Five Students Names");
		for(int i=0;i<=4;i++)
		{
			arrayList.add(s.next());
		}
	}
	void printData()
	{
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		SimplePgm sp=new SimplePgm();
		sp.insertData();
		sp.printData();
	}

}
