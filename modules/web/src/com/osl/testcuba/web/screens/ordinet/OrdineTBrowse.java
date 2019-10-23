package com.osl.testcuba.web.screens.ordinet;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.OrdineT;

@UiController("testcuba_OrdineT.browse")
@UiDescriptor("ordine-t-browse.xml")
@LookupComponent("ordineTsTable")
@LoadDataBeforeShow
public class OrdineTBrowse extends StandardLookup<OrdineT> {
}