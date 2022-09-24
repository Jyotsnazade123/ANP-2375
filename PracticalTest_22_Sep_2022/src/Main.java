import java.util.TreeSet;

class Student implements Comparable<Student> {
  
 
    int Id;
    String name;
   
	private int Student;
	public int id;
	public int age;
  
    public Student(int Id, String name,
               int age)
    {
        this.Id = Id;
        this.name = name;
        this.age = age;
       
    }
  
    
    public int compareTo(Student s)
    {
        if (age > s.Student) {
            return 1;
        }
        else if (age < s.Student) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
  
public class Main {
	  
   
    public static void main(String[] args)
    {
     
    	Student studentObj=new Student(2,"Jyotsna",22);
        TreeSet<Student> treeset = new TreeSet<Student>();
  
       
        Student s1 = new Student(12,"Jyotsna",23);
        Student s2 = new Student(13,"Monali",24);
        Student s3 = new Student(14,"Jaya",25);
        Student s4 = new Student(15,"Vir",26);
        Student s5 = new Student(16,"Dhir",27);
        Student s6 = new Student(17,"Jit",28);
        Student s7 = new Student(18,"Kli",29);
        Student s8 = new Student(19,"Aklil",29);
        Student s9 = new Student(20,"Sam",34);
        Student s10 = new Student(21,"Yash",21);
        
        
        treeset.add(s1);
        treeset.add(s2);
        treeset.add(s3);
        treeset.add(s4);
        treeset.add(s5);
        treeset.add(s6);
        treeset.add(s7);
        treeset.add(s8);
        treeset.add(s9);
        treeset.add(s10);
        
        System.out.println("Student Information");
        
      
        for (Student s : treeset)  {
            System.out.println(s.age + " " + s.name + " "
                    + s.id );
}
}
}
            
        	