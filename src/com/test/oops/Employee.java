package com.test.oops;

public class Employee extends Person {
    private int empId;
    public Employee(String name, String gender, int empId){
        super(name, gender);
        this.empId = empId;
    }
    public void work(){
        if(empId == 0){
            System.out.println("Not working: Employee does not exist!");
        }
        else {
            System.out.println("Working: Employee exist");
        }
    }

}
