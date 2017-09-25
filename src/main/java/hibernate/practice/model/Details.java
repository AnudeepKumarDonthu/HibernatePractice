/**
 * 
 */
package hibernate.practice.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author AnudeepKumar
 *
 */
@Embeddable
public class Details {
	@Column(name = "SAL")
	private long salary;
	private String experience;

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

}
