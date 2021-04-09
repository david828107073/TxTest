package com.david.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.david.entity.Product;
import com.david.entity.User;
import com.david.repository.ProductRepository;
import com.david.repository.UserRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Transactional
	public void transationTest() {
		try {
			Product p = new Product();
			save(p);
			userService.save();
		} catch (Exception e) {
			System.out.println("Test");
		}
	}

//	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void save(Product p) {
		p.setBrand("XXX");
		p.setName("YYY");
		p.setPrice(new BigDecimal(10));
		p.setStore(1);
		productRepository.saveAndFlush(p);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void save2() throws Exception {
		try {
			User u = new User();
			u.setAge(18);
			u.setName("maureen");
			u.setPhone("09123456789");
			userRepository.save(u);
			int i = 1 / 0;
		} catch (Exception e) {
//			System.out.println("不想回滾啦~~");
			throw new Exception("save()不回滾");
		}
	}
}
