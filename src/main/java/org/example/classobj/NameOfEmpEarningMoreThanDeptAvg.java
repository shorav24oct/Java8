package org.example.classobj;

import org.example.classobj.db.EmpDB;
import org.example.classobj.db.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NameOfEmpEarningMoreThanDeptAvg {
    public static void main(String[] args) {
        List<Employee> employees = EmpDB.allEmp();

        Map<String, Double> avgSalDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        List<String> nameOfEmpEarningMoreThanDeptAvg = employees.stream()
                .filter(emp -> emp.getSalary() > avgSalDept.get(emp.getDept()))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(nameOfEmpEarningMoreThanDeptAvg);

    }
}
