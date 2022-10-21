package org.practicaltest.question3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {
 public static void main(String[] args) throws IOException {
	 
	 FileReader fr=new FileReader("C:/Users/HP/OneDrive/Desktop/text.html");
	 BufferedReader br=new BufferedReader(fr);
	 
	 String str;
	 
	 while((str = br.readLine())!=null){
		 System.out.println(str);
	 }
	 br.close();
	 }
 }

