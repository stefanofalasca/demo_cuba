package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|codice")
@Table(name = "TESTCUBA_UNITA_MISURA")
@Entity(name = "testcuba_UnitaMisura")
public class UnitaMisura extends StandardEntity {
    private static final long serialVersionUID = 2385394404122313846L;

    @Column(name = "CODICE")
    protected String codice;

    @Column(name = "DESCRIZIONE")
    protected String descrizione;

    @Column(name = "FATTORE_CONVERSIONE_KGM")
    protected Boolean fattoreConversioneKgm;

    @Column(name = "UTILIZZA_PER_CALCOLO_PESI")
    protected Boolean utilizzaPerCalcoloPesi;

    @Column(name = "METRI_LINEARI")
    protected Boolean metriLineari;

    @Column(name = "QUANTITA_DISCRETA")
    protected Boolean quantitaDiscreta;

    public Boolean getQuantitaDiscreta() {
        return quantitaDiscreta;
    }

    public void setQuantitaDiscreta(Boolean quantitaDiscreta) {
        this.quantitaDiscreta = quantitaDiscreta;
    }

    public Boolean getMetriLineari() {
        return metriLineari;
    }

    public void setMetriLineari(Boolean metriLineari) {
        this.metriLineari = metriLineari;
    }

    public Boolean getUtilizzaPerCalcoloPesi() {
        return utilizzaPerCalcoloPesi;
    }

    public void setUtilizzaPerCalcoloPesi(Boolean utilizzaPerCalcoloPesi) {
        this.utilizzaPerCalcoloPesi = utilizzaPerCalcoloPesi;
    }

    public Boolean getFattoreConversioneKgm() {
        return fattoreConversioneKgm;
    }

    public void setFattoreConversioneKgm(Boolean fattoreConversioneKgm) {
        this.fattoreConversioneKgm = fattoreConversioneKgm;
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