package Package;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
	    for(int i=0;i<n;i++)//for loop
	    {
	   	 for(int j=0;j<n;j++)
	   	 {
	   		 if(i>=0 && i<n && j==0 || i==n-1 && j>0)  // if else Statement
	   		 {
	   			 System.out.print("*");//print Pattern
	   		 }
	   		 else
	   		 {
	   			 System.out.print(" ");
	   		 }
	   	 }
	   	 System.out.println();
	    }

	}

}
