package Adapters;

import java.rmi.RemoteException;

import Abstract.MemberCheckService;
import Entities.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements MemberCheckService {

	@Override
	public boolean checkIfRealPerson(Member member) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try {
			 result = client.TCKimlikNoDogrula(Long.parseLong(member.getNationalityId()), member.getFirstName().toUpperCase(), 
					member.getLastName().toUpperCase(), member.getDateOfBirth().getYear());
		} 
		catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	
	}

}
