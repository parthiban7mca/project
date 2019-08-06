package com.employee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Leave;
import com.employee.service.impl.LeaveServiceImpl;

@RestController

public class LeaveController {

	@Autowired
	private LeaveServiceImpl service;

	@PostMapping("employee/{id}/leave")
	public Leave create(@PathVariable("id") long id, @RequestBody Leave leave) {
		return service.creates(id, leave);
	}

	@GetMapping("employee/{employeeId}/leave")
	public List<Leave> getById(@PathVariable("employeeId") long employeeId) {
		return service.getid(employeeId);
	}

}
