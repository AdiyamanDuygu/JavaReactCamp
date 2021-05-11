package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.SystemStaffService;
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
	public List<SystemStaff> getAll() {
		return this.systemStaffDao.findAll();
	}


}
