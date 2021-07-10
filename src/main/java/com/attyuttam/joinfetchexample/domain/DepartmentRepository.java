package com.attyuttam.joinfetchexample.domain;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query(value = "SELECT d FROM Department d JOIN d.employeeList")
    Set<Department> fetchAllDepartmentsByJoin();

    @Query(value = "SELECT d FROM Department d JOIN FETCH d.employeeList")
    Set<Department> fetchAllDepartmentsByJoinFetch();
}
