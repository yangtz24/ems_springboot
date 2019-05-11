package com.baizhi.ems.ytz.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "t_department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String deptNumber;
    private String deptName;
    private String note;
    @OneToMany(mappedBy = "dept" , cascade = { CascadeType.ALL })
    private List<Employee> emps = new ArrayList<>();

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptNumber='" + deptNumber + '\'' +
                ", deptName='" + deptName + '\'' +
                ", note='" + note + '\'' +
                ", emps=" + emps +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    public Department(Integer id, String deptNumber, String deptName, String note, List<Employee> emps) {
        this.id = id;
        this.deptNumber = deptNumber;
        this.deptName = deptName;
        this.note = note;
        this.emps = emps;
    }

    public Department() {
    }
}
