package com.osl.testcuba.web.screens.magazzino;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.Magazzino;

@UiController("testcuba_Magazzino.browse")
@UiDescriptor("magazzino-browse.xml")
@LookupComponent("magazzinoesTable")
@LoadDataBeforeShow
public class MagazzinoBrowse extends StandardLookup<Magazzino> {
}