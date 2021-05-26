package hrms.hrms.core.services;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailManager  {
	
	public void sendVerificationLink(String eMail) {
		System.out.println("Doğrulama linki mail adresinize gönderildi -> " + eMail +
				" Lütfen enter tuşuna basın.");
		
	}
	
	public void clickVerificationLink() {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		System.out.println("Kaydınız tamamlanmıştır\n");
		scanner.close();
	}
	
	public boolean isEmailControl(String email) {
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			return true;
		}
		System.out.println("E-posta alanı e-posta formatında olmalıdır.\n");
		return false;
	}
}
