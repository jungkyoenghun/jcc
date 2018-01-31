package net.slipp.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	//User findByUserId(String userId);

	User findByUserId(String userId);

	
}
