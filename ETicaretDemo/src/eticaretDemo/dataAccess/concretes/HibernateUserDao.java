package eticaretDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eticaretDemo.dataAccess.abstracts.UserDao;
import eticaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme eklendi\n");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " güncellendi\n");
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sistemdne silindi\n");
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User get(String mail) {
		for(User user: users) {
			if(user.geteMail() == mail) {
				return user;
			}
		}
		return null;
	}

}
