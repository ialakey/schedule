package com.company.shedule.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.shedule.entity.Student;

@UiController("shedule_Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
@LoadDataBeforeShow
public class StudentEdit extends StandardEditor<Student> {
}