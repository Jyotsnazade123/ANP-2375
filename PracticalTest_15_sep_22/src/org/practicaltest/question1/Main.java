package org.practicaltest.question1;

public class Main {
	public static void main(String[] args) {
		Employee[] obj = new Employee[5] ;  
		
		obj[0] = new Employee(121,"John","29sept2022");  
		obj[1] = new Employee(122,"David","30sept2022");  
		obj[2] = new Employee(123,"Mona","31sept2022");  
		obj[3] = new Employee(124,"Shila","1oct2022");  
		obj[4] = new Employee(125,"Laila","2oct2022");  
		
		for (int i = 0;  i <5; i++)
		{
          System.out.println(obj[0]);
          System.out.println(obj[1]);
          System.out.println(obj[2]);
          System.out.println(obj[3]);
          System.out.println(obj[4]);
		
		
		class Employee  
		{  
		int emp_Id;  
		String emp_name;
		String emp_dateOfJoining;
		//Product class constructor  
		Employee(int eid, String ename,String edateOfJoining)  
		{  
		emp_Id = eid;  
		emp_name = ename;
		emp_dateOfJoining=edateOfJoining;
		}  
		public void display()  
		{  
		System.out.print("Employee Id = "+emp_Id + "  " + " Employee Name = "+emp_name+ " " + " Employee dateOfJoining ="+emp_dateOfJoining);  
		System.out.println();  
		}  
		}  
		}  
		 
	}
}




