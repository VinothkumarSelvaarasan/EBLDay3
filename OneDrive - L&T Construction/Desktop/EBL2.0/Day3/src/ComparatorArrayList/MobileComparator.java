package ComparatorArrayList;

import java.util.Comparator;


public class MobileComparator implements Comparator<StudentInfo> {

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
		StudentInfo studentInfo1=(StudentInfo)o1;
		StudentInfo studentInfo2=(StudentInfo)o2;
		
	
		if(studentInfo1.mobileNo==studentInfo2.mobileNo)
		{
			return 0;
		}
		else if(studentInfo1.mobileNo> studentInfo2.mobileNo) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
