package com.nicholas.firebasecrud;

public class StudentModel {
    private String id;
    private String name;
    private String admNo;
    private String course;

    public StudentModel() {
    }

    public StudentModel(String id, String name, String admNo, String course) {
        this.id = id;
        this.name = name;
        this.admNo = admNo;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmNo() {
        return admNo;
    }

    public void setAdmNo(String admNo) {
        this.admNo = admNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
