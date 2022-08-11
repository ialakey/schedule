package com.company.shedule.service;

import com.company.shedule.entity.Shedule;
import com.company.shedule.entity.Student;

import java.util.List;
import java.util.UUID;

public interface MobileService {
    String NAME = "shedule_MobileService";

    List<Student> getStudent();

    List<Shedule> getShedule(UUID student);
}