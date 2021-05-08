package eticaretDemo.business.concretes;

import java.util.List;

import eticaretDemo.business.abstracts.UserService;
import eticaretDemo.core.GoogleAccountService;
import eticaretDemo.entities.concretes.User;

public class GoogleAccountManager implements UserService {

	GoogleAccountService googleAccountService;
	
	public GoogleAccountManager(GoogleAccountService googleAccountService) {
		this.googleAccountService = googleAccountService;
	}
	
	@Override
	public void register(User user) {
		googleAccountService.registerToSystem("Google hesab�n�z ile kayd�n�z ger�ekle�tirildi");
		
	}

	@Override
	public void login(User user) {
		System.out.println("Google hesab�n�zla giri� yap�ld�");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

}
