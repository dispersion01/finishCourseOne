package ru.spypro.homework;

public class Employee {
    String familyName;
    int department;
    int salary;
    int id;

    public Employee(int id, String familyName, int department, int salary) {
        this.id = id;
        this.familyName = familyName;
        this.department = department;
        this.salary = salary;
    }


    public String getFamilyName() {
        return familyName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
@Override
    public String toString() {
        return id + " " + familyName + " " + department + " " + salary;
    }
    }