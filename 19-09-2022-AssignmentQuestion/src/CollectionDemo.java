import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.ArrayList;

class Student{
	int studentId;
	String studentName;
	int studentAge;
	public Student() {
		this.studentId=13;
		this.studentName="Jyotsna";
		this.studentAge=22;
		//TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", getStudentId()=" + getStudentId() + ", getStudentName()=" + getStudentName() + ", getStudentAge()="
				+ getStudentAge() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentAge, studentId, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentAge == other.studentAge && studentId == other.studentId
				&& Objects.equals(studentName, other.studentName);
	}
	
	
}


public class CollectionDemo {
	public static void main(String[] args) {
	Student studentObj=new Student(2,"Jyotsna",22);
	
	//HashSet Problem-in sorted order
	System.out.println("TreeSet Problem");
	HashSet<String>hashSetObj=new HashSet<>();
	hashSetObj.add("C++");
	hashSetObj.add("Java");
	hashSetObj.add("Python");
	hashSetObj.add(".Net");
	hashSetObj.add("Perl");
	System.out.println(hashSetObj);
	
	//TreSet problem-give sorted order
	System.out.println("TreeSet Problem");
	TreeSet<String>treeSetObj=new TreeSet<>();
	treeSetObj.add("C++");
	treeSetObj.add("Java");
	treeSetObj.add("Python");
	treeSetObj.add(".Net");
	treeSetObj.add("Perl");
	System.out.println(treeSetObj);
	
	
	//Iterator problem
	System.out.println("Iterator Problem");
	Iterator iteratorObj=treeSetObj.iterator();
	while(iteratorObj.hasNext()) {
		System.out.println(iteratorObj.next());
	}
	System.out.println("LinkedList Problem");
	LinkedList<Student> linkedList=new LinkedList<>();
	linkedList.add(studentObj);
	linkedList.add(new Student(3,"Priyanka",45));
	System.out.println(linkedList);
	
	System.out.println("ArrayList Problem");
	ArrayList<String> arrayList=new ArrayList<>();
	System.out.println("TreeSet Problem");
	
	arrayList.add("C++");
	arrayList.add("Java");
	arrayList.add("Python");
	arrayList.add(".Net");
	arrayList.add("Perl");
	System.out.println(arrayList);
	}
	

}
