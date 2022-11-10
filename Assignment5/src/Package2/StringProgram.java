package Package2;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HeLlo"; // string
	      StringBuffer newStr=new StringBuffer(str);    
	          
	      for(int i = 0; i < str.length(); i++) // for loop
	      {    
	              
	          //Checks for lower case character    
	          if(Character.isLowerCase(str.charAt(i))) 
	          {    
	              //Convert it into upper case using toUpperCase() function    
	              newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));    
	          }    
	          //Checks for upper case character    
	          else if(Character.isUpperCase(str.charAt(i)))
	          {    
	              //Convert it into upper case using toLowerCase() function    
	              newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
	          }    
	      }    
	      System.out.println("String after case conversion : " + newStr);

	}

}
