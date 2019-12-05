package com.osl.testcuba.web.screens.unitamisura;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.UnitaMisura;

@UiController("testcuba_UnitaMisura.edit")
@UiDescriptor("unita-misura-edit.xml")
@EditedEntityContainer("unitaMisuraDc")
@LoadDataBeforeShow
public class UnitaMisuraEdit extends StandardEditor<UnitaMisura> {
}