package com.atos.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.atos.management.system.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
