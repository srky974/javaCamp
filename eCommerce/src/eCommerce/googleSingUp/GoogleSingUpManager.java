package eCommerce.googleSingUp;

import java.util.ArrayList;
import java.util.List;

public class GoogleSingUpManager {
	List<String> emails=new ArrayList<String>();
	
	public void sendToVerifyMail(String email) {
		System.out.println("Kullanıcıya dogrulama meail gönderildi.");
		
	}


	

	
	public boolean checkVerifyAccount(String email) {
	if (emails.contains(email)) {
		return true;
	}
	return false;
		
	}

}
