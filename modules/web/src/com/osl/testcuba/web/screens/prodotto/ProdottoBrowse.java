package com.osl.testcuba.web.screens.prodotto;

import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.gui.*;
import com.haulmont.cuba.gui.app.core.inputdialog.DialogActions;
import com.haulmont.cuba.gui.app.core.inputdialog.InputDialog;
import com.haulmont.cuba.gui.app.core.inputdialog.InputParameter;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.osl.customcolumns.components.CustomColumnsManager;
import com.osl.customcolumns.components.InjectCustomColumnsAction;
import com.osl.testcuba.entity.Prodotto;
import com.osl.testcuba.service.SqlBridgeService;

import javax.inject.Inject;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Logger;

@UiController("testcuba_Prodotto.browse")
@UiDescriptor("prodotto-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ProdottoBrowse extends MasterDetailScreen<Prodotto> {
    @InjectCustomColumnsAction(dynamicCaption = false)
    @Inject
    private GroupTable<Prodotto> table;
    @Inject
    private SqlBridgeService sqlBridgeService;
    @Inject
    private CollectionLoader<Prodotto> prodottoesDl;
    @Inject
    private Button appendWhereCmd;
    @Inject
    private Messages messages;
    private boolean appendWhereOn;
    @Inject
    private Dialogs dialogs;

    @Inject
    private CollectionContainer<Prodotto> prodottoesDc;
    @Inject
    private Button importBtn;
    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private Filter filter;
    @Inject
    private DataManager dataManager;
    @Inject
    private ButtonsPanel buttonsPanel;

    @Subscribe
    public void onInit(InitEvent event) {

        CustomColumnsManager.inject(this);
    }


    public void onAppendWhereCmdClick() {
        if (!appendWhereOn){
            dialogs.createInputDialog(this)
                    .withCaption("Query SQL")
                    .withParameters(
                            InputParameter.stringParameter("sql")
                                    .withCaption("Name").withRequired(true)
                            .withDefaultValue("select prodotto_id from testcuba_ordine_d where prezzo>2")
                    )
                    .withActions(DialogActions.OK_CANCEL)
                    .withCloseListener(closeEvent -> {
                        if (closeEvent.getCloseAction().equals(InputDialog.INPUT_DIALOG_OK_ACTION)) {
                            String sql = closeEvent.getValue("sql");
                            List<String>values = sqlBridgeService.getIDItems(sql);
                            prodottoesDl.setParameter("items", values);
                            appendWhereCmd.setStyleName("v-button-myButtonOn");
                            appendWhereCmd.setCaption(messages.getMessage(getClass(),"removeWhere"));
                            prodottoesDl.load();
                        }
                    })
                    .show();
        }
        else
        {
            appendWhereCmd.removeStyleName("v-button-myButtonOn");
            prodottoesDl.removeParameter("items");
            appendWhereCmd.setCaption(messages.getMessage(getClass(),"appendWhere"));
            prodottoesDl.load();
        }
        appendWhereOn = !appendWhereOn;
    }


    public void onDeleteAllCmdClick() {
        dialogs.createOptionDialog()
                .withCaption("Eliminazione tabella prodotti")
                .withMessage("<b>Attenzione<b/><br>Confermi l'eliminazione di tutta l'anagrafica prodotti")
                .withContentMode(ContentMode.HTML)

                .withActions(
                        new DialogAction(DialogAction.Type.YES, Action.Status.PRIMARY).withHandler(e -> {
                            sqlBridgeService.deleteProdotti();
                            prodottoesDl.load();
                        }),
                        new DialogAction(DialogAction.Type.NO)
                )
                .show();
    }

    public void onImportBtnClick() {
        getWindow().openWindow("ddcdi$import-wizard", WindowManager.OpenType.DIALOG.closeable(true).resizable(true).modal(true));
    }

}