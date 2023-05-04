package org.ncu.greeting_App;

public class FactoryFortuneService {
	public FortuneService tellf(String lang) {
		if(lang.equals("eng")) {
			return new EnglishFortuneService();
		}else if(lang.equals("fre")) {
			return new FrenchFortuneService();
		}else if(lang.equals("spa")) {
			return new SpanishFortuneService();
		}else {
			throw new RuntimeException("Sorry, "+lang+" language is not available!!");
		}
	}
}
