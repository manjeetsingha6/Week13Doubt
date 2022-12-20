package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceImpl.HindiTeacher;

public class SpringDriver {

	public static void main(String[] args) {
		// 1. load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. retrieve bean from sprig container

		Teacher teacher = context.getBean("hindiTeacher", HindiTeacher.class); // bean id ,class name with.extension

		// 3. call methods on bean
		System.out.println(teacher.getHomework());

		// 4. close context

		context.close();

	}

}
