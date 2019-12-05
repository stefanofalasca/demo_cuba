package com.osl.testcuba.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TESTCUBA_MOV_MAG", indexes = {
        @Index(name = "IDX_TESTCUBA_MOV_MAG", columnList = "PRODOTTO_ID")
})
@Entity(name = "testcuba_MovMag")
public class MovMag extends StandardEntity {
    private static final long serialVersionUID = 3115000676161897218L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODOTTO_ID")
    protected Prodotto prodotto;

    @NotNull
    @Column(name = "QUANTITA", nullable = false)
    protected Double quantita;

    @NotNull
    @Column(name = "ENTRATA_USCITA", nullable = false)
    protected String entrataUscita;

    public EntrataUscita getEntrataUscita() {
        return entrataUscita == null ? null : EntrataUscita.fromId(entrataUscita);
    }

    public void setEntrataUscita(EntrataUscita entrataUscita) {
        this.entrataUscita = entrataUscita == null ? null : entrataUscita.getId();
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