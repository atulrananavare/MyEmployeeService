package com.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private Integer empId;
    @Column(name = "First_Name")
    private String empFirstName;
    @Column(name = "Last_Name")
    private String empLastName;
    private Integer age;

}
