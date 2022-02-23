package test;

import java.util.ArrayList;
import java.util.Iterator;

import data.Admin;
import data.DataBase;
import data.Idea;
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
		ArrayList<Idea>		ideaList;
		Iterator<Idea>		itIdea;
		Idea				thought;
		
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
		System.out.println("Inserting " + amaterasu.getEmail());
		logHorizon.addAccount(suzano);
		System.out.println("Inserting " + suzano.getEmail());
		logHorizon.addAccount(null);
		System.out.println("THERE'S A null TRAP !");
		logHorizon.addAccount(orochi);
		System.out.println("Inserting " + orochi.getEmail());		
		// Check
		System.out.println(logHorizon);
		
		System.out.println("=========CATEGORY CREATION==========");
		amaterasu.createCategory("kabuki", "Some sexist theater with music and a lot of crosseyed poses. Still cool");
		amaterasu.createCategory("noh", "Some creepy theater veeeery slow talking");
		amaterasu.createCategory("anime", "Well... this happenned.");
		
		System.out.println(logHorizon);
		amaterasu.deleteCategory("noh");
		System.out.println(logHorizon);
		
		System.out.println("=========SOME IDEAS CREATION==========");
		orochi.createIdea("Treason", "anime", "Top 10 anime death", null);
		orochi.createIdea("I am evil", "kabuki", "Top 10 anime death", null);
		suzano.createIdea("SWORDS", "kabuki", "LET'S BUY SWORDS !", null);
		
		System.out.println("=========SOME IDEAS RATINGS==========");
		ideaList = logHorizon.getIdeas();
		itIdea = ideaList.iterator();
		while (itIdea.hasNext()) {
			thought = (Idea) itIdea.next();
			if (thought.getCategory().getName().equals("kabuki"))
				orochi.rate(thought, 1);
			else
				orochi.rate(thought, -1);
			suzano.rate(thought, 1);
			System.out.println(thought);
		}
		
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
