package com.osl.testcuba.web.screens.comune;

import com.haulmont.cuba.gui.screen.*;
import com.osl.commonservices.web.screens.extended.StandardEditorOSL;
import com.osl.testcuba.entity.Comune;

@UiController("testcuba_Comune.edit")
@UiDescriptor("comune-edit.xml")
@EditedEntityContainer("comuneDc")
@LoadDataBeforeShow
public class ComuneEdit extends StandardEditorOSL<Comune> {
}