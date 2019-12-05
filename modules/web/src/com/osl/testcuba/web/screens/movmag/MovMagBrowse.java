package com.osl.testcuba.web.screens.movmag;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.MovMag;

@UiController("testcuba_MovMag.browse")
@UiDescriptor("mov-mag-browse.xml")
@LookupComponent("movMagsTable")
@LoadDataBeforeShow
public class MovMagBrowse extends StandardLookup<MovMag> {
}