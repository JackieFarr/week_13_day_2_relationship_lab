package com.example.employeetracker;

import com.example.employeetracker.models.Employee;
import com.example.employeetracker.models.Project;
import com.example.employeetracker.repositories.EmployeeRepo;
import com.example.employeetracker.repositories.ProjectRepo;
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

	@Autowired
    ProjectRepo projectRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateEmployees(){
		Employee tom = new Employee("Thomas", "24", 343);
		Employee bill = new Employee("William", "45", 163);
		Employee geoff = new Employee("Geoff", "31", 251);
		employeeRepo.save(tom);
		employeeRepo.save(bill);
		employeeRepo.save(geoff);

	}

	@Test
    public void canCreateProject(){
        Project project = new Project("X", 11);
        projectRepo.save(project);
    }

}
