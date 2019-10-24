package com.osl.testcuba.web.screens.prodotto;

import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.Prodotto;
import com.osl.testcuba.web.screens.Script.ScriptGrovyScreen;

import javax.inject.Inject;

@UiController("testcuba_Prodotto.browse")
@UiDescriptor("prodotto-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ProdottoBrowse extends MasterDetailScreen<Prodotto> {
    @Inject
    private Screens screens;
    @Inject
    private GroupTable<Prodotto> table;

    @Subscribe("table.script")
    public void onScriptBtnClick(Action.ActionPerformedEvent event) {
        ScriptGrovyScreen groovyScreen = screens.create(ScriptGrovyScreen.class);
        groovyScreen.prodotto = table.getSingleSelected();
        screens.show(groovyScreen);
    }

}