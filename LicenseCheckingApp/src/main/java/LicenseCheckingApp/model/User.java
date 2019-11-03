package LicenseCheckingApp.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable{
	
	@Id
	private String id;
	private String name;
	private LocalDate validTill ;

	@OneToOne(cascade = CascadeType.ALL)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name="USER_ID")
	private LicenseType licensetype;

	public User(String id, String name,LocalDate validTill, LicenseType licensetype) {
		super();
		this.id = id;
		this.name = name;
		this.validTill = validTill;
		this.licensetype = licensetype;
	}
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LocalDate getValidTill() {
		return validTill;
	}

	public void setValidTill(LocalDate validTill) {
		this.validTill = validTill;
	
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	
	}	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	
	}	

	public LicenseType getLicensetype() {
		return licensetype;
	}


	public void setLicensetype(LicenseType licensetype) {
		this.licensetype = licensetype;
	}


}