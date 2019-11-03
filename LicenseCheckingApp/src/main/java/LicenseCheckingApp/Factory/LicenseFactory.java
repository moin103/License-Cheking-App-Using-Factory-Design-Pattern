package LicenseCheckingApp.Factory;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LicenseCheckingApp.common.Converter;
import LicenseCheckingApp.model.User;
import LicenseCheckingApp.service.UserService;
import LicenseCheckingApp.VM.UserVM;
@Service
public class LicenseFactory {
	
	@Autowired
	private UserService userService;
	
	public LicenseManager getLicenseStatusBy(User user) {
		LicenseManager licenseManager = null;
		UserVM userVM =Converter.getUserVM(user);
		
		switch (userVM.getLicensetype().getLicenseBasedType()) {
		case TIMEBASED:
			licenseManager = new TimeBasedLicenseManagerImpl(userVM);	
			break;
		}
		return licenseManager;
}
}
