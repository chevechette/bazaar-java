package data;

import java.time.LocalDate;
import java.util.ArrayList;

import exceptions.CannotRateException;

public class Idea implements Reportable {
	private String				title;
	private String				description;
	private Category			category;
	private String				imgPath;
	private LocalDate			creationDate;
	private boolean				active;
	private ArrayList<Comment>	comments;
	private ArrayList<Rating>	ratings;
	
	public Idea(String title, String description, Category cat, String imgPath) {
		this.title = title;
		this.description = description;
		this.imgPath = imgPath;
		this.creationDate = LocalDate.now();
		this.active = true;
		this.category = cat;
		this.comments = new ArrayList<Comment>();
		this.ratings = new ArrayList<Rating>();
	}
	
	public void addRating(Rating vote) throws CannotRateException {
		if (this.ratings.stream().anyMatch(v -> v.getUser().equals(vote.getUser())))
			throw new CannotRateException();
		this.ratings.add(vote);
	}
	
	public void removeRating(Rating vote) {
		if (this.ratings.contains(vote))
			this.ratings.remove(vote);
	}
	
	public void addComment(Comment com) {
		this.comments.add(com);
	}
	
	public void removeComment(Comment com) {
		if (comments.contains(com))
			this.comments.remove(com);
	}

	public void ban() {
		this.setActive(false);
	}
	
	public void unban() {
		this.setActive(true);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getImgPath() {
		return imgPath;
	}
	
	
	public LocalDate getCreationDate() {
		return creationDate;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public ArrayList<Comment> getComments() {
		return comments;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Idea [title=");
		builder.append(title);
		builder.append(", description=");
		builder.append(description);
		builder.append(", imgPath=");
		builder.append(imgPath);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", active=");
		builder.append(active);
		builder.append(", score=");
		builder.append(this.ratings.stream().mapToInt(r-> r.getScore()).sum());
		builder.append("]");
		return builder.toString();
	}
}
