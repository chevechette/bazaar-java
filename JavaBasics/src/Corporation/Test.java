package Corporation;

public class Test {
	public static void main(String[] args) {
		Status 		manager;
		Status 		grunt;
		BankInfo	creditSuisse;
		BankInfo	hsbc;
		BankInfo	lit;
		Company		imp;
		Employee	blitzo;
		Employee	moxxie;
		Employee	millie;
		
		manager = new Status(5, true);
		grunt = new Status();
		creditSuisse = new BankInfo("Créduit Suisse", "L33T");
		hsbc = new BankInfo("HSBC", "011010101");
		lit = new BankInfo("Lit", "Sous le matelas");
		imp = new Company("I.M.P.");
		
		blitzo = new Employee("Bitz", "O", 0, imp, lit, manager);
		moxxie = new Employee("Moxxie", "Axe", 0, imp, lit, grunt);
		millie = new Employee("Millie", "Axe", 0, imp, lit, grunt);

		System.out.println(manager);
		System.out.println(grunt);
		System.out.print(creditSuisse);
		System.out.print(hsbc);
		System.out.print(lit);
		System.out.println("imp");
		
		System.out.println(blitzo);
		System.out.println(moxxie);
		System.out.println(millie);
	}
}
