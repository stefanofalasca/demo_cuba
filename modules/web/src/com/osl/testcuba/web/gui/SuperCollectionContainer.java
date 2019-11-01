package com.osl.testcuba.web.gui;


import com.haulmont.bali.events.Subscription;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.Sorter;
import com.haulmont.cuba.gui.model.impl.InstanceContainerImpl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SuperCollectionContainer<E extends Entity> extends InstanceContainerImpl<E> implements CollectionContainer<E> {

    private CollectionContainer<E> collection;

    public SuperCollectionContainer(InstanceContainer collection) {
        super(collection.getEntityMetaClass());
        this.collection = (CollectionContainer<E>) collection;
    }

    @Override
    public List<E> getItems() {
        return collection.getItems() != null ? collection.getItems().stream().limit(5).collect(Collectors.toList()) : null;
    }

    @Override
    public void setItems(@Nullable Collection<E> entities) {
        collection.setItems(entities);
    }

    @Override
    public List<E> getMutableItems() {
        return collection.getMutableItems();
    }

    @Nonnull
    @Override
    public E getItem(Object entityId) {
        return collection.getItem(entityId);
    }

    @Nullable
    @Override
    public E getItemOrNull(Object entityId) {
        return collection.getItemOrNull(entityId);
    }

    @Override
    public int getItemIndex(Object entityId) {
        return collection.getItemIndex(entityId);
    }

    @Override
    public boolean containsItem(Object entityId) {
        return collection.containsItem(entityId);
    }

    @Override
    public void replaceItem(E entity) {
        collection.replaceItem(entity);
    }

    @Override
    public Sorter getSorter() {
        return collection.getSorter();
    }

    @Override
    public void setSorter(Sorter sorter) {
        collection.setSorter(sorter);
    }

    @Override
    public void unmute(UnmuteEventsMode mode) {
        collection.unmute(mode);
    }

    @Override
    public Subscription addCollectionChangeListener(Consumer<CollectionChangeEvent<E>> listener) {
        return collection.addCollectionChangeListener(listener);
    }
}