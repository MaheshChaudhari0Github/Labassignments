package Packages;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePrint {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		 File obj = new File("C:\\Users\\Divesh\\divesh.txt");
	     System.out.println("Print words whos length greater than 5");
	     Scanner sc = new Scanner(obj);
	     String str =" ";
	     String s = sc.nextLine();
	          //for loop
	     for(int i=0;i<s.length();i++)
	     {
	    	 if(s.charAt(i)!=' ') //if condition for checking space
	    	 {
	    		 str+=s.charAt(i);
	    	 }
	    	 else
	    	 {
	    		if(str.length()>5)//condition for length is greater then 5
	    			System.out.println(str+" ");// print words
	    		str=" "; 
	    	 }
	     }
	     sc.close();
	}
}