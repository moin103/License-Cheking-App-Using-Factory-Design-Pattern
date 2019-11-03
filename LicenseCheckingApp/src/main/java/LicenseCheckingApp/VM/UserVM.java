package LicenseCheckingApp.VM;

import java.time.LocalDate;

import LicenseCheckingApp.model.LicenseType;

public class UserVM {
	String id;
	String name;
	LocalDate validTill ;
	LicenseType licensetype;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getValidTill() {
		return validTill;
	}
	public void setValidTill(LocalDate validTill) {
		this.validTill = validTill;
	}
	public LicenseType getLicensetype() {
		return licensetype;
	}
	public void setLicensetype(LicenseType licensetype) {
		this.licensetype = licensetype;
	}


	public UserVM(String id, String name,LicenseType licensetype, LocalDate validTill) {
		super();
		this.id = id;
		this.name = name;
		this.licensetype= licensetype;
		this.validTill=validTill;
	}
	
	
}
