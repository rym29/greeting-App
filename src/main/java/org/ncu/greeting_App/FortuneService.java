package org.ncu.greeting_App;

import java.util.Scanner;

public interface FortuneService {
	
	default int getNum() {
		System.out.println("Enter Your Fav NO.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	default int getZodiac() {
		System.out.println("Enter Your Zodiac Sign");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int strsize = str.length();
		return strsize;
	}

	public void fortune(String name);
}
