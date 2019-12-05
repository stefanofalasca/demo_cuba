package com.osl.testcuba.web.screens.prodotto2;

import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.Events;
import com.haulmont.cuba.core.global.validation.groups.UiComponentChecks;
import com.haulmont.cuba.gui.ComponentsHelper;
import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.web.gui.components.WebPickerField;
import com.haulmont.cuba.web.gui.components.WebV8AbstractField;
import com.osl.commonservices.web.screens.extended.StandardEditorOSL;
import com.osl.testcuba.Messenger;
import com.osl.testcuba.UiNotificationEvent;
import com.osl.testcuba.entity.Prodotto;
import org.springframework.context.event.EventListener;

import javax.inject.Inject;
import javax.persistence.*;
import java.lang.annotation.Annotation;
import java.util.Collection;

@Route(value = "prodotto/edit", parentPrefix = "prodotto")
@UiController("testcuba_Prodotto.edit")
@UiDescriptor("prodotto-edit.xml")
@EditedEntityContainer("prodottoDc")
@LoadDataBeforeShow
public class ProdottoEdit extends StandardEditorOSL<Prodotto> {
    @Inject
    private Events events;
    @Inject
    private Label<String> labelWarning;
    @Inject
    private Button commitAndCloseBtn;
    @Inject
    private InstanceContainer<Prodotto> prodottoDc;

    Messenger messenger = AppBeans.get(Messenger.NAME);

    @EventListener
    public void onUiNotificationEvent(UiNotificationEvent event) {
        if (prodottoDc.getItem().getId().toString().compareTo(event.getMessage())==0) {
            labelWarning.setVisible(true);
            labelWarning.setValue("Dati modificati da altro utente, è necessario ricaricare la maschera !");
            commitAndCloseBtn.setEnabled(false);
        }
    }

    @Subscribe
    public void onAfterCommitChanges(AfterCommitChangesEvent event) {
        messenger.sendUiNotificationEvent(prodottoDc.getItem().getId().toString());
    }


}