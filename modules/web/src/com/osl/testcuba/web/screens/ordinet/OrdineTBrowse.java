package com.osl.testcuba.web.screens.ordinet;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.reports.gui.actions.RunReportAction;
import com.haulmont.reports.gui.actions.TablePrintFormAction;
import com.osl.customcolumns.components.CustomColumnsManager;
import com.osl.customcolumns.components.InjectCustomColumnsAction;
import com.osl.testcuba.entity.OrdineT;

import javax.inject.Inject;

@UiController("testcuba_OrdineT.browse")
@UiDescriptor("ordine-t-browse.xml")
@LookupComponent("ordineTsTable")
@LoadDataBeforeShow
public class OrdineTBrowse extends StandardLookup<OrdineT> {
    @Subscribe
    public void onInit(InitEvent event) {
        reportButton.setAction(new RunReportAction("report"));
    }
    @Inject
    private Button reportButton;
    @InjectCustomColumnsAction(dynamicCaption = false)
    @Inject
    private GroupTable<OrdineT> ordineTsTable;

    @Subscribe
    public void onInit1(InitEvent event) {
        TablePrintFormAction action = new TablePrintFormAction("report", ordineTsTable);
        ordineTsTable.addAction(action);
        reportButton.setAction(action);

        CustomColumnsManager.inject(this);

    }

}