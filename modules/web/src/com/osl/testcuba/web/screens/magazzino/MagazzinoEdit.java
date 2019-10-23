package com.osl.testcuba.web.screens.magazzino;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.Magazzino;

@UiController("testcuba_Magazzino.edit")
@UiDescriptor("magazzino-edit.xml")
@EditedEntityContainer("magazzinoDc")
@LoadDataBeforeShow
public class MagazzinoEdit extends StandardEditor<Magazzino> {
}