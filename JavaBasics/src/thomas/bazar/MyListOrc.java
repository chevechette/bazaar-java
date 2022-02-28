package thomas.bazar;

import ajc.basics.Orc;

public class MyListOrc {
	public Orc[] orcs = new Orc[16];
	
	public void add(Orc o) {
		orcs[0]=o;
	}
	
	public void remove(int index) {
		orcs[index]=null;
	}
}
