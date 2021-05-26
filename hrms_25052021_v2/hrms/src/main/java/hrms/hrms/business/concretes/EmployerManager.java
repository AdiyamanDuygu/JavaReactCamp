package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.EmployerService;
import hrms.hrms.core.utilities.Results.Result;
import hrms.hrms.core.services.MailManager;
import hrms.hrms.core.utilities.Results.DataResult;
import hrms.hrms.core.utilities.Results.ErrorResult;
import hrms.hrms.core.utilities.Results.SuccessDataResult;
import hrms.hrms.core.utilities.Results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.EmployerDao;
import hrms.hrms.entities.concretes.Employer;
import hrms.hrms.entities.concretes.JobSeeker;

@Service
public class EmployerManager extends MailManager implements EmployerService {

	private EmployerDao employerDao;
	
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İş verenler listelendi");
	}

	@Override
	public Result add(Employer employer) {
		if(employer.getEmail()==null)
			return new ErrorResult("Email alanını doldurmadınız");
		if(employer.getPassword()==null)
			return new ErrorResult("Şifre alanını doldurmadınız");
		if(employer.getCompany_name()==null)
			return new ErrorResult("Şirket ismi alanını doldurmadınız");
		if(employer.getPhone_number()==null) {
			return new ErrorResult("Telefon numarası alanını doldurmadınız");
		}
		if(employer.getWebsite()==null) {
			return new ErrorResult("Web sitesi alanını doldurmadınız");
		}
		
		if(!isEmailControl(employer.getEmail())) {
			return new ErrorResult("Doğru bir email adresi giriniz.");
		}
		
		if(findByEmail(employer.getEmail())!=null){
			return new ErrorResult("Bu email adresi daha önce kullanılmıştır.");
		}
		
		sendVerificationLink(employer.getEmail());
		clickVerificationLink();
		
		employerDao.save(employer);
		
		return new SuccessResult("İş veren eklendi");
	} 
	
	private Employer findByEmail(String email) {
		return this.employerDao.findByEmail(email);
	}

}
