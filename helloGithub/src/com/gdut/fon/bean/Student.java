package com.gdut.fon.bean;

public class Student {
    private int sno;
    private String name;
    private int classNo;

    public Student(int sno, String name, int classNo) {
        this.sno = sno;
        this.name = name;
        this.classNo = classNo;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", classNo=" + classNo +
                '}';
    }
}
