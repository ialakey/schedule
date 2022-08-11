package com.company.shedule.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import java.util.Date;

@Table(name = "SHEDULE_SHEDULE")
@Entity(name = "shedule_Shedule")
@NamePattern("%s|id")
public class Shedule extends StandardEntity {
    private static final long serialVersionUID = 3971582974593753826L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DATE_START")
    private Date dateStart;

    @Column(name = "DATE_END")
    private Date dateEnd;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
    protected Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}