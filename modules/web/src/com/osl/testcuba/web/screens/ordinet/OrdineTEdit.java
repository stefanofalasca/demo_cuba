package com.osl.testcuba.web.screens.ordinet;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.OrdineT;

@UiController("testcuba_OrdineT.edit")
@UiDescriptor("ordine-t-edit.xml")
@EditedEntityContainer("ordineTDc")
@LoadDataBeforeShow
public class OrdineTEdit extends StandardEditor<OrdineT> {
}