package eticaretDemo.dataAccess.abstracts;

import java.util.List;

import eticaretDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
	User get(String mail);
}
