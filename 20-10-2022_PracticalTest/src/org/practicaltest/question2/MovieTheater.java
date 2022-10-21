package org.practicaltest.question2;

import java.util.Scanner;

public class MovieTheater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Movie movList[]=null;
		int ch = 0;
		do {
			System.out.println("Welcome to the MovieTheater");
			System.out.println("1.Add movie Details");
			System.out.println("2.Search and book");
			System.out.println("3.View all");
			System.out.println("Enter your choice");
			int ch1=sc.nextInt();
			switch(ch1) {
			case 1 :
				System.out.println("Enter no. of movies :");
				int no=sc.nextInt();
				movList=new Movie[no];
				for(int i=0;i<movList.length;i++) {
					int j=i;
					System.out.println("Enter movie"+ ++j +"Details");
					movList[i]=new Movie();
				}
				System.out.println("Data saved.....");
				break;
			case 2 :
				boolean flag =true;
				sc.nextLine();
				System.out.println("Enter the movie name :");
				String name=sc.nextLine();
				for(int i=0;i<movList.length;i++) {
					if(movList[i].getMovieName().equals(name))
					{
						movList[i].viewAllDetails();
						flag =true;
						System.out.println("Would you like to to book for this movie :");
						System.out.println("Enter 1 to book and 2 to exit :");
						int c=sc.nextInt();
						if(c==1)
						{
							System.out.println("Enter the no. if tickets :");
							int tick=sc.nextInt();
							
							
						}
						else 
							break;
					}
					else
						flag=false;
				}
				if(flag==false)
					System.out.println("Not found");
				break;
				
			case 3 :
				for(int i=0;i<movList.length;i++) {
					movList[i].viewAllDetails();
				}
				default : System.out.println("Wrong choice....");
			}
			System.out.println("Do you went to continue(1.yes / 2.no) : ");
			ch1 =sc.nextInt();
		}while(ch==1);
		System.out.println("Execution completed successfully....");
	}	
					}
					
					
							