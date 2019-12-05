package com.osl.testcuba.web.screens.categoriagestionale;

import com.haulmont.cuba.gui.screen.*;
import com.osl.commonservices.web.screens.extended.StandardEditorOSL;
import com.osl.testcuba.entity.CategoriaGestionale;

@UiController("testcuba_CategoriaGestionale.edit")
@UiDescriptor("categoria-gestionale-edit.xml")
@EditedEntityContainer("categoriaGestionaleDc")
@LoadDataBeforeShow
public class CategoriaGestionaleEdit extends StandardEditorOSL<CategoriaGestionale> {
}