/**
 * 
 */
package hibernate.practice.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author AnudeepKumar
 *
 */
@Entity
@Table(name = "employeedetails")
public class Employee {

	@Id
	@GeneratedValue
	private int userId;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "ZIPCODE")
	private int zipcode;

	@Column(name = "JOINDATE")
	// @Temporal(TemporalType.TIME)
	private Date joindate;

	@Embedded
	//@AttributeOverrides({ @AttributeOverride(name = "salary", column = @Column(name = "details_salary")) })
	private Details details;

	@Lob
	private String description;

	/*@GenericGenerator(name="hilo-gen",strategy="hilo")
	@CollectionId(columns = { @Column(name="details_salary") }, generator = "hilo-gen", type = @Type(type="long"))
	@ElementCollection
	@JoinTable(name = "Employee_details", joinColumns = @JoinColumn(name = "employeedetails"))
	private Collection<String> data = new ArrayList<>();*/

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	@Override
	public String toString() {

		return "Id: " + this.getUserId() + "First Name: " + this.getFirstName() + "Last Name: " + this.getLastName()
				+ "Address: " + this.getAddress() + "Zipcode: " + this.getZipcode() + "Join Date: " + this.getJoindate()
				+ "Description: " + this.getDescription() + "Salary: " + this.details.getSalary() + "Experience: "
				+ this.details.getExperience();
	}

}
