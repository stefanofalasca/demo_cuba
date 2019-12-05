package com.osl.testcuba.web.screens.scripttrigger;

import com.haulmont.chile.core.model.MetaClass;
import com.haulmont.chile.core.model.MetaProperty;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.SourceCodeEditor;
import com.haulmont.cuba.gui.components.autocomplete.AutoCompleteSupport;
import com.haulmont.cuba.gui.components.autocomplete.Suggester;
import com.haulmont.cuba.gui.components.autocomplete.Suggestion;
import com.haulmont.cuba.gui.screen.*;
import com.osl.customcolumns.components.ParserAutoComplete;
import com.osl.testcuba.entity.ScriptTrigger;

import javax.inject.Inject;
import java.util.*;

@UiController("testcuba_ScriptTrigger.edit")
@UiDescriptor("script-trigger-edit.xml")
@EditedEntityContainer("scriptTriggerDc")
@LoadDataBeforeShow
public class ScriptTriggerEdit extends StandardEditor<ScriptTrigger> implements Suggester {
    @Inject
    private LookupField<String> entityField;
    @Inject
    private SourceCodeEditor groovyScriptField;
    @Inject
    private MetadataTools metadataTools;
    @Inject
    private Metadata metadata;

    @Subscribe
    public void onInit(InitEvent event) {
        Collection<MetaClass> mclist = metadataTools.getAllPersistentMetaClasses();
        Map<String, String> map = new LinkedHashMap<>();
        for (MetaClass mc:mclist){
            map.put(mc.getName(), mc.getName());
        }
        entityField.setOptionsMap(map);
        groovyScriptField.setSuggester(this);
        
    }

    @Override
    public List<Suggestion> getSuggestions(AutoCompleteSupport source, String text, int cursorPosition) {
        List<Suggestion> suggestions = new ArrayList<>();
        // get word near cursor
        String word = ParserAutoComplete.getPreviousWordFromPosition(text, cursorPosition);

        // filter first chars
        if (word.indexOf(";\n")==0){
            word = word.substring(2);
        }

        if(word.compareTo("E}.")==0){
            MetaClass metaClass = metadata.getClass(entityField.getValue());
            for (MetaProperty mp : metaClass.getProperties())
                suggestions.add(new Suggestion(source, mp.getName(), mp.getName(), null, -1, -1));
        }
        else if(word.compareTo("result.")==0){
            suggestions.add(new Suggestion(source, "validation", "validation", null, -1, -1));
            suggestions.add(new Suggestion(source, "message", "message", null, -1, -1));
        }

        return suggestions;
    }
}