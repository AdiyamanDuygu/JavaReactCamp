package hrms.hrms.core.services;

public interface MailService {
	void sendVerificationLink(String eMail);
	void clickVerificationLink();
}
