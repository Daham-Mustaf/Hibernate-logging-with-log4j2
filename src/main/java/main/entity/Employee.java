package main.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee_tab",
uniqueConstraints = {
	      @UniqueConstraint(
	          columnNames = {"email"},
	          name="email_uniq"
	      )
	   }
	)
public class Employee extends Person{
	
	@Column(name="salary",columnDefinition="DECIMAL(7,2)")
	private Double salary;
	
	@Column(name="date_of_joining")
	private Date doj;
	
	@Column(name="dept_name",length=30)
	private String deptName;
	
	@Column(name="bonus",precision=6,scale=3)
	private BigDecimal bonus;
	
	@Column(name="email",length=30)
	private String email;
}