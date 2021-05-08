package eticaretDemo;

import eticaretDemo.business.concretes.UserManager;
import eticaretDemo.core.GoogleAccountManagerAdapter;
import eticaretDemo.core.MailManager;
import eticaretDemo.dataAccess.concretes.HibernateUserDao;
import eticaretDemo.entities.concretes.User;
import eticaretDemo.googleAccount.GoogleAccountManager;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Duygu", "Adýyaman", "duygu6414@x.com", "123456");
		User user2 = new User(2, "Merve", "Adýyaman", "duygu6414@x.com", "1234569");
		UserManager userManager1 = new UserManager(new HibernateUserDao(), new MailManager());
		
		userManager1.register(user1);
		System.out.println("*******");
		userManager1.register(user2);
		
		userManager1.login(user1);
		
		GoogleAccountManager userManager2 = new GoogleAccountManager();
		userManager2.register("Google hesabýnýzla kayýt yapýldý");
		
	

	}

}
