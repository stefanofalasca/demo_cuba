package com.osl.testcuba.web.screens.ordined;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.OrdineD;

@UiController("testcuba_OrdineD.edit")
@UiDescriptor("ordine-d-edit.xml")
@EditedEntityContainer("ordineDDc")
@LoadDataBeforeShow
public class OrdineDEdit extends StandardEditor<OrdineD> {
}