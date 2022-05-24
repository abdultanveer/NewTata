package com.example.myapplication;

public class Employee {

    String eName;
    private String dob;
    int age;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    //the private variable / method can be accessed only within the class not outside it
    private String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        getDob();
        this.age = age;
    }
}
