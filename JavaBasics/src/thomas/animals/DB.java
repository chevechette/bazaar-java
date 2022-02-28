package thomas.animals;

import java.util.Arrays;
import java.util.List;

public class DB {
	
	public static List<Chat> chats = Arrays.asList(new Chat("", 10));
	public static List<Chien> chiens = Arrays.asList(new Chien("", 10));

}

/*

Table 
	Perso
		id: PK, AI
		name: VARCHAR
		clan: VARCHAR
		id_weapon: int
	
	Weapon:
		id: PK, AI
		name: VARCHAR
		damage: int
		ranged: bool
*/