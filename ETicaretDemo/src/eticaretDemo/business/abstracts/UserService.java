package eticaretDemo.business.abstracts;

import java.util.List;

import eticaretDemo.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	List<User> getAll();
	User get(String mail);
}
