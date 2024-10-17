
public class User {

	Role role = new Role();

	public User() {
		System.out.println("User class");
		// creating object for Role class
	}

	// Business method
	public void getUserRole(String userId) {
		// calling the business method of Role class
		String roleName = role.getRoleByUserId(userId);
		System.out.println("Role checking::::" + "HRADMIN".equals(roleName));

	}

}
