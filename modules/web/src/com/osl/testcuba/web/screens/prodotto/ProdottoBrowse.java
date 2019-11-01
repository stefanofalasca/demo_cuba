package com.osl.testcuba.web.screens.prodotto;

import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.osl.customcolumns.components.CustomColumnsManager;
import com.osl.customcolumns.components.InjectCustomColumnsAction;
import com.osl.testcuba.entity.Approvigionamento;
import com.osl.testcuba.entity.Prodotto;
import com.osl.testcuba.web.gui.SuperMasterDetail;
import com.osl.testcuba.web.screens.Script.ScriptGrovyScreen;

import javax.inject.Inject;

@UiController("testcuba_Prodotto.browse")
@UiDescriptor("prodotto-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ProdottoBrowse extends SuperMasterDetail<Prodotto> {
    @Inject
    private Screens screens;
    @InjectCustomColumnsAction(dynamicCaption = false)
    @Inject
    private GroupTable<Prodotto> table;
    @Inject
    private InstanceContainer<Prodotto> prodottoDc;

    @Subscribe
    public void onInit(InitEvent event) {
        CustomColumnsManager.inject(this);
    }
}