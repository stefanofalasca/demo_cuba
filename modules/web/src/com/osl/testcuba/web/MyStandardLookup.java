package com.osl.testcuba.web;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.ButtonsPanel;
import com.haulmont.cuba.gui.components.ListComponent;
import com.haulmont.cuba.gui.screen.StandardLookup;
import de.diedavids.cuba.attachable.web.WithAttachmentsSupport;

public class MyStandardLookup<T extends Entity> extends StandardLookup<T> implements WithAttachmentsSupport  {
    protected ListComponent<T> table;
    protected ButtonsPanel buttonsPanel;

    @Override
    protected void initActions(InitEvent event) {
        super.initActions(event);

        table = (ListComponent<T>) getWindow().getComponent("table");
        buttonsPanel = (ButtonsPanel) getWindow().getComponent("buttonsPanel");
    }

    @Override
    public ListComponent getListComponentForAttachments() {
        return table;
    }

    @Override
    public ButtonsPanel getButtonsPanelForAttachments() {
        return buttonsPanel;
    }
}
