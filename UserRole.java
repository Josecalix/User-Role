
  import java.util.Scanner;

  public class UserRole {
	
	public static void main(String[] args) {
	
		String yourRole;
		System.out.println("Choose your role from the following list:  \n1. Administrator "
				           + "\n2. Faculty \n3. Staff \n4. Student \n5. Guest");
		Scanner keyboard = new Scanner(System.in);
		yourRole = keyboard.next();
		
		switch(yourRole.toLowerCase())
		{
		  case "administrator":
		      System.out.println("Welcome " + yourRole +"!");
			  break;
		  case "faculty":
			  System.out.println("Welcome " + yourRole +"!");
			  break;
		  case "staff":
			  System.out.println("Welcome " + yourRole +"!");
			  break;
		  case "student":
			  System.out.println("Welcome " + yourRole +"!");
			  break;
		  case "guest":
			  System.out.println("Welcome " + yourRole +"!");
			  break;
	
		}
	
	 }
   }
