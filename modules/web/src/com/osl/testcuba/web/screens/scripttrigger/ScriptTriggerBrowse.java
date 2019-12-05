package com.osl.testcuba.web.screens.scripttrigger;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.ScriptTrigger;

@UiController("testcuba_ScriptTrigger.browse")
@UiDescriptor("script-trigger-browse.xml")
@LookupComponent("scriptTriggersTable")
@LoadDataBeforeShow
public class ScriptTriggerBrowse extends StandardLookup<ScriptTrigger> {
}