package domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("STUD")
public class Student extends Person {
	private static final long serialVersionUID = 1084206032020L;
	@Column(name = "INDEX_NUMBER")
	private String index;
	@Column(name = "BIRTH_DATE")
	private Date dateofBirth;
	@OneToMany(mappedBy = "student")
	private Set <Exam> exam;
	@ManyToOne
	@JoinColumn(name = "PROGRAM")
	private Program program;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String firstName, String lastName, User user) {
		super(id, firstName, lastName, user);
		// TODO Auto-generated constructor stub
	}
	public Student(String index, Date dateofBirth,Set<Exam>exam, Program program) {
		super();
		this.index = index;
		this.dateofBirth = dateofBirth;
		this.exam = exam;
		this.program = program;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public Set <Exam> getExam() {
		return exam;
	}
	public void setExam(Set <Exam> exam) {
		this.exam = exam;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	
	

}
