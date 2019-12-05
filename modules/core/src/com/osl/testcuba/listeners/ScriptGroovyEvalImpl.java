package com.osl.testcuba.listeners;

import com.haulmont.cuba.core.TransactionalDataManager;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Scripting;
import groovy.lang.Binding;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component(ScriptGroovyEvalImpl.NAME)
public class ScriptGroovyEvalImpl implements Predicate {
    public static final String NAME = "testcuba_ScriptGroovyEvalImpl";


    public Boolean validation;
    public String message;
    protected String groovyScript;



    public String getGroovyScript() {
        return groovyScript;
    }

    public void setGroovyScript(String groovyScript) {
        this.groovyScript = groovyScript;
    }

        @Override
    public boolean test(Object o) {
        return evaluate((Entity) o);
    }

    public boolean evaluate(Entity entity){
        TransactionalDataManager dataManager = AppBeans.get(TransactionalDataManager.NAME);
        Scripting scripting = AppBeans.get(Scripting.NAME);

        validation = false;

        Binding binding = new Binding();
        binding.setVariable("__entity__", entity);
        binding.setVariable( "dataManager", dataManager);
        binding.setVariable( "result", this);

        String scr = parseScript(groovyScript);
        scripting.evaluateGroovy(scr, binding);
        return validation;
    }

    protected String parseScript(String script) {
        return script.replace("{E}", "__entity__")
                .replace("{userSession}", "__userSession__")
                .replace("{color}.", "")
                .replace("{icon}.", "");
    }
}