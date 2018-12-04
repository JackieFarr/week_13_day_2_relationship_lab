package com.example.employeetracker;

import com.example.employeetracker.models.Employee;
import com.example.employeetracker.repositories.EmployeeRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeetrackerApplicationTests {

	@Autowired
	EmployeeRepo employeeRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateEmployees(){
		Employee tom = new Employee("Thomas", 24, 343, "123@fakemail.com");
		Employee bill = new Employee("William", 45, 163, "123@fakemail.com");
		Employee geoff = new Employee("Geoff", 31, 251, "123@fakemail.com");
		employeeRepo.save(tom);
		employeeRepo.save(bill);
		employeeRepo.save(geoff);

	}

}
