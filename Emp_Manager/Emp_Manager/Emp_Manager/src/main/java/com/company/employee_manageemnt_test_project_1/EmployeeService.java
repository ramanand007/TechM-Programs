package com.company.employee_manageemnt_test_project_1;
import com.company.employee_manageemnt_test_project_1.Employee;
import java.util.*;

@SuppressWarnings("unused")
public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee updatedEmployee);
    void deleteEmployee(Long id);
}
