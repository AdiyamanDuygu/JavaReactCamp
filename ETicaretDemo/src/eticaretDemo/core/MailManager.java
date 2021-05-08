package eticaretDemo.core;

import java.util.Scanner;

public class MailManager implements MailService{

	@Override
	public void sendVerificationLink(String eMail) {
		System.out.println("Do�rulama linki mail adresinize g�nderildi -> " + eMail +
				" L�tfen enter tu�una bas�n.");
		
	}

	@Override
	public void clickVerificationLink() {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		System.out.println("�yeli�iniz tamamlanm��t�r\n");
		scanner.close();
	}

}
