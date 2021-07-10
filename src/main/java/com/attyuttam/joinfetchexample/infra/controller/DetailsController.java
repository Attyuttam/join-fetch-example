package com.attyuttam.joinfetchexample.infra.controller;

import java.util.List;
import java.util.Set;

import com.attyuttam.joinfetchexample.application.service.DepartmentService;
import com.attyuttam.joinfetchexample.domain.Department;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DetailsController {
    private final DepartmentService departmentService;
    
    @GetMapping("/join")
    public Set<Department> getAllDepartmentsByJoin(){
        return departmentService.getAllDepartmentsByJoin();
    }

    @GetMapping("/join-fetch")
    public Set<Department> getAllDepartmentsByJoinFetch(){
        return departmentService.getAllDepartmentsByJoinFetch();
    }

    @GetMapping("/generic")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
