package com.csi.department.service.controller;

import org.springframework.web.bind.annotation.*;

import com.csi.department.service.entity.Department;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.csi.department.service.service.DepartmentService;

import java.util.Optional;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

	private DepartmentService service;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("inside saveDepartment method of departmentController");
		return service.saveDepartment(department);
	}

	@GetMapping("/{id}")
	public Optional<Department> findDepartmentById(@PathVariable Long departmentId){
		log.info("inside findDepartmentById method of departmentController");
		return service.findDepartmentById(departmentId);
	}
}
