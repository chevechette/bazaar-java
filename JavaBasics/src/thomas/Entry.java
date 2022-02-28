package thomas;

import java.util.Scanner;

public class Entry {
	
	public static void main(String[] args) {
		
		float result = -1;
		
		while(result == -1) {		
			Scanner sc = new Scanner(System.in);
	
			Division d = new Division();
			
			try {
				result = d.divide(sc.next(), 10, 25);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			System.out.println(result);
		}

	}

	Car c = new Car("fsd", "qssqd", 0, new Person("", 10));
		
}