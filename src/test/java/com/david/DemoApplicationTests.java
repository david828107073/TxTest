package com.david;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private Environment env;

	@Test
	void contextLoads() {
	}

	@Test
	public void test() {
	}

}
