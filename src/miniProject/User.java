package miniProject;

public abstract class User {
	protected String username;
	protected String password;
	
	User(String username,String password){
		this.username=username;
		this.password=password;
	}

	 public abstract boolean login(String username, String password);

}
