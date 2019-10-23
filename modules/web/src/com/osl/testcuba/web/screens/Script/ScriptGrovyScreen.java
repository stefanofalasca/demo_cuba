package com.osl.testcuba.web.screens.Script;

import com.haulmont.chile.core.model.MetaClass;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.SourceCodeEditor;
import com.haulmont.cuba.gui.components.autocomplete.Suggestion;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.osl.testcuba.entity.Prodotto;
import groovy.lang.Binding;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@UiController("testcuba_ScriptGrovyScreen")
@UiDescriptor("script-grovy-screen.xml")
public class ScriptGrovyScreen extends Screen {
    @Inject
    private Metadata metadata;

    @Inject
    private DataManager dataManager;
    @Inject
    private SourceCodeEditor sourceEdit;

    public Prodotto prodotto;
    @Inject
    private Scripting scripting;
    @Inject
    private Notifications notifications;

    @Subscribe
    public void onInit(InitEvent event) {
        sourceEdit.setSuggester((source, text, cursorPosition) -> {
            List<Suggestion> suggestions = new ArrayList<>();
            MetadataTools metadataTools = AppBeans.get(MetadataTools.NAME);
            Collection<MetaClass> mclist = metadataTools.getAllPersistentMetaClasses();
            for (MetaClass mc : mclist) {
                suggestions.add(new Suggestion(source,mc.getName(), mc.getName(), null, -1, -1));
            }
            return suggestions;
        });
        String script = "String jpql = \"select o.importo*3 from testcuba_Prodotto o where o.id = :idProdotto\";\n" +
                "\n" +
                "BigDecimal sum = dataManager.loadValue(jpql, BigDecimal.class)\n" +
                "    .parameter(\"idProdotto\", prodotto.id)\n" +
                "    .one();\n" +
                "    \n" +
                "return sum;";
        sourceEdit.setValue(script);


    }

    public void onConfermaBtnClick() {
        Binding binding = new Binding();
        binding.setVariable("prodotto", prodotto);
        binding.setVariable("dataManager", dataManager);
        BigDecimal prova = scripting.evaluateGroovy(sourceEdit.getValue(), binding);notifications.create().withCaption("Risultato").withDescription(prova.toString()).show();
    }

    public void onAnnullaBtnClick() {
        closeWithDefaultAction();
    }
}