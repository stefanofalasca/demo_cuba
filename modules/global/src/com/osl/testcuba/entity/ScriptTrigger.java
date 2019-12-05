package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "TESTCUBA_SCRIPT_TRIGGER")
@Entity(name = "testcuba_ScriptTrigger")
public class ScriptTrigger extends StandardEntity {
    private static final long serialVersionUID = 644692631587093335L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 50)
    protected String name;

    @NotNull
    @Column(name = "ENTITY", nullable = false, length = 50)
    protected String entity;

    @NotNull
    @Column(name = "ENABLED", nullable = false)
    protected Boolean enabled = false;

    @NotNull
    @Lob
    @Column(name = "GROOVY_SCRIPT", nullable = false)
    protected String groovyScript;

    public String getGroovyScript() {
        return groovyScript;
    }

    public void setGroovyScript(String groovyScript) {
        this.groovyScript = groovyScript;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}