package data;

public class Rating {
	private User	user;
	private Idea	idea;
	private int	score; // SCORE TOP == 1 ; FLOP == -1
	
	public Rating(User user, Idea idea, int score) {
		this.user = user;
		this.idea = idea;
		this.score = score;
	}

	public User getUser() {
		return user;
	}
	
	public Idea getIdea() {
		return idea;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setIdea(Idea idea) {
		this.idea = idea;
	}

	public void setScore(byte score) {
		this.score = score;
	}

	
}
