package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.Results.DataResult;
import hrms.hrms.entities.concretes.SystemStaff;

public interface SystemStaffService {
	DataResult<List<SystemStaff>> getAll();
}
