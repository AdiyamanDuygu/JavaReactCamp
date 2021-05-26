package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_positions")
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
//	@Column(name="employer_id")
//	private int employer_id;
	
	public JobPosition() {
		
	}

	public JobPosition(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
