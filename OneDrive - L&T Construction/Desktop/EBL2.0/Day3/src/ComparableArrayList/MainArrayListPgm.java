package ComparableArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MainArrayListPgm {
	StudentInfo si1=new StudentInfo(123,"Akshata",34383);
	StudentInfo si2=new StudentInfo(126,"Aishwarya",34383);
	StudentInfo si3=new StudentInfo(121,"Shivani",34383);
	StudentInfo si4=new StudentInfo(120,"Apoorva",34383);
	ArrayList<StudentInfo> arrayList=new ArrayList<StudentInfo>();
	void insertData()
	{
		arrayList.add(si1);
		arrayList.add(si2);
		arrayList.add(si3);
		arrayList.add(si4);
		Collections.sort(arrayList);
	}
	void printData()
	{
		Iterator<StudentInfo> iterator=arrayList.iterator();
		while(iterator.hasNext())
		{
			StudentInfo si=(StudentInfo)iterator.next();
			System.out.println("Register Number "+si.registerationNo+"  Name is "+si.name );
		}
		
	}
	public static void main(String[] args) {
		MainArrayListPgm malp=new MainArrayListPgm();
		malp.insertData();
		malp.printData();
	}
	

}
