package thomas.printer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Computer {
	
	private String name;
	
	public void print() {
		Printer p = Repartitor.getInstance().print();
		System.out.println("Impression depuis le poste " + name + " sur l'imprimante " + p.getModel());
	}

}