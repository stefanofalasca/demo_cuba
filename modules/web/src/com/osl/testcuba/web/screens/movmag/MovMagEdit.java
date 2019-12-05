package com.osl.testcuba.web.screens.movmag;

import com.haulmont.cuba.gui.components.SuggestionPickerField;
import com.haulmont.cuba.gui.screen.*;
import com.osl.commonservices.web.screens.extended.StandardEditorOSL;
import com.osl.testcuba.entity.MovMag;
import com.osl.testcuba.entity.Prodotto;

import javax.inject.Inject;

@UiController("testcuba_MovMag.edit")
@UiDescriptor("mov-mag-edit.xml")
@EditedEntityContainer("movMagDc")
@LoadDataBeforeShow
public class MovMagEdit extends StandardEditorOSL<MovMag> {

}