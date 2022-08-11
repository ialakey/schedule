package com.company.shedule.web.screens.shedule;

import com.haulmont.cuba.gui.screen.*;
import com.company.shedule.entity.Shedule;

@UiController("shedule_Shedule.browse")
@UiDescriptor("shedule-browse.xml")
@LookupComponent("shedulesTable")
@LoadDataBeforeShow
public class SheduleBrowse extends StandardLookup<Shedule> {
}