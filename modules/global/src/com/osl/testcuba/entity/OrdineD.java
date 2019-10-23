package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|prodotto")
@Table(name = "TESTCUBA_ORDINE_D")
@Entity(name = "testcuba_OrdineD")
public class OrdineD extends StandardEntity {
    private static final long serialVersionUID = -5782213858003405486L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODOTTO_ID")
    protected Prodotto prodotto;

    @Column(name = "PREZZO")
    protected Double prezzo;

    @Column(name = "QUANTITA")
    protected Double quantita;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDINE_ID")
    protected OrdineT ordine;

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public OrdineT getOrdine() {
        return ordine;
    }

    public void setOrdine(OrdineT ordine) {
        this.ordine = ordine;
    }

    public Double getQuantita() {
        return quantita;
    }

    public void setQuantita(Double quantita) {
        this.quantita = quantita;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }
}