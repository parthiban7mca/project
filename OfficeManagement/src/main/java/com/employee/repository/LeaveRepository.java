package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.model.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Long> {

	List<Leave> findByEmployeeId(long employeeId);

}
