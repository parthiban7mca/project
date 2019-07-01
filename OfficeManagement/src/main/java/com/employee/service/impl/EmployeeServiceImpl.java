package com.employee.service.impl;

import java.util.List;
import java.util.Optional;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.employee.model.Employee;

import com.employee.repository.EmployeeRepository;
import com.employee.services.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee insertDetail(Employee employee) throws ServiceException {
		return employeeRepository.save(employee);
	}

	public List<Employee> get() {
		try {
			return employeeRepository.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	public Optional<Employee> getid(long id) {
		try {
			return employeeRepository.findById(id);
		} catch (Exception e) {
			return null;
		}
	}

	public Employee update(long id, Employee employee) {
		try {
			employee.setId(id);

			return employeeRepository.save(employee);
		} catch (Exception e) {
			return null;
		}

	}

	public void delete(long id) {
		try {
			employeeRepository.deleteById(id);

		} catch (Exception e) {

		}

	}
}
