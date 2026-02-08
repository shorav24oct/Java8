package org.example.classobj;

import org.example.classobj.db.EmpDB;
import org.example.classobj.db.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class YoungestEmpInEachDept {
    public static void main(String[] args) {
        List<Employee> employees = EmpDB.allEmp();

        Map<String, Optional<Employee>> minAge = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.minBy(Comparator.comparingInt(Employee::getAge))));

        minAge.forEach((d, a) -> System.out.println(d + " -> " + a.get().getAge()));

    }
}
