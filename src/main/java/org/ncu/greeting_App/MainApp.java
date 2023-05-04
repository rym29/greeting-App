package org.ncu.greeting_App;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {
		/*
		 * EnglishGreetingService eng = new EnglishGreetingService();
		 * eng.greet("Sumit");
		 * 
		 * FrenchGreetingService fre = new FrenchGreetingService(); fre.greet("Sumit");
		 * 
		 * SpanishGreetingService spa = new SpanishGreetingService();
		 * spa.greet("Sumit");
		 */

		String n, l;
		System.out.println("Enter Your Name");
		Scanner sc = new Scanner(System.in);
		n = sc.nextLine();
		System.out.println("Enter Your Language eng,spa,fre");
		l = sc.next();

		FactoryGreetingService factory = new FactoryGreetingService();
		GreetingService service = factory.greeting(l);

		service.greet(n);
		
		FactoryFortuneService fort = new FactoryFortuneService();
		FortuneService fort1 = fort.tellf(l);
		
		fort1.fortune(n);

	}
}