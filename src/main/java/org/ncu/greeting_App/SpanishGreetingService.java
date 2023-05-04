package org.ncu.greeting_App;

public class SpanishGreetingService implements GreetingService{
	public void greet(String name) {
		System.out.println("Hola, "+name);
	}
	
}
