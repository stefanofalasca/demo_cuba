package com.osl.testcuba.core;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Query;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.validation.CustomValidationException;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.osl.testcuba.entity.Prodotto;
import com.osl.testcuba.entity.ScriptTrigger;
import com.osl.testcuba.listeners.ScriptGroovyEvalImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(ProdottoEntityListener.NAME)
public class ProdottoEntityListener implements BeforeInsertEntityListener<Prodotto> {
    public static final String NAME = "testcuba_ProdottoEntityListener";


    @Override
    public void onBeforeInsert(Prodotto entity, EntityManager entityManager) {



    }
}