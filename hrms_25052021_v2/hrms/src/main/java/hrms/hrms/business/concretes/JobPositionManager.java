package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobPositionService;
import hrms.hrms.core.utilities.Results.DataResult;
import hrms.hrms.core.utilities.Results.ErrorResult;
import hrms.hrms.core.utilities.Results.Result;
import hrms.hrms.core.utilities.Results.SuccessDataResult;
import hrms.hrms.core.utilities.Results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.JobPositionDao;
import hrms.hrms.entities.concretes.JobPosition;
import hrms.hrms.entities.concretes.JobSeeker;

@Service
public class JobPositionManager implements JobPositionService {

private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "İş pozisyonları listelendi");
	}

	@Override
	public Result add(JobPosition jobPosition) {

		if(findByDescription(jobPosition.getDescription())!=null){
			return new ErrorResult("Bu iş pozisyonu daha önce tanımlanmıştır.");
		}
		
		this.jobPositionDao.save(jobPosition);
		
		
		return new SuccessResult("İş pozisyonu eklendi");
	}

	private JobPosition findByDescription(String description) {
		return this.jobPositionDao.findByDescription(description);
	}

}
