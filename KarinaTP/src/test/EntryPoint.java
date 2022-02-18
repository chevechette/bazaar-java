package test;

import rpgviz.Berserker;
import rpgviz.Game;
import rpgviz.Warrior;
import rpgviz.Wizard;

public class EntryPoint {
	
	public static void main(String[] args) {
		Game		castlevania;
		Berserker	alucard;
		Wizard		sypha;
		Warrior		trevor;
		
		alucard = new Berserker("Alucard", 100, 5);
		sypha = new Wizard("Sypha", 70, 2, 20);
		trevor = new Warrior("Trevor", 90, 6);
		castlevania = new Game("「悪魔城ドラキュラ　カリナedition」");
		castlevania.addHumanoid(trevor);
		castlevania.addHumanoid(alucard);
		castlevania.addHumanoid(sypha);
		System.out.println(castlevania);
	}

}
