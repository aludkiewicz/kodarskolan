package se.hiq.kodarskolan;

public class UserService {
	private Person user;
	private UserDao dao;

	/*
	 * Set the database access object (DAO) for the service.
	 */
	public void setDao (UserDao dao) {
		this.dao = dao;
	}

	public void setUser (Person user) {
		this.user = user;
	}

	public void persistUser() {
		dao.persist(user);
	}
}
