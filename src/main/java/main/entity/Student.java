package main.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student_tab")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Person {

	@Column(name="school_name",length=50)
	private String schoolName;
	
	@Column(name="fee")
	private float fee;
	
	@Column(name="section_name",length=50)
	private String sectionName;
	
}