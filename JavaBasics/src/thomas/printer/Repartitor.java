package thomas.printer;

import java.util.ArrayList;
import java.util.List;

public class Repartitor {
	
	private List<Printer> printers = new ArrayList<>();
	private int index = 0;
	
	private static Repartitor instance;
	
	private Repartitor() {}
	
	public static Repartitor getInstance() {
		if(instance == null) {
			instance = new Repartitor();
		}
		return instance;
	}
	
	public void add(Printer p) {
		this.printers.add(p);
	}
	
	public Printer print() {
		if(this.printers.size() == index) {
			index = 0;
		}
		return this.printers.get(index++);
	}
	
	public List<Printer> getPrinters() {
		return printers;
	}

	public void setPrinters(List<Printer> printers) {
		this.printers = printers;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Repartitor [printers=");
		builder.append(printers);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
