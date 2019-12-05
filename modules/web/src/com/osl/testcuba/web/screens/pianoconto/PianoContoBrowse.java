package com.osl.testcuba.web.screens.pianoconto;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.PianoConto;

@UiController("testcuba_PianoConto.browse")
@UiDescriptor("piano-conto-browse.xml")
@LookupComponent("pianoContoesTable")
@LoadDataBeforeShow
public class PianoContoBrowse extends StandardLookup<PianoConto> {
}