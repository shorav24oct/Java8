package org.example.classobj;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalPerDept {
    public static void main(String[] args) {
        List<Employee> employees = EmpDB.allEmp();

        Map<String, Double> avgSalDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(avgSalDept);
    }
}
