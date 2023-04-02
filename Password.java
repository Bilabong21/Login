import java.util.*;

public class Password
   {
     public static void main(String[] args) 
       {
	     Scanner kb = new Scanner(System.in);
		 String sPass = "Bongani";
		 System.out.println("Enter the password: ");
		 String sWord = kb.nextLine();
		 int count = 3;
		 
		 do
		     {
				 
				 if(Validate(sPass, sWord))
				   {
					   
					   System.out.println("The password you have entered is correct: ");
				   
				   }else
				       {
						   
						   System.out.println("The password you have entered is incorrect: ");
					   
					   }
				 
				 count--;
				 System.out.println("Enter the password the correct password: ");
		         sWord = kb.nextLine();
			 
			 }while(!(sPass.equals(sWord)) && count != 1)
		 
		 
		 
	   }
     public static boolean Validate(String p_sPass , String p_sWord)
	   {
		   boolean ans = false;
		   
		   if(p_sPass.equals(p_sWord))
		      {
				
				ans = true; 
			  
			  }else
			      {
					 
					 ans = false;
				 
				 }
		   
		   return ans;
	   }	 
   }