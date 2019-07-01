package com.employee.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;

import com.employee.model.Employee;

public interface EmployeeService {

	public Employee insertDetail(Employee employee) throws ServiceException;

	public List<Employee> get();

	public Optional<Employee> getid(long id);

	public Employee update(long id, Employee employee);

	public void delete(long id);
}
