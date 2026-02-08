package org.example.classobj;

import org.example.classobj.db.EmpDB;
import org.example.classobj.db.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmpInDept {
    public static void main(String[] args) {
        List<Employee> employees = EmpDB.allEmp();

        Map<String, Long> empCount = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.counting()
                ));

        System.out.println(empCount);
    }
}
