package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|ragioneSociale")
@Table(name = "TESTCUBA_CLIENTE")
@Entity(name = "testcuba_Cliente")
public class Cliente extends StandardEntity {
    private static final long serialVersionUID = -891321175667884435L;

    @NotNull
    @Column(name = "CODICE", nullable = false, length = 32)
    protected String codice;

    @NotNull
    @Column(name = "RAGIONE_SOCIALE", nullable = false)
    protected String ragioneSociale;

    @ManyToOne(fetch = FetchType.LAZY)
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