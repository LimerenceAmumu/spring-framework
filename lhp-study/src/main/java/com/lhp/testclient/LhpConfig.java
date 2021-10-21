package com.lhp.testclient;

import com.lhp.testclient.test.InterfaceTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description: dd
 * @author: lihp
 * @date: 2021/10/21 14:56
 */
@Configuration
@Import({InterfaceTest.class})
public class LhpConfig {

	@Bean
	public TestOne testOne() {
		return new TestOne();
	}

}
