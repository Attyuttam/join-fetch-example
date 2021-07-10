package com.attyuttam.joinfetchexample.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="department_id",nullable=false)
    private Department department;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_role")
    private String employeeRole;
}
