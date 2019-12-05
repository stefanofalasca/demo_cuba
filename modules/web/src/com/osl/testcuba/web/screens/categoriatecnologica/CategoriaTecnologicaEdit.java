package com.osl.testcuba.web.screens.categoriatecnologica;

import com.haulmont.cuba.gui.screen.*;
import com.osl.commonservices.web.screens.extended.StandardEditorOSL;
import com.osl.testcuba.entity.CategoriaTecnologica;

@UiController("testcuba_CategoriaTecnologica.edit")
@UiDescriptor("categoria-tecnologica-edit.xml")
@EditedEntityContainer("categoriaTecnologicaDc")
@LoadDataBeforeShow
public class CategoriaTecnologicaEdit extends StandardEditorOSL<CategoriaTecnologica> {
}