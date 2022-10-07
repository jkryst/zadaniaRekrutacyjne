package zadanie3;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KaneRestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KanyeConfig.class);
		KanyeRest rest = context.getBean("kanyeRest", KanyeRest.class );
		context.close();
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Welcome to Kanye's quotes reader!");
		System.out.println(rest.getQuote());
		
		while(true) {
		   
		   System.out.println("To see the next random Kanye's quote type 'next', to exit type 'exit':");	
		   String command = sc.next();
		   
		   if (command.equals("next")) {
	 	      System.out.println(rest.getQuote());
		      } else if (command.equals("exit")) {
		      System.out.println("Exiting the programme!");
		      break;
		      } 
		}
		
		sc.close();
		System.exit(0);
	}

}
