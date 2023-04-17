package com.company;

public class School {
    private String name;
    private Student[] student;

    public com.company.Student[] getStudent() {
        return student;
    }

    public void setStudent(com.company.Student[] student) {
        student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int quantityStudents() {
        int counter = 0;
        for (Student student : student) {
            if (student.getAge() > 10) {
                counter++;
                System.out.println(student.getName());
                System.out.println(student.getAge());
            }
        }
return counter;
    }
}
