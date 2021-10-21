package com.lhp.testclient;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @Description:
 * @author: lihp
 * @date: 2021/10/21 14:58
 */
public class ClientLhp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(LhpConfig.class);

		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		Arrays.stream(beanDefinitionNames).forEach(System.out::println);
	}
}
