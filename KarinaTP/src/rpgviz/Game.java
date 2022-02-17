package rpgviz;

import java.util.ArrayList;

public class Game {
	private String					name;
	private ArrayList<Humanoid>		humanoids;

	public Game(String name) {
		this.setName(name);
		this.humanoids = new ArrayList<Humanoid>();
	}
		
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Game [name=");
		builder.append(name);
		builder.append(", humanoids=");
		builder.append(humanoids);
		builder.append("]");
		return builder.toString();
	}

	public void addHumanoid(Humanoid character) {
		if (this.humanoids.contains(character))
			return ;
		this.humanoids.add(character);
	}
	
	public void removeHumanoid(Humanoid character) {
		if (this.humanoids.contains(character))
			this.humanoids.remove(character);
	}

	public ArrayList<Humanoid> getHumanoids() {
		return humanoids;
	}

	public void setHumanoids(ArrayList<Humanoid> humanoids) {
		this.humanoids = humanoids;
		if (this.humanoids == null)
			this.humanoids = new ArrayList<Humanoid>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
