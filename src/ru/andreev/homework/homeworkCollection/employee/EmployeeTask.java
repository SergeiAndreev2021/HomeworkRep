package ru.andreev.homework.homeworkCollection.employee;

import java.util.Comparator;
import java.util.List;

public class EmployeeTask {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.employeeGenerator(50);
        System.out.println(employeeList.toString());

        Comparator<Employee> sortnames = new SortNames();
        Comparator<Employee> sortsalary = new SortSalary();
        Comparator<Employee> namesThenSalary = sortnames.thenComparing(sortsalary);

        employeeList.sort(sortnames);        // TODO 1: отсортировать список по имени

        employeeList.sort(namesThenSalary);  // TODO 2: отсортировать список по имени и зп

        employeeList.sort(namesThenSalary.thenComparing(new SortAge()).thenComparing(new SortCompany()));  // TODO 3: отсортировать список по имени, зарплате, возрасту и компании
        System.out.println(employeeList);
    }
}
