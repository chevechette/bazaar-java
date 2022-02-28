package thomas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Division {
	
	/**
	 * @param date date de l'opération.
	 * @param a le premier nombre. il ne doit pas etre superieur à 20.
	 * @param b le second nombre. il ne doit pas etre superieur à 20.
	 * @return une valeur, peut etre.
	 * @throws ParseException 
	 * @throws Exception 
	 */
	public float divide(String date, float  a, float b) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		
		d = sdf.parse(date);
		
			// TODO Auto-generated catch block
		System.out.println("SAisie invalide, merci de recommencer");
		System.out.println("LOG: Division de " + a + "/" + b + " le "+ d);
		return a / b;
	}
	
}
