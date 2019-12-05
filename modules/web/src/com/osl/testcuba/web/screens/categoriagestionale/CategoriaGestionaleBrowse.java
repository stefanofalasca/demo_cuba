package com.osl.testcuba.web.screens.categoriagestionale;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.CategoriaGestionale;

@UiController("testcuba_CategoriaGestionale.browse")
@UiDescriptor("categoria-gestionale-browse.xml")
@LookupComponent("categoriaGestionalesTable")
@LoadDataBeforeShow
public class CategoriaGestionaleBrowse extends StandardLookup<CategoriaGestionale> {
}