package com.country.demo1;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

public class SampleJPAControllertest {
	@Autowired
	private SampleService a;
	@Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
			
	List<EmployeeEntity> employee_name=a.getSample();
	 Assert.assertEquals(employee_name.size(),8);
}
}
