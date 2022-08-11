package com.company.shedule.service;

import com.company.shedule.entity.Shedule;
import com.company.shedule.entity.Student;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@Service(MobileService.NAME)
public class MobileServiceBean implements MobileService {

    @Inject
    private DataManager dataManager;

    @Override
    public List<Student> getStudent() {
        return dataManager.load(Student.class)
                .query("select e from shedule_Student e")
                .view("student.view")
                .list();
    }

    @Override
    public List<Shedule> getShedule(UUID student) {
        return dataManager.load(Shedule.class)
                .query("select e from shedule_Shedule e where e.student.id = :student")
                .parameter("student", student)
                .view("_base")
                .list();
    }


}