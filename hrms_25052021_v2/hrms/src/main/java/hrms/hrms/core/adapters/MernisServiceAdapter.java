package hrms.hrms.core.adapters;

import java.rmi.RemoteException;

import hrms.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter {
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try {
			 result = client.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalityId()), jobSeeker.getFirst_name().toUpperCase(), 
					jobSeeker.getLast_name().toUpperCase(), jobSeeker.getYear_of_birth());
		} 
		catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
