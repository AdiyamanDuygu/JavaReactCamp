package eticaretDemo.core;

import eticaretDemo.googleAccount.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements GoogleAccountService {
	
	GoogleAccountManager googleAccountManager = new GoogleAccountManager();
	
	@Override
	public void registerToSystem(String message) {
		googleAccountManager.register(message);
		
	}

	@Override
	public void loginToSystem(String message) {
		googleAccountManager.login(message);
		
	}

}
