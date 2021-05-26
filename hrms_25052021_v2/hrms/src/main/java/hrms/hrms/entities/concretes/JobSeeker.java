package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_seekers")
public class JobSeeker extends User {
	
//	@Id
//	@GeneratedValue
//	@Column(name="user_id")
//	private int user_id;
	
	@Column(name="first_name")
	private String first_name;

	@Column(name="last_name")
	private String last_name;

	@Column(name="nationality_id")
	private String nationalityId;

	@Column(name="year_of_birth")
	private int year_of_birth;
	
	public JobSeeker() {
		
	}

//	public JobSeeker(int user_id, String first_name, String last_name, String nationality_id, int year_of_birth) {
//		super();
//		this.user_id = user_id;
//		this.first_name = first_name;
//		this.last_name = last_name;
//		this.nationality_id = nationality_id;
//		this.year_of_birth = year_of_birth;
//	}

	public JobSeeker(String first_name, String last_name, String nationalityId, int year_of_birth) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.nationalityId = nationalityId;
		this.year_of_birth = year_of_birth;
	}
	
//	public int getUser_id() {
//		return user_id;
//	}
//
//	public void setUser_id(int user_id) {
//		this.user_id = user_id;
//	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getYear_of_birth() {
		return year_of_birth;
	}

	public void setYear_of_birth(int year_of_birth) {
		this.year_of_birth = year_of_birth;
	}
	
	
}
