package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
}
