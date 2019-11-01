package com.osl.testcuba.web.gui;


import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.model.ScreenData;
import com.haulmont.cuba.gui.screen.MasterDetailScreen;
import com.haulmont.cuba.gui.screen.StandardLookup;

public class SuperMasterDetail<T extends Entity> extends MasterDetailScreen {

    private SuperScreenData superScreenData;

    @Override
    protected ScreenData getScreenData() {
        if (superScreenData == null) {
            ScreenData screenData = super.getScreenData();
            if (screenData != null) {
                this.superScreenData = new SuperScreenData(screenData);
            }
        }
        return this.superScreenData;
    }
}
