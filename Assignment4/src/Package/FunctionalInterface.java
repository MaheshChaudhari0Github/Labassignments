package Package;
import java.util.ArrayList;
import java.util.List;


	interface Addition
{
	public int Adder(int x, int y);
}

public class FunctionalInterface 
{

	public static void main(String[] args) 
	{
			List<String> name=new ArrayList<String>(); // array list
		name.add("Mahesh");
		
		name.forEach((m)->  // lambda expression
		{
			System.out.println(m.toUpperCase());  // use UpperCase method
			
		});
		
		Addition a=(n,m)->  // lambda expression
		{
			return n+m;
		};
		
		System.out.println(a.Adder(4, 8));
	}
}