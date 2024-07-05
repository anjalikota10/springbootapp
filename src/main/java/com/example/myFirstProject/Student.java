package com.example.myFirstProject;

public class Student {
    int rollno;
    String name;
    float percentage;

    Student(int rollno,String name,float percentage)
    {
        this.rollno=rollno;
        this.name=name;
        this.percentage=percentage;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
