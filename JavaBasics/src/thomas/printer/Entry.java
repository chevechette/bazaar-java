package thomas.printer;

public class Entry {

	public static void main(String[] args) {
		Repartitor r = Repartitor.getInstance();
		r.add(new Printer("HP"));
		r.add(new Printer("PB"));
		Repartitor.getInstance().add(new Printer("Epson"));
		
		
		Computer c1 = new Computer("Pc de Chantal");
		Computer c2 = new Computer("Pc du premier étage");
		
		c1.print();
		c1.print();
		c2.print();
		c1.print();
		c2.print();
		c2.print();
		c2.print();
		c2.print();
		c2.print();
	}

}
