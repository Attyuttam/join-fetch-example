package com.attyuttam.joinfetchexample.application.service;

import java.util.List;
import java.util.Set;

import com.attyuttam.joinfetchexample.domain.Department;
import com.attyuttam.joinfetchexample.domain.DepartmentRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public Set<Department> getAllDepartmentsByJoin() {
        return departmentRepository.fetchAllDepartmentsByJoin();
    }

    public Set<Department> getAllDepartmentsByJoinFetch() {
        return departmentRepository.fetchAllDepartmentsByJoinFetch();
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
