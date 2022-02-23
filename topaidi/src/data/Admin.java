package data;


public class Admin extends Account {

	public Admin(String email, String password) {
		super(email, password, true);
		// TODO Auto-generated constructor stub
	}
	
	public void createCategory(String name, String description) {
		DataBase	db;
		Category	cat;
		
		db = DataBase.getInstance();
		cat = new Category(name, description);
		db.addCategory(cat);
	}
	
	public void deleteCategory(String name) {
		DataBase	db;
		
		db = DataBase.getInstance();
		db.removeCategory(name);
	}
	
	public void deleteCategory(Category cat) {
		DataBase	db;
		
		db = DataBase.getInstance();
		db.removeCategory(cat);
	}
	
	public void modifyCategory(Category cat, String newName, String newDesc) {
		DataBase	db;
		Category	newCat;
		
		db = DataBase.getInstance();
		db.removeCategory(cat);
		newCat = new Category(newName, newDesc);
		db.addCategory(newCat);
	}
	
	public void activateUser(User someone) {
		someone.setActive(true);
	}

	public void desactivateUser(User someone) {
		someone.setActive(false);
	}
	
	public void removeUser(User someone) {
		DataBase	db;
		
		db = DataBase.getInstance();
		db.removeAccount(someone);	
	}
	
	public void desactivateIdea(Idea thought) {
		thought.ban();
	}
	
	public void dismissReport(Report delation) {
		DataBase	db;
		
		db = DataBase.getInstance();
		db.removeReport(delation);
	}
}
