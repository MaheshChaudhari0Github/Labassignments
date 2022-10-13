package Assignments1;

import java.util.Scanner;

public class Group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Roll number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //
		
		if(n%4==1) // 5/4==1
		{
			System.out.println("Sapphire"); 
		}
		else if(n%4==2) // 6/4==2
		{
			System.out.println("Perl");
		}
		else if(n%4==3) // 7/4==3
		{
			System.out.println("Ruby");
		}
		else if(n%4==0) // 8/4==0
		{
			System.out.println("Emerald");
	}
	}

	}


