package LicenseCheckingApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LicenseCheckingApp.VM.UserVM;
import LicenseCheckingApp.common.Converter;
import LicenseCheckingApp.model.User;
import LicenseCheckingApp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//User u=new User("id","name",LocalDate.of(2019, Month.OCTOBER, 31));
	
	public List<UserVM> getAllUsers() {
		return Converter.getUserVMList(userRepository.findAll());
	}

	public void addUser(User user) {
		userRepository.save(user);
		
	}

	public User getUserBy(String id) {
		return userRepository.getOne(id);
	}

}
