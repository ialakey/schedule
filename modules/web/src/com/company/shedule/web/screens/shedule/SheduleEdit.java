package com.company.shedule.web.screens.shedule;

import com.haulmont.cuba.gui.screen.*;
import com.company.shedule.entity.Shedule;

@UiController("shedule_Shedule.edit")
@UiDescriptor("shedule-edit.xml")
@EditedEntityContainer("sheduleDc")
@LoadDataBeforeShow
public class SheduleEdit extends StandardEditor<Shedule> {
}