package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.Utilities.Results.DataResult;
import hrms.hrms.entities.concretes.User;


public interface UserService {
	DataResult<List<User>> getAll();
}

