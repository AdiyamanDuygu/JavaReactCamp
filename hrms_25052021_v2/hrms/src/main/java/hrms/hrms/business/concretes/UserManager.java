package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.UserService;
import hrms.hrms.core.utilities.Results.DataResult;
import hrms.hrms.core.utilities.Results.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.UserDao;
import hrms.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Tüm kullanıcılar listelendi");
	}

}
