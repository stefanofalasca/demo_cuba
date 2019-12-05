package com.osl.testcuba.web.screens.fornitore;

import com.haulmont.cuba.gui.screen.*;
import com.osl.commonservices.web.screens.extended.StandardEditorOSL;
import com.osl.testcuba.entity.Fornitore;

@UiController("testcuba_Fornitore.edit")
@UiDescriptor("fornitore-edit.xml")
@EditedEntityContainer("fornitoreDc")
@LoadDataBeforeShow
public class FornitoreEdit extends StandardEditorOSL<Fornitore> {
}