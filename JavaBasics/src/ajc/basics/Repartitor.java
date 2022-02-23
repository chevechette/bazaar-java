package ajc.basics;

import java.util.ArrayList;

public class Repartitor {
	static private Repartitor	instance = null;
	private int					currentPrinter;
	private ArrayList<Printer>	printers;
	
	private Repartitor() {
		this.setCurrentPrinter(0);
		this.setPrinters(new ArrayList<Printer>());
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Repartitor [currentPrinter=");
		builder.append(currentPrinter);
		builder.append(", printers=");
		builder.append(printers);
		builder.append("]");
		return builder.toString();
	}

	public static Repartitor getInstance() {
		if (Repartitor.instance == null)
			Repartitor.instance = new Repartitor();
		return Repartitor.instance;
	}
	
	public void print() {
		Printer	p;
		
		if (this.printers.size() == 0) {
			System.err.println("There are no printer for this job.");
			return;
		}
		p = this.printers.get(this.currentPrinter);
		System.out.println("Sending printing to printer " + p.getName());
		this.setCurrentPrinter(this.currentPrinter + 1);
	}
	
	public void addPrinter(Printer p) {
		if (p == null)
			return;
		this.printers.add(p);
	}

	public int getCurrentPrinter() {
		return currentPrinter;
	}

	public ArrayList<Printer> getPrinters() {
		return printers;
	}

	public static void setInstance(Repartitor instance) {
		Repartitor.instance = instance;
	}

	public void setCurrentPrinter(int currentPrinter) {
		if (this.printers == null || this.printers.size() == 0)
			this.currentPrinter = 0;
		else
			this.currentPrinter = currentPrinter % this.printers.size();
	}

	public void setPrinters(ArrayList<Printer> printers) {
		this.printers = printers;
	}
}
