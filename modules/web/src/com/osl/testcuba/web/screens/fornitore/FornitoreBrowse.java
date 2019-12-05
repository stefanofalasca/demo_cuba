package com.osl.testcuba.web.screens.fornitore;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.Fornitore;

@UiController("testcuba_Fornitore.browse")
@UiDescriptor("fornitore-browse.xml")
@LookupComponent("fornitoresTable")
@LoadDataBeforeShow
public class FornitoreBrowse extends StandardLookup<Fornitore> {
}