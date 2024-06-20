package ComparableArrayList;

public class StudentInfo implements Comparable<StudentInfo> {
	Integer registerationNo;
	String name;
	int mobileNo;

	public StudentInfo(Integer registerationNo, String name, int mobileNo) {
		
		this.registerationNo = registerationNo;
		this.name = name;
		this.mobileNo = mobileNo;
	}

	@Override
	public int compareTo(StudentInfo studetnInfo) {
		if(registerationNo==studetnInfo.registerationNo)
		{
			return 0;
		}
		else if(registerationNo>studetnInfo.registerationNo)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	

}
