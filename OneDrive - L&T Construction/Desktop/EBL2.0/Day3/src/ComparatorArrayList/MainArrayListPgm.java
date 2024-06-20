package ComparatorArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MainArrayListPgm {
	StudentInfo si1=new StudentInfo(123,"Akshata",876);
	StudentInfo si2=new StudentInfo(126,"Aishwarya",212);
	StudentInfo si3=new StudentInfo(121,"Shivani",112);
	StudentInfo si4=new StudentInfo(120,"Apoorva",321);
	ArrayList<StudentInfo> arrayList=new ArrayList<StudentInfo>();
	void insertData()
	{
		arrayList.add(si1);
		arrayList.add(si2);
		arrayList.add(si3);
		arrayList.add(si4);
		//Collections.sort(arrayList,new MobileComparator());
		Collections.sort(arrayList,new NameComparator());
	}
	void printData()
	{
		Iterator<StudentInfo> iterator=arrayList.iterator();
		while(iterator.hasNext())
		{
			StudentInfo si=(StudentInfo)iterator.next();
			System.out.println("Register Number "+si.registerationNo+"  Name is "+si.name +" Mobile Number "+si.mobileNo);
		}
		
	}
	public static void main(String[] args) {
		MainArrayListPgm malp=new MainArrayListPgm();
		malp.insertData();
		malp.printData();
	}
	

}
