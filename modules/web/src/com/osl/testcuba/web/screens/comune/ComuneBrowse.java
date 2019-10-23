package com.osl.testcuba.web.screens.comune;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.Comune;

@UiController("testcuba_Comune.browse")
@UiDescriptor("comune-browse.xml")
@LookupComponent("comunesTable")
@LoadDataBeforeShow
public class ComuneBrowse extends StandardLookup<Comune> {
}