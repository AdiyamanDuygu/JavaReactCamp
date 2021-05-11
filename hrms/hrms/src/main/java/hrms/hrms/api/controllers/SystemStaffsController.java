package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.SystemStaffService;
import hrms.hrms.entities.concretes.SystemStaff;

@RestController
@RequestMapping("api/systemstaffs")
public class SystemStaffsController {
	
	private SystemStaffService systemStaffService;

	@Autowired
	public SystemStaffsController(SystemStaffService systemStaffService) {
		super();
		this.systemStaffService = systemStaffService;
	}
	
	@GetMapping("/getall")
	public List<SystemStaff> getAll(){
		return this.systemStaffService.getAll();
	}
}
