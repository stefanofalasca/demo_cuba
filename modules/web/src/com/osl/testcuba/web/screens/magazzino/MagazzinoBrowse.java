package com.osl.testcuba.web.screens.magazzino;

import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.Magazzino;

@Route("magazzino")
@UiController("testcuba_Magazzino.browse")
@UiDescriptor("magazzino-browse.xml")
@LookupComponent("magazzinoesTable")
@LoadDataBeforeShow
public class MagazzinoBrowse extends StandardLookup<Magazzino> {
}