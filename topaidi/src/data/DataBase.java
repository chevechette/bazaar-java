package data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;

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
	
	public ArrayList<Idea>	getRatedTops() {
		ArrayList<Idea>		ranking;
		
		ranking = new ArrayList<Idea>(this.ideas.stream()
				.filter(i -> i.isActive())
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList()));
		return ranking;
	}
	
	public ArrayList<Idea>	getRatedBuzz() {
		ArrayList<Idea>		ranking;
		
		ranking = new ArrayList<Idea>(this.ideas.stream()
				.filter(i -> i.isActive())
				.sorted(Comparator.comparingInt(Idea::getPopularity).reversed())
				.collect(Collectors.toList()));
		return ranking;
	}
	
	public ArrayList<User>	getRatedBrains() {
		ArrayList<User>		users;
		
		users = new ArrayList<User>(this.accounts.stream()
				.filter(acc -> acc instanceof User)
				.map(acc -> (User) acc)
				.sorted(Comparator.comparingInt(User::getIdeaCount).reversed())
				.collect(Collectors.toList()));
		return users;
	}
	
	public Account getAccount(String email) {
		Iterator<Account>	it;
		Account				acc;
		
		if (email == null)
			return null;
		it = this.accounts.iterator();
		while (it.hasNext()) {
			acc = (Account) it.next();
			if (acc.getEmail().equals(email))
				return acc;
		}
		return null;
	}

	public Category getCategory(String name) {
		Iterator<Category>	it;
		Category			cat;
		
		if (name == null)
			return null;
		it = this.categories.iterator();
		while (it.hasNext()) {
			cat = (Category) it.next();
			if (cat.getName().equals(name))
				return cat;
		}
		return null;
	}
	
	public void addAccount(Account someone) throws UserAlreadyInDataBaseException {
		if (someone == null)
			return;
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
		if (cat == null)
			return;
		if (this.categories.contains(cat))
			throw new CategoryAlreadyInDataBaseException();
		if (this.categories.stream()
				.anyMatch(c -> c.getName().equals(cat.getName())))
			throw new CategoryAlreadyInDataBaseException();
		this.categories.add(cat);
	}
	
	public void removeCategory(String name) {
		Iterator<Category>	it;
		Category			cat;
		
		it = this.categories.iterator();
		while (it.hasNext()) {
			cat = (Category) it.next();
			if (cat.getName().equals(name))
				it.remove();
		}
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

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public ArrayList<Category> getCategories() {
		return categories;
	}

	public ArrayList<Idea> getIdeas() {
		return ideas;
	}

	public ArrayList<Report> getReports() {
		return reports;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	}

	public void setIdeas(ArrayList<Idea> ideas) {
		this.ideas = ideas;
	}

	public void setReports(ArrayList<Report> reports) {
		this.reports = reports;
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
