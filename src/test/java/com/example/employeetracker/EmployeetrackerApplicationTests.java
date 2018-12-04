package com.example.employeetracker;

import com.example.employeetracker.models.Department;
import com.example.employeetracker.models.Employee;
import com.example.employeetracker.models.Project;
import com.example.employeetracker.repositories.DepartmentRepo;
import com.example.employeetracker.repositories.EmployeeRepo;
import com.example.employeetracker.repositories.ProjectRepo;
import org.junit.Before;
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

	@Autowired
    DepartmentRepo departmentRepo;

	@Before
    public void before(){
        Department admin = new Department("Admin");
        departmentRepo.save(admin);
        Employee tom = new Employee("Thomas", "24", 343, admin);
        employeeRepo.save(tom);
    }

	@Test
	public void contextLoads() {
	}

    @Test
    public void canCreateProject(){
	    Project project1 = new Project("X", 11);
	    projectRepo.save(project1);
    }

    @Test
    public void canAddEmployeeToProject(){
        Department hr = new Department("Human Resources");
        departmentRepo.save(hr);
        Employee tom = new Employee("Tom", "24", 343, hr);
        employeeRepo.save(tom);
        Project project = new Project("X", 11);
        projectRepo.save(project);
        project.addEmployee(tom);
        projectRepo.save(project);
    }

    @Test
    public void canCreateDepartment(){
        Department hr = new Department("Human Resources");
        departmentRepo.save(hr);
    }

}
