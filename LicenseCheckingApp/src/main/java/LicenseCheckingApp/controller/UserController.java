package LicenseCheckingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import LicenseCheckingApp.Factory.LicenseFactory;
import LicenseCheckingApp.Factory.LicenseManager;
import LicenseCheckingApp.VM.UserVM;
import LicenseCheckingApp.model.User;
import LicenseCheckingApp.service.UserService;



@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private LicenseFactory licenseFactory;

	
	@RequestMapping(method=RequestMethod.GET,value="/users")
	public List<UserVM> getAllUsers(){
		return userService.getAllUsers();
	}
	@RequestMapping(method=RequestMethod.POST,value="/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);

	}
	@RequestMapping(method=RequestMethod.GET,value="/users/validitycheck/{id}")
	public Boolean getLicenseValidity(@PathVariable String id){
		
		LicenseManager licenseManager=licenseFactory.getLicenseStatusBy(userService.getUserBy(id));
		
		return (Boolean) licenseManager.isValid();
		
	}
}

