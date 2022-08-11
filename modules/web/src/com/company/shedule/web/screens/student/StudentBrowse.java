package com.company.shedule.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.shedule.entity.Student;

@UiController("shedule_Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
@LoadDataBeforeShow
public class StudentBrowse extends StandardLookup<Student> {
}