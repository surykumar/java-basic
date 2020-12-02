package com.test.oops;

public abstract class Person {
    private String name;
    private String gender;

    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public abstract void work();
    public void updateName(String name){
        this.name  = name;
    }
    public void info(){
        System.out.println("Name: " + name + ", " + "Gender: "+gender);
    }
}
