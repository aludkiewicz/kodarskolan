package se.hiq.kodarskolan;

import javax.annotation.PostConstruct;

/*
 * This object is a singleton and is imagined as controlling something like a "save this user" button from e.g. a website
 */
public class UserController {
	private UserService userService;

	/*
	 * Just something that sets up the user service immediatly after construction of
	 * this object
	 */
	@PostConstruct
	public void setUp() {
		// Code left out, but uses setDao()
	}

	public void saveUser(String firstName, String lastName, String id) {
		Person user = new Person(id, firstName, lastName);
		userService.setUser(user);
		userService.persistUser();
	}
}
