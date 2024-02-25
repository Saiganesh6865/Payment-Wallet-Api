package com.jsp.Paymentwallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.Paymentwallet.dto.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
    User login(@Param("email") String email, @Param("password") String password);
}
