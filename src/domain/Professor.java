package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
@DiscriminatorValue("PROFESSOR")
public class Professor extends Person {
	@ManyToOne
	@JoinColumn(name = "TITLE")
	private Title title;
	@Column(name = "START_DATE")
	private Date startDate;
	private Department department;
	@ManyToMany
	@JoinTable(name = "PROFESSOR_SUBJECT", joinColumns = @JoinColumn(name = "PROFESSOR_ID", referencedColumnName = "ID_PERSON"),
			inverseJoinColumns = @JoinColumn(name = "SUBJECT_ID", referencedColumnName = "ID_SUBJECT"))
	private List<Subject> subjects;
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(long id, String firstName, String lastName,User user) {
		super(id, firstName, lastName, user);
		// TODO Auto-generated constructor stub
	}
	public Professor(Title title, Date startDate,Department department,List<Subject> subjects) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.department = department;
		subjects = new ArrayList<>();
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
	
	
	

}
