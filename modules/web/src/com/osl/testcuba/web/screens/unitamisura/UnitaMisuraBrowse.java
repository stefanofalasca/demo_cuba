package com.osl.testcuba.web.screens.unitamisura;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.UnitaMisura;

@UiController("testcuba_UnitaMisura.browse")
@UiDescriptor("unita-misura-browse.xml")
@LookupComponent("unitaMisurasTable")
@LoadDataBeforeShow
public class UnitaMisuraBrowse extends StandardLookup<UnitaMisura> {
}