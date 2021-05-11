package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.SystemStaff;

public interface SystemStaffService {
	List<SystemStaff> getAll();
}
