package org.ncu.greeting_App;

public class EnglishGreetingService implements GreetingService{
	public void greet(String name) {
		System.out.println("Hello, "+name);
	}
	
}