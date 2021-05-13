package com.xyc.jpademo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "studentname")
    private String studentname;

    @Column(name = "studentcode")
    private String studentcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentname='" + studentname + '\'' +
                ", studentcode='" + studentcode + '\'' +
                '}';
    }
}
