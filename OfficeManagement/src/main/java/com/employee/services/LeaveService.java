package com.employee.services;

import java.util.List;
import com.employee.model.Leave;

public interface LeaveService {

	public Leave creates(long id, Leave leave);

	public List<Leave> getid(long employeeId);

}
