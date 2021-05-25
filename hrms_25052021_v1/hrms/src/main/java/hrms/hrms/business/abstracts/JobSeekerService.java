package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	List<JobSeeker> getAll();
}
