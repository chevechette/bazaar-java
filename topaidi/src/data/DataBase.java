package data;

import java.util.ArrayList;

import exceptions.CategoryAlreadyInDataBaseException;
import exceptions.IdeaAlreadyInDataBaseException;
import exceptions.UserAlreadyInDataBaseException;

public class DataBase {
	static private DataBase				instance = null;
	public ArrayList<Account>			accounts;
	public ArrayList<Category>			categories;
	public ArrayList<Idea>				ideas;
	public ArrayList<Report>			reports;
	
	private DataBase() {
		this.accounts = new ArrayList<Account>();
		this.categories = new ArrayList<Category>();
		this.ideas = new ArrayList<Idea>();
		this.reports = new ArrayList<Report>();
	}
	
	static public DataBase getInstance() {
		if (DataBase.instance == null)
			DataBase.instance = new DataBase();
		return DataBase.instance;
	}
	
	public void addAccount(Account someone) throws UserAlreadyInDataBaseException {
		if (this.accounts.contains(someone))
			throw new UserAlreadyInDataBaseException();
		if (this.accounts.stream()
				.anyMatch(a -> a.getEmail().equals(someone.getEmail())))
			throw new UserAlreadyInDataBaseException();
		this.accounts.add(someone);
	}
	
	public void removeAccount(Account someone) {
		if (this.accounts.contains(someone))
			this.accounts.remove(someone);
	}

	public void addCategory(Category cat) throws CategoryAlreadyInDataBaseException {
		if (this.categories.contains(cat))
			throw new CategoryAlreadyInDataBaseException();
		if (this.categories.stream()
				.anyMatch(c -> c.getName().equals(cat.getName())))
			throw new CategoryAlreadyInDataBaseException();
		this.categories.add(cat);
	}
	
	public void removeCategory(Category cat) {
		if (this.categories.contains(cat))
			this.categories.remove(cat);
	}
	
	public void addIdea(Idea thought) throws IdeaAlreadyInDataBaseException {
		if (this.ideas.contains(thought))
			throw new IdeaAlreadyInDataBaseException();
		this.ideas.add(thought);
	}
	
	public void removeIdea(Idea thought) {
		if (this.ideas.contains(thought))
			this.ideas.remove(thought);
	}
	
	public void addReport(Report delation) {
		if (this.reports.contains(delation))
			return;
		this.reports.add(delation);
	}
	
	public void removeReport(Report delation) {
		if (this.reports.contains(delation))
			this.reports.remove(delation);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataBase [\naccounts=");
		builder.append(accounts);
		builder.append("\n, categories=");
		builder.append(categories);
		builder.append("\n, ideas=");
		builder.append(ideas);
		builder.append("\n, reports=");
		builder.append(reports);
		builder.append("]");
		return builder.toString();
	}
}
