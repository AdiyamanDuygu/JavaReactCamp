package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobSeekerService;
import hrms.hrms.core.utilities.Results.DataResult;
import hrms.hrms.core.utilities.Results.ErrorResult;
import hrms.hrms.core.utilities.Results.Result;
import hrms.hrms.core.utilities.Results.SuccessDataResult;
import hrms.hrms.core.utilities.Results.SuccessResult;
import hrms.hrms.core.adapters.MernisServiceAdapter;
import hrms.hrms.dataAccess.abstracts.JobSeekerDao;
import hrms.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager extends MernisServiceAdapter implements JobSeekerService  {

	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "İş arayanlar listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		if(jobSeeker.getEmail()==null)
			return new ErrorResult("Email alanını doldurmadınız");
		if(jobSeeker.getPassword()==null)
			return new ErrorResult("Şifre alanını doldurmadınız");
		if(jobSeeker.getFirst_name()==null)
			return new ErrorResult("İsim alanını doldurmadınız");
		if(jobSeeker.getLast_name()==null)
			return new ErrorResult("Soyisim alanını doldurmadınız");
		if(jobSeeker.getNationalityId()==null)
			return new ErrorResult("Tc kimlik numarası alanını doldurmadınız");
		if(jobSeeker.getYear_of_birth()==0)
			return new ErrorResult("Doğum yılı alanını doldurmadınız");
		
//		if(!checkIfRealPerson(jobSeeker))
//			return new ErrorResult("Kimlik bilgilerinizi kontrol edin");
		
		if(findByEmail(jobSeeker.getEmail())!=null){
			return new ErrorResult("Bu email adresi daha önce kullanılmıştır.");
		}
		
		if(findNationalityId(jobSeeker.getNationalityId())!=null) {
			return new ErrorResult("Bu kimlik numarası daha önce kullanılmıştır.");
		}
		
//		mailManager.sendVerificationLink(jobSeeker.getemail());
//		mailManager.clickVerificationLink();
		
		this.jobSeekerDao.save(jobSeeker);
		
		return new SuccessResult("İş arayan eklendi");
	}

	private JobSeeker findByEmail(String email) {
		return this.jobSeekerDao.findByEmail(email);
	}
	
	private JobSeeker findNationalityId(String nationalityId) {
		return this.jobSeekerDao.findByNationalityId(nationalityId);
	}
	
	
}
