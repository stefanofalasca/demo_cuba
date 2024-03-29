package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|codice,descrizione")
@Table(name = "TESTCUBA_MAGAZZINO")
@Entity(name = "testcuba_Magazzino")
public class Magazzino extends StandardEntity {
    private static final long serialVersionUID = -3451293018080178098L;

    @NotNull
    @Column(name = "CODICE", nullable = false)
    protected String codice;

    @NotNull
    @Column(name = "DESCRIZIONE", nullable = false)
    protected String descrizione;

    @Column(name = "FISCALE")
    protected Boolean fiscale;

    @Column(name = "ESCLUDI_DISPONIBILITA")
    protected Boolean escludiDisponibilita;

    public Boolean getEscludiDisponibilita() {
        return escludiDisponibilita;
    }

    public void setEscludiDisponibilita(Boolean escludiDisponibilita) {
        this.escludiDisponibilita = escludiDisponibilita;
    }

    public Boolean getFiscale() {
        return fiscale;
    }

    public void setFiscale(Boolean fiscale) {
        this.fiscale = fiscale;
    }

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