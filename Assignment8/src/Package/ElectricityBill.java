package Package;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare Scanner
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Unit");
		int n;
		float Unit;
		n = sc.nextInt();
		if (n>0 && n<=100)
		{
			Unit=n*1.20f;
			System.out.println("Your electricity bill is: "+Unit+" Rs.");
		}
		else if (n>100 && n<300)
		{
			Unit = n*2f;
			System.out.println("Your electricity bill is: "+Unit+" Rs.");
		}
		else if (n>300)
		{
			Unit = n*3f;
			System.out.println("Your electricity bill is: "+Unit+" Rs.");
		}
		else 
		{
			System.out.println("Invalid Output");
		}
		sc.close();
	}
}
