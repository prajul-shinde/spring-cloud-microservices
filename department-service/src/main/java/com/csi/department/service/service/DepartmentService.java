package com.csi.department.service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.csi.department.service.entity.Department;
import lombok.AllArgsConstructor;
import com.csi.department.service.repository.DepartmentRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentService {
	
	private DepartmentRepository repository;

	public Department saveDepartment(Department department) {
		log.info("inside saveDepartment of departmentService");
		return repository.save(department);
	}

	public Optional<Department> findDepartmentById(Long departmentId) {

		return repository.findById(departmentId);
	}
}
