package org.example.domen;

import jakarta.persistence.*;
//import jakarta.persistence.criteria.CriteriaBuilder;

import java.sql.Date;


@Entity(name = "workers")
@Table(name = "workers")
public class Worker {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "place_of_birth")
    private String placeOfBirth;
    @Column(name = "salary")
    private Double salary;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departament department;

    public Worker() {}

    public Worker(Integer id, String name, String secondName, Date dateOfBirth, String placeOfBirth, Double salary, Departament department) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.salary = salary;
        this.department = department;
    }



    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", salary=" + salary +
                ", department=" + (department != null ? department.getName() : "Департамента еще нет") +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Departament getDepartament() {
        return department;
    }

    public void setDepartament(Departament department) {
        this.department = department;
    }
}