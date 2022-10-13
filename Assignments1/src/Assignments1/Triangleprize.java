package Assignments1;

import java.util.Scanner;

public class Triangleprize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st angle");
		int a = sc.nextInt();
		System.out.println("enter 2nd angle");
		int b = sc.nextInt();
		System.out.println("enter 3rd angle");
		int c = sc.nextInt();
		int p =a+b+c;
		if(p==180&&(a==60&&b==60&&c==60)) 
		{
			System.out.println("3 Prize");
		}
		else if (p==180&&(a==90||b==90||c==90))
		{
			System.out.println("2 Prize");
		}
		else if (p==180)
		{
			System.out.println("1 Prize");
		}
		else 
		{System.out.println("no price");
		
		
		
	}
}

	}
