package thomas.bazar;

import ajc.basics.Orc;

public class MyListLoup {
	public Loup[] orcs = new Loup[16];
	
	public void add(Loup o) {
		orcs[0]=o;
	}
	
	public void remove(int index) {
		orcs[index]=null;
	}
}
