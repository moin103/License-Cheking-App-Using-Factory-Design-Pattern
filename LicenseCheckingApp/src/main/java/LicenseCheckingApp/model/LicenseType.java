package LicenseCheckingApp.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import LicenseCheckingApp.Factory.LicenseBasedType;

@Entity
@Table(name="LICENSE_TYPE")
public class LicenseType implements Serializable {

	@Id
	private String name;
	private LicenseBasedType licenseBasedType;
	
	
	public LicenseType() {
		super();
		
	}	
	
	
	public LicenseType(String name, LicenseBasedType licenseBasedType) {
		super();

		this.name = name;
		this.licenseBasedType = licenseBasedType;
	}

	
	public LicenseBasedType getLicenseBasedType() {
		return licenseBasedType;
	}
	public void setLicenseBasedType(LicenseBasedType licenseBasedType) {
		this.licenseBasedType = licenseBasedType;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
