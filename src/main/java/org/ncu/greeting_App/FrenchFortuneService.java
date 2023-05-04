package org.ncu.greeting_App;

import java.util.Scanner;

public class FrenchFortuneService implements FortuneService {


	public void fortune(String name) {
		int nume = getNum();
		int zod = getZodiac();
		int sum = (nume + zod) % 10;

		String arr[] = { "aujourd'hui sera une bonne journée pour toi",
				"aujourd'hui sera une mauvaise journée pour toi", "Tu vas bien faire aujourd'hui académiquement",
				"Tu vas passer une bonne journée financièrement",
				"Votre couleur porte-bonheur aujourd'hui est le rouge",
				"Votre couleur porte-bonheur aujourd'hui est le bleu",
				"Votre couleur porte-bonheur aujourd'hui est le violet",
				"Votre couleur porte-bonheur aujourd'hui est le noir",
				"Votre couleur porte-bonheur aujourd'hui est le vert",
				"Votre couleur porte-bonheur aujourd'hui est le jaune" };

		System.out.println("Your fortune for today is" + arr[sum]);

	}
}
