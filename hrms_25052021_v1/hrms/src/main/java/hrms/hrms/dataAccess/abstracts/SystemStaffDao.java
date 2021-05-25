package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.SystemStaff;

public interface SystemStaffDao extends JpaRepository<SystemStaff, Integer>{

}
