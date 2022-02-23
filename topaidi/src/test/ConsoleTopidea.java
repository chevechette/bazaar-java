package test;

import data.Admin;
import data.DataBase;
import data.User;

public class ConsoleTopidea {
	
	public static boolean	dataBaseTest() {
		DataBase			logHorizon;
		
		logHorizon = DataBase.getInstance();
		if (logHorizon == null)
			return false;
		return true;
	}
	
	public static boolean ideaTest() {
		return true;
	}
	
	public static void main(String[] args) {
		DataBase			logHorizon;
		Admin				amaterasu;
		User				suzano;
		User				orochi;
		
		System.out.println("=========DB INITIALISE==========");
		// Initializing Database
		logHorizon = DataBase.getInstance();
		System.out.println(logHorizon);
		
		System.out.println("=========ACCOUNTS CREATION==========");
		// Testing account insert in Database
		amaterasu = new Admin("ookami@sama.sun", "LesLoupsC'estCool");
		suzano = new User("bolossDuNeufDeux@sama.sun", "J'aiPerduMonEpee");
		orochi = new User("r0x0r@badass.com", "C'estMonEpéeMaintenant");
		logHorizon.addAccount(amaterasu);
		logHorizon.addAccount(suzano);
		logHorizon.addAccount(orochi);
		
		System.out.println("=========CATEGORY CREATION==========");
		// Check
		System.out.println(amaterasu);
		System.out.println(orochi);
		System.out.println(logHorizon);
		
		
		System.out.println("=========DELETE ACCOUNT==========");
		logHorizon.removeAccount(suzano);
		logHorizon.removeAccount(suzano);
		logHorizon.removeAccount(orochi);
		logHorizon.removeAccount(null);
		logHorizon.removeAccount(amaterasu);
		// Check out
		System.out.println(logHorizon);
	}
}
