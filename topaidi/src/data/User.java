package data;

import java.util.ArrayList;

public class User extends Account implements Reportable {
	private int				ideaCount;
	private ArrayList<Idea>	ips;

	public User(String email, String password) {
		super(email, password, false);
		this.setIdeaCount(0);
		this.ips = new ArrayList<Idea>();
	}
	
	public void createIdea(String title, String category, String description, String picture) {
		DataBase	db;
		Category	cat;
		
		db = DataBase.getInstance();
		cat = db.getCategory(category);
		if (cat == null)
			return; // should add exception
		createIdea(title, cat, description, picture);
	}
	
	public void createIdea(String title, Category category, String description, String picture) {
		DataBase	db;
		Idea		genius;
		
		db = DataBase.getInstance();
		genius = new Idea(title, description, category, picture);
		db.addIdea(genius);
		this.ideaCount++;
	}
	
	public void comment(Idea topic, String content) {
		topic.addComment(new Comment(topic, this, content));
	}
	
	public void rate(Idea topic, int vote) {
		topic.addRating(new Rating(this, topic, vote));
	}
	
	public void report(Reportable obj, EReason reason) {
		Report		delation;
		DataBase	db;
		
		delation = new Report(this, obj, reason);
		db = DataBase.getInstance();
		db.addReport(delation);
	}

	public void ban() {
		this.setActive(false);
	}
	
	public void unban() {
		this.setActive(true);
	}

	public int getIdeaCount() {
		return ideaCount;
	}

	public void setIdeaCount(int ideaCount) {
		this.ideaCount = ideaCount;
	}

	public ArrayList<Idea> getIps() {
		return ips;
	}

	public void setIps(ArrayList<Idea> ips) {
		this.ips = ips;
	}
	
}
