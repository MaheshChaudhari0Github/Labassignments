package Exception;

public class CustomException1 {
	  // method to check the age  
  public static void validate (int no) throws Zeromembererror
  {    
     if(no >0)
     {  

      // throw an object of user defined exception  
      throw new Zeromembererror("valid");    
     }  
     else 
     {   
      System.out.println("ZeromemberError...user enter enter 0");   
      
      }   
   }    

  // main method  
  public static void main(String args[])  
  {  
      try  
      {  
          // calling the method   
          validate(0);  
      }  
      catch (Zeromembererror ex)  
      {  
          System.out.println("Caught the exception");  
  
          // printing the message from InvalidAgeException object  
          System.out.println("Exception occured: " + ex);  
      }  

        
  }  


}