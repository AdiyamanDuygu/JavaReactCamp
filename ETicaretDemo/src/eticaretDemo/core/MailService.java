package eticaretDemo.core;

public interface MailService {
	void sendVerificationLink(String eMail);
	void clickVerificationLink();
}
