package Package;
import java.util.Scanner;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of Rows ");
		Scanner sc =new Scanner(System.in);
		
		int r= sc.nextInt();
		boolean flag=true;
		int sum=0;
		
		if(r<0) 
		{
			System.out.println("invalid input");
		}
		else 
		{
			for( int i=0;i<r;i++) 
			{
				int peopleperr=sc.nextInt();
				if(peopleperr<0) 
				{
					System.out.println("invalid");
					flag =false;
					break;
				}
				else 
				{
					sum+=peopleperr;
					System.out.println(peopleperr);
				}
				
			}
			if(flag==true)
			System.out.println("total no of passanger in aircraft "+sum);
		}
		sc.close();
			}

}
