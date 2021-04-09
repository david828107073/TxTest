package com.david.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.david.entity.User;
import com.david.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void save() {
		User u = new User();
		u.setAge(18);
		u.setName("XXXX");
		u.setPhone("09705134324");
		userRepository.save(u);
		int a = 1 / 0;
	}

}
