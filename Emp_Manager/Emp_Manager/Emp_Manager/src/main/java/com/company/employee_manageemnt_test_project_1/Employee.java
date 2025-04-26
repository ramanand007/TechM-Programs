package com.company.employee_manageemnt_test_project_1;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@SuppressWarnings("unused")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
