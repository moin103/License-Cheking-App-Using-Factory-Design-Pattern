package LicenseCheckingApp.Factory;

import java.time.LocalDate;
import java.time.Period;

import LicenseCheckingApp.VM.UserVM;
import LicenseCheckingApp.model.User;

public class TimeBasedLicenseManagerImpl implements TimeBasedLicenseManager{

	public boolean status;
	UserVM uservm;
	
	public TimeBasedLicenseManagerImpl(UserVM uservm) {
		// TODO Auto-generated constructor stub
		this.uservm=uservm;
	}

	@Override
	public Boolean isValid() {
		LocalDate today=LocalDate.now();
		Period period = Period.between(today,uservm.getValidTill());
		if(period.getDays()>=0) {
			return true;
		}
		else {
			return false;
			}
	}
	}