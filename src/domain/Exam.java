package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EXAM")
public class Exam implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1060320200287L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EXAM")
	private long id;
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
	private Student student;
	@OneToOne
	@JoinColumn(name = "PROFESSOR_ID")
	private Professor professor;
	@OneToOne
	@JoinColumn(name = "SUBJECT_ID")
	private Subject subject;
	@Column(name = "EXAM_DATE")
	private Date DateExam;
	@Column(name = "MARK")
	private String mark;
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(long id,Student student, Professor professor, Subject subject, Date dateExam, String mark) {
		super();
		this.setId(id);
		this.student = student;
		this.professor = professor;
		this.subject = subject;
		DateExam = dateExam;
		this.mark = mark;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Date getDateExam() {
		return DateExam;
	}
	public void setDateExam(Date dateExam) {
		DateExam = dateExam;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	

}
