package eticaretDemo.core;

import java.util.Scanner;

public class MailManager implements MailService{

	@Override
	public void sendVerificationLink(String eMail) {
		System.out.println("Doðrulama linki mail adresinize gönderildi -> " + eMail +
				" Lütfen enter tuþuna basýn.");
		
	}

	@Override
	public void clickVerificationLink() {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		System.out.println("Üyeliðiniz tamamlanmýþtýr\n");
		scanner.close();
	}

}
