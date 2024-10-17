
public class Role {
	public Role() {
		System.out.println("Role class");
	}

	// Business method
	public String getRoleByUserId(String userId) {
		// we can write logic to get role of user from DB
		return "HRADMIN";
	}
}
