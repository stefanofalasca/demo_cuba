package com.osl.testcuba.web.gui;



import com.haulmont.cuba.gui.model.*;

import java.util.Set;

public class SuperScreenData implements ScreenData {

    private ScreenData wrapped;

    public SuperScreenData(ScreenData screenData) {
        this.wrapped = screenData;
    }

    @Override
    public DataContext getDataContext() {
        return wrapped.getDataContext();
    }

    @Override
    public void setDataContext(DataContext dataContext) {
        wrapped.setDataContext(dataContext);
    }

    @Override
    public LoadBeforeShowStrategy getLoadBeforeShowStrategy() {
        return wrapped.getLoadBeforeShowStrategy();
    }

    @Override
    public void setLoadBeforeShowStrategy(LoadBeforeShowStrategy strategy) {
        wrapped.setLoadBeforeShowStrategy(strategy);
    }

    @Override
    public void loadAll() {
        wrapped.loadAll();
    }

    @Override
    public <T extends InstanceContainer> T getContainer(String id) {
        T container = wrapped.getContainer(id);
        if (container instanceof CollectionContainer)
            return (T) new SuperCollectionContainer(container);
        else
            return container;
    }

    @Override
    public <T extends DataLoader> T getLoader(String id) {
        return wrapped.getLoader(id);
    }

    @Override
    public Set<String> getContainerIds() {
        return wrapped.getContainerIds();
    }

    @Override
    public Set<String> getLoaderIds() {
        return wrapped.getLoaderIds();
    }

    @Override
    public void registerContainer(String id, InstanceContainer container) {
        wrapped.registerContainer(id, container);
    }

    @Override
    public void registerLoader(String id, DataLoader loader) {
        wrapped.registerLoader(id, loader);
    }
}
