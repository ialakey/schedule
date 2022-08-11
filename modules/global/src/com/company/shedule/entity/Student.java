package com.company.shedule.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@Table(name = "SHEDULE_STUDENT")
@Entity(name = "shedule_Student")
@NamePattern("%s|id")
public class Student extends StandardEntity {
    private static final long serialVersionUID = -3317918616925403322L;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "NUMBER", length = 15)
    private String number;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}