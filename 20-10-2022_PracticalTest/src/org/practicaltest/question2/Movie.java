package org.practicaltest.question2;

import java.util.Scanner;

public class Movie {
    private String movieName;
    private String movieStartTime;
    private String movieEndTime;
    private int movieTicketPrice;
    

   Movie(){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the name of the movie:");
	   this.movieName=sc.nextLine();
	   System.out.println("Enter the movieStartTime:");
	   this.movieStartTime=sc.nextLine();
	   System.out.println("Enter the movieEndTime:");
	   this.movieEndTime=sc.nextLine();	 
	   System.out.println("Enter the movieTicketPrice:");
	   this.movieTicketPrice=sc.nextInt();
   }


public String getMovieName() {
	return movieName;
}


public void setMovieName(String movieName) {
	this.movieName = movieName;
}


public String getMovieStartTime() {
	return movieStartTime;
}


public void setMovieStartTime(String movieStartTime) {
	this.movieStartTime = movieStartTime;
}


public String getMovieEndTime() {
	return movieEndTime;
}


public void setMovieEndTime(String movieEndTime) {
	this.movieEndTime = movieEndTime;
}


public int getMovieTicketPrice() {
	return movieTicketPrice;
}


public void setMovieTicketPrice(int movieTicketPrice) {
	this.movieTicketPrice = movieTicketPrice;
}

void storeAllDetails(String name,String movieStartTime,String MovieEndTime,int movieTicketPrice)
{
	this.movieName=movieName;
	this.movieStartTime=movieStartTime;
	this.movieEndTime=movieEndTime;
	this.movieTicketPrice=movieTicketPrice;
}
void viewAllDetails() {
	System.out.println("Name :"+movieName);
	System.out.println("StartTime :"+movieStartTime);
	System.out.println("EndTime :"+movieEndTime);
	System.out.println("TicketPrice :"+movieTicketPrice);
}
}
