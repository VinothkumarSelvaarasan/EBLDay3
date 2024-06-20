package ComparatorArrayList;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentInfo>{

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
			StudentInfo s1=(StudentInfo) o1;
			StudentInfo s2=(StudentInfo) o2;
		return s1.name.compareTo(s2.name);
	}

}
