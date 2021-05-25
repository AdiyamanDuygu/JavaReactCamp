package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employer extends User{
	
//	@Id
//	@GeneratedValue
//	@Column(name="user_id")
//	private int user_id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone_number")
	private String phone_number;
	
	public Employer() {
		
	}

//	public Employer(int user_id, String company_name, String website, String phone_number) {
//		super();
//		this.user_id = user_id;
//		this.company_name = company_name;
//		this.website = website;
//		this.phone_number = phone_number;
//	}
	
	public Employer(String company_name, String website, String phone_number) {
		super();
		this.company_name = company_name;
		this.website = website;
		this.phone_number = phone_number;
	}

//	public int getUser_id() {
//		return user_id;
//	}
//
//	public void setUser_id(int user_id) {
//		this.user_id = user_id;
//	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
}
