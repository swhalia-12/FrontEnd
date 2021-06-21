package FrontEnd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Employee.
 */
@Entity
@Table(name = "EMPLOYEELIST")
public class Employee {
	
	/** The emp code. */
	@Id
	private int empCode;
	
	
	/** The emp name. */
	private String empName;
	
	/** The emp loc. */
	private String empLoc;
	
	/** The emp mail. */
	private String empMail;
	
	/** The emp DOB. */
	private String empDOB;

	/**
	 * Gets the emp code.
	 *
	 * @return the emp code
	 */
	public int getEmpCode() {
		return empCode;
	}

	/**
	 * Sets the emp code.
	 *
	 * @param empCode the new emp code
	 */
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	/**
	 * Gets the emp name.
	 *
	 * @return the emp name
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * Sets the emp name.
	 *
	 * @param empName the new emp name
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * Gets the emp loc.
	 *
	 * @return the emp loc
	 */
	public String getEmpLoc() {
		return empLoc;
	}

	/**
	 * Sets the emp loc.
	 *
	 * @param empLoc the new emp loc
	 */
	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}

	/**
	 * Gets the emp mail.
	 *
	 * @return the emp mail
	 */
	public String getEmpMail() {
		return empMail;
	}

	/**
	 * Sets the emp mail.
	 *
	 * @param empMail the new emp mail
	 */
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	/**
	 * Gets the emp DOB.
	 *
	 * @return the emp DOB
	 */
	public String getEmpDOB() {
		return empDOB;
	}

	/**
	 * Sets the emp DOB.
	 *
	 * @param empDOB the new emp DOB
	 */
	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", empLoc=" + empLoc + ", empMail=" + empMail
				+ ", empDOB=" + empDOB + "]";
	}

}
