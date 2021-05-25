package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.Utilities.Results.DataResult;
import hrms.hrms.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
}
