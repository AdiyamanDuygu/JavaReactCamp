package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.Results.DataResult;
import hrms.hrms.core.utilities.Results.Result;
import hrms.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);
	
}
