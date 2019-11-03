package LicenseCheckingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import LicenseCheckingApp.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}