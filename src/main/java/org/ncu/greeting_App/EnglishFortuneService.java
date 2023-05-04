package org.ncu.greeting_App;

import java.util.Scanner;

public class EnglishFortuneService implements FortuneService {


	public void fortune(String name) {
		int nume = getNum();
		int zod = getZodiac();
		int sum = (nume + zod)%10;

		String arr[] = {"Today is your bad day", "Today is your good day", "Today you will face financial problems",
				"Today's the perfect day to ask your soulmate out for a romantic date.",
				"As you are full of energy today, you may end up taking impulsive decisions"
				,"You shall tend to indulge in speculation today, foresees Ganesha.",
				"You need to be very attentive and careful as you have to make some important decisions",
				"You'll wear your heart on your sleeve today and will need your beloved for emotional support.",
				"You will not face any major health issue today.",
				"On the financial front, Ganesha predicts that things will just be so-so today."};
		
		System.out.println("Your fortune for today is " + arr[sum]);

	}
}
