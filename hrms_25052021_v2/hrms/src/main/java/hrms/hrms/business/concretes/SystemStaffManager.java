package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.SystemStaffService;
import hrms.hrms.core.utilities.Results.DataResult;
import hrms.hrms.core.utilities.Results.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.SystemStaffDao;
import hrms.hrms.entities.concretes.SystemStaff;

@Service
public class SystemStaffManager implements SystemStaffService  {

	private SystemStaffDao systemStaffDao;
	
	@Autowired
	public SystemStaffManager(SystemStaffDao systemStaffDao) {
		super();
		this.systemStaffDao = systemStaffDao;
	}

	@Override
	public DataResult<List<SystemStaff>> getAll() {
		return new SuccessDataResult<List<SystemStaff>>(this.systemStaffDao.findAll(), "Sistem personelleri listelendi");
	}


}
