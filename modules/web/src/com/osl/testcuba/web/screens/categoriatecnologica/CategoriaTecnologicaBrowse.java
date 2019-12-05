package com.osl.testcuba.web.screens.categoriatecnologica;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.CategoriaTecnologica;

@UiController("testcuba_CategoriaTecnologica.browse")
@UiDescriptor("categoria-tecnologica-browse.xml")
@LookupComponent("categoriaTecnologicasTable")
@LoadDataBeforeShow
public class CategoriaTecnologicaBrowse extends StandardLookup<CategoriaTecnologica> {
}