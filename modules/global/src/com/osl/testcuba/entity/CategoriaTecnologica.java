package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|codice")
@Table(name = "TESTCUBA_CATEGORIA_TECNOLOGICA")
@Entity(name = "testcuba_CategoriaTecnologica")
public class CategoriaTecnologica extends StandardEntity {
    private static final long serialVersionUID = -6914272613102567216L;

    @Column(name = "CODICE")
    protected String codice;

    @Column(name = "DESCRIZIONE")
    protected String descrizione;

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
}