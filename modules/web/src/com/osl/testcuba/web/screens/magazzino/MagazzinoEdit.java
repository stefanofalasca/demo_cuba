package com.osl.testcuba.web.screens.magazzino;

import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.screen.*;
import com.osl.commonservices.web.screens.extended.StandardEditorOSL;
import com.osl.testcuba.entity.Magazzino;

@Route(value = "magazzino/edit", parentPrefix = "magazzino")
@UiController("testcuba_Magazzino.edit")
@UiDescriptor("magazzino-edit.xml")
@EditedEntityContainer("magazzinoDc")
@LoadDataBeforeShow
public class MagazzinoEdit extends StandardEditorOSL<Magazzino> {
}