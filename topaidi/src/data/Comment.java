package data;

import java.time.LocalDate;

public class Comment implements Reportable {
	private Idea		topic;
	private User		author;
	private String		content;
	private	LocalDate	time;
	private boolean		active;
	
	public Comment(Idea topic, User author, String content) {
		this.topic = topic;
		this.author = author;
		this.content = content;
		this.time = LocalDate.now();
		this.active = true;
	}

	public void ban() {
		this.setActive(false);
	}
	
	public void unban() {
		this.setActive(true);
	}

	public String getContent() {
		return content;
	}

	public User getAuthor() {
		return author;
	}

	public Idea getTopic() {
		return topic;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public void setTopic(Idea topic) {
		this.topic = topic;
	}

	public LocalDate getTime() {
		return time;
	}

	public void setTime(LocalDate time) {
		this.time = time;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comment [topic=");
		builder.append(topic);
		builder.append(", author=");
		builder.append(author);
		builder.append(", content=");
		builder.append(content);
		builder.append(", time=");
		builder.append(time);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}
}
