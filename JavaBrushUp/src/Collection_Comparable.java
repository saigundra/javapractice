import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentDemo implements Comparable<StudentDemo> {
	int rollNo, marks;
	String name;

	public StudentDemo(int rollNo, int marks, String name) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(StudentDemo o) {
		return name.length() > o.name.length() ? 1 : -1;
	}

}

public class Collection_Comparable {

	public static void main(String[] args) {
		List<StudentDemo> studs = new ArrayList<>();
		studs.add(new StudentDemo(23, 85, "Mahesh"));
		studs.add(new StudentDemo(26, 15, "Sony"));
		studs.add(new StudentDemo(24, 65, "Larry"));
		studs.add(new StudentDemo(29, 45, "Joseph"));

		//Collections.sort(studs);
		//If in future if we want to sort based on marks we can override as below
		Collections.sort(studs, (i,j) -> i.marks>j.marks?1:-1);
		
		for (StudentDemo s : studs) {
			System.out.println(s);
		}
	}
}
