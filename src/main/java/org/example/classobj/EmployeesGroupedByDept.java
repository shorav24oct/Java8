package org.example.classobj;

import org.example.classobj.db.EmpDB;
import org.example.classobj.db.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesGroupedByDept {
    public static void main(String[] args) {

        List<Employee> employees = EmpDB.allEmp();

        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        byDept.forEach((k,v) -> System.out.println(k + " -> " + v.size()));
    }
}
