package com.osl.testcuba.web.screens.prodotto2;

import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.components.ButtonsPanel;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.osl.commonservices.web.screens.extended.StandardLookupOSL;
import com.osl.customcolumns.components.CustomColumnsManager;
import com.osl.customcolumns.components.InjectCustomColumnsAction;
import com.osl.testcuba.entity.Prodotto;
import it.nexbit.cuba.lookuppreview.web.mixins.HasSelectedItemPreview;

import javax.inject.Inject;

@Route("prodotto")
@UiController("testcuba_Prodotto2.browse")
@UiDescriptor("prodotto-browse.xml")
@LookupComponent("prodottoesTable")
@LoadDataBeforeShow
public class ProdottoBrowse extends StandardLookupOSL<Prodotto> implements HasSelectedItemPreview {
    @Inject
    private CollectionLoader<Prodotto> prodottoesDl;
    @Inject
    private ButtonsPanel buttonsPanel;

    @InjectCustomColumnsAction(dynamicCaption = false)
    @Inject
    private GroupTable<Prodotto> prodottoesTable;


    @Subscribe
    public void onInit1(InitEvent event) {
        CustomColumnsManager.inject(this);
    }




    @Override
    protected CollectionLoader getCollectionLoaderCustomFilter(String collectionID) {
        return prodottoesDl;
    }

    @Override
    protected ButtonsPanel getButtonPanelsCustomFilter(String collectionID) {
        return buttonsPanel;
    }
}