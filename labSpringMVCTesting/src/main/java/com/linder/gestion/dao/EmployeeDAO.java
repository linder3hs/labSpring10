package com.linder.gestion.dao;


import com.linder.gestion.exception.DAOException;
import com.linder.gestion.exception.EmptyResultException;
import com.linder.gestion.model.Employee;

public interface EmployeeDAO {

	Employee findEmployee(int id) throws DAOException, EmptyResultException;

}
