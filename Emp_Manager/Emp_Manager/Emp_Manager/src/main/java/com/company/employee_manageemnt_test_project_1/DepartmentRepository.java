package com.company.employee_manageemnt_test_project_1;
import com.company.employee_manageemnt_test_project_1.Department;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("unused")
public interface DepartmentRepository extends JpaRepository<Department, Long> {}