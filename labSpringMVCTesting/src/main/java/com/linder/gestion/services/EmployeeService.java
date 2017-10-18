package com.linder.gestion.services;

import com.linder.gestion.exception.DAOException;
import com.linder.gestion.exception.EmptyResultException;
import com.linder.gestion.model.Employee;

public interface EmployeeService {
	
	Employee find(int employee_id) throws DAOException, EmptyResultException;

}
