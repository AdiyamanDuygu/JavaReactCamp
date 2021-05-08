package eticaretDemo.business.concretes;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eticaretDemo.business.abstracts.UserService;
import eticaretDemo.core.GoogleAccountService;
import eticaretDemo.core.MailService;
import eticaretDemo.dataAccess.abstracts.UserDao;
import eticaretDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private MailService mailService;
	
	public UserManager(UserDao userDao, MailService mailService) {
		super();
		this.userDao = userDao;
		this.mailService = mailService;
	}
	
	@Override
	public void register(User user) {
		if(!fieldsEmptyControl(user)) {
			return;
		}
		
		if(!passwordSizeControl(user.getPassword())) {
			return;
		}
		
		if(!isEmailControl(user.geteMail())) {
			return;
		}
		 
		if(!isSameEmailControl(user.geteMail())) {
			return;
		}
		
		if(!nameSizeControl(user.getFirstName(), user.getLastName())){
			return;
		}
		
		
		mailService.sendVerificationLink(user.geteMail());
		
		mailService.clickVerificationLink();
		
		userDao.add(user);
	}

	@Override
	public void login(User user) {
		if(loginControl(user.geteMail(), user.getPassword())) {
			System.out.println("Sisteme ba�ar�l� bir �ekilde giri� yapt�n�z.\n");
		}
		
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
	
	@Override
	public User get(String mail) {
		return userDao.get(mail);
	}
	
	private boolean fieldsEmptyControl(User user) {
		if(!user.getFirstName().isEmpty() || !user.getLastName().isEmpty() || 
				!user.geteMail().isEmpty() || !user.getPassword().isEmpty()) {
			return true;
		}
		System.out.println("T�m alanlar� doldurmak zorundas�n�z.\n");
		return false;
	}
	private boolean passwordSizeControl(String password) {
		if(password.length()>=6){
			return true;
		}
		System.out.println("�ifre en az 6 karakterden olu�mal�d�r.\n");
		return false;
	}
	
	private boolean isEmailControl(String email) {
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			return true;
		}
		System.out.println("E-posta alan� e-posta format�nda olmal�d�r.\n");
		return false;
	}

	private boolean isSameEmailControl(String email) {
		if(userDao.getAll().size()>0) {
			if(userDao.get(email)== null) {
				return true;
			}
		}
		else {
			return true;
		}
		System.out.println("Ayn� e-posta daha �nce kullan�lm��t�r.\n");
		return false;
	}

	private boolean nameSizeControl(String firstName, String lastName) {
		if(firstName.length()>=2 && lastName.length()>=2) {
			return true;
		}
		System.out.println("Ad ve soyad en az 2 karakterden olu�mal�d�r.\n");
		return false;
	}
	
	private boolean loginControl(String email, String password) {
		if(!email.isEmpty() && !password.isEmpty()){
			return true;
		}
		System.out.println("E-posta ve �ifre bo� b�rak�lamaz.\n");
		return false;
	}
}
