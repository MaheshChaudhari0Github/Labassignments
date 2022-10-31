package Package;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prime number Program  
		System.out.println("the prime between 100 to 200 are");
		System.out.println();
		
				for(int n =100;n<=200;n++)  //for loop
				{
					boolean flag = true;
					for (int i=2;i<n;i++)
					
					{
						if(n%i==0)  // if statement 
						{
							flag = false;
							//	System.out.println("composite number"+n);
							break;
						}
					}
					if(flag==true)
					{
					System.out.println("This is a prime number: " +n);
					}
					
				}	

	}

}
