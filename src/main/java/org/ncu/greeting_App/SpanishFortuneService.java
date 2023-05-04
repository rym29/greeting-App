package org.ncu.greeting_App;

import java.util.Scanner;

public class SpanishFortuneService implements FortuneService {
	
	public void fortune(String name) {
		int nume = getNum();
		int zod = getZodiac();
		int sum = (nume + zod) % 10;

		String arr[] = { "Hoy es tu mal día", "Hoy es tu buen día", "Hoy enfrentarás problemas financieros",
				"Hoy es el día perfecto para invitar a tu alma gemela a una cita romántica",
				"Como estás lleno de energía hoy, puedes terminar tomando decisiones impulsivas",
				"Tenderás a permitirte especular hoy, prevé Ganesha", "Debes estar muy atento y cuidadoso",
				"ya que debes tomar algunas decisiones importantes",
				"Llevarás tu corazón en la manga hoy y necesitarás a tu amada como apoyo emocional",
				"No enfrentarás ningún problema de salud importante hoy",
				"En el frente financiero, Ganesha predice que las cosas serán más o menos hoy" };
		System.out.println("Your fortune for today is" + arr[sum]);
	}
}
