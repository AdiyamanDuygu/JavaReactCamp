package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.Results.DataResult;
import hrms.hrms.core.utilities.Results.Result;
import hrms.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
}
