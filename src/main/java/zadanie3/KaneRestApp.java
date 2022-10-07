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
		System.out.println("To read the next Kanye quote type 'next', to exit type 'ext':");
		
		while(true) {
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
