package com.example.avi;

import java.util.Objects;

public class EmployeeSorter{
    public void sort(Employee[] employees){
        for(int i=0;i<employees.length;i++){
            Employee current = employees[i];
            int j = i-1;
            while(j>=0 && employees[j].compareTo(current)>0){
                employees[j+1]=employees[j];
                j--;
            }
            employees[j+1]=current;
        }
    }
}


class Employee implements Comparable<Employee>{
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String emailId;

    public Employee(int employeeNumber, String firstName, String lastName, String emailId) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeNumber == employee.employeeNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber);
    }

    @Override
    public int compareTo(Employee o) {
        if(o==null){return -1;}
        if(this.employeeNumber>o.employeeNumber){return 1;}
        if(this.employeeNumber==o.employeeNumber){return 0;}
        return -1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                '}';
    }
}