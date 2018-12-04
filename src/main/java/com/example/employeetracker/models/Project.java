package com.example.employeetracker.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "number_of_days")
    private int numOfDays;

    @ManyToMany
    @JoinTable(
            name = "projects_employees",
            joinColumns = { @JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)
            },

            inverseJoinColumns = {@JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false)
            })

    private List <Employee> employees;

    public Project(String name, int numOfDays) {
        this.name = name;
        this.numOfDays = numOfDays;
        this.employees = new ArrayList<>();
    }

    public Project() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public void setEmployees(List employees) {
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public List getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
}
