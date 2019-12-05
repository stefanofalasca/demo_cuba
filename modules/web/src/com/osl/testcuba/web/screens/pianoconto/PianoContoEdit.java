package com.osl.testcuba.web.screens.pianoconto;

import com.haulmont.cuba.gui.screen.*;
import com.osl.commonservices.web.screens.extended.StandardEditorOSL;
import com.osl.testcuba.entity.PianoConto;

@UiController("testcuba_PianoConto.edit")
@UiDescriptor("piano-conto-edit.xml")
@EditedEntityContainer("pianoContoDc")
@LoadDataBeforeShow
public class PianoContoEdit extends StandardEditorOSL<PianoConto> {
}