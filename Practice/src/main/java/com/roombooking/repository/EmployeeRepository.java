package com.roombooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roombooking.entity.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
