package application.JobAssignmentAPI.Entities;

import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Table
@Entity
public class JobEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	private String startDate;
	private String endDate;
	private HumanResourceEntity isAssigned;
	
	public JobEntity(String description, String startDate, String endDate) {
		this.setDescription(description);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
	}
	
	public JobEntity() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public HumanResourceEntity getIsAssigned() {
		return isAssigned;
	}

	public void setIsAssigned(HumanResourceEntity isAssigned) {
		this.isAssigned = isAssigned;
	}
	
}
