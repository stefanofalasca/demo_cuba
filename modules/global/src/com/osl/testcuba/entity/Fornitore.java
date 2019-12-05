package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|ragioneSociale")
@Table(name = "TESTCUBA_FORNITORE")
@Entity(name = "testcuba_Fornitore")
public class Fornitore extends StandardEntity {
    private static final long serialVersionUID = 2489570204337859336L;

    @NotNull
    @Column(name = "CODICE", nullable = false, length = 50)
    protected String codice;

    @NotNull
    @Column(name = "RAGIONE_SOCIALE", nullable = false)
    protected String ragioneSociale;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COMUNE_ID")
    protected Comune comune;

    public Comune getComune() {
        return comune;
    }

    public void setComune(Comune comune) {
        this.comune = comune;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
}