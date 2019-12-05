package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|nome")
@Table(name = "TESTCUBA_COMUNE")
@Entity(name = "testcuba_Comune")
public class Comune extends StandardEntity {
    private static final long serialVersionUID = -2208966088929524117L;

    @NotNull
    @Column(name = "NOME", nullable = false)
    protected String nome;

    @Column(name = "CAP", length = 10)
    protected String cap;

    @NotNull
    @Column(name = "PROVINCIA", nullable = false, length = 2)
    protected String provincia;

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}