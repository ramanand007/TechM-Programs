package com.company.employee_manageemnt_test_project_1;
import com.company.employee_manageemnt_test_project_1.Employee;
import com.company.employee_manageemnt_test_project_1.EmployeeRepository;
import com.company.employee_manageemnt_test_project_1.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@SuppressWarnings("unused")
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElseThrow();
    }

    @Override
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee emp = getEmployeeById(id);
        emp.setName(updatedEmployee.getName());
        emp.setEmail(updatedEmployee.getEmail());
        emp.setSalary(updatedEmployee.getSalary());
        emp.setDepartment(updatedEmployee.getDepartment());
        return employeeRepo.save(emp);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }
}