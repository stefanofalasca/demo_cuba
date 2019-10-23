package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|codice,descrizione")
@Table(name = "TESTCUBA_PRODOTTO")
@Entity(name = "testcuba_Prodotto")
public class Prodotto extends StandardEntity {
    private static final long serialVersionUID = 2300092457839681064L;

    @NotNull
    @Column(name = "CODICE", nullable = false)
    protected String codice;

    @NotNull
    @Column(name = "DESCRIZIONE", nullable = false)
    protected String descrizione;

    @NotNull
    @Column(name = "TIPO_APPROVIGAMENTO", nullable = false)
    protected String tipoApprovigamento;

    @Column(name = "IMPORTO")
    protected Double importo;

    @Column(name = "PROFILO")
    protected String profilo;

    @Column(name = "LATO_X")
    protected Double latoX;

    @Column(name = "LATO_Y")
    protected Double latoY;

    @Column(name = "DIAMETRO")
    protected Double diametro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAGAZZINO_DEF_ID")
    protected Magazzino magazzinoDef;

    public Magazzino getMagazzinoDef() {
        return magazzinoDef;
    }

    public void setMagazzinoDef(Magazzino magazzinoDef) {
        this.magazzinoDef = magazzinoDef;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    public Double getLatoY() {
        return latoY;
    }

    public void setLatoY(Double latoY) {
        this.latoY = latoY;
    }

    public Double getLatoX() {
        return latoX;
    }

    public void setLatoX(Double latoX) {
        this.latoX = latoX;
    }

    public Profilo getProfilo() {
        return profilo == null ? null : Profilo.fromId(profilo);
    }

    public void setProfilo(Profilo profilo) {
        this.profilo = profilo == null ? null : profilo.getId();
    }

    public Double getImporto() {
        return importo;
    }

    public void setImporto(Double importo) {
        this.importo = importo;
    }

    public Approvigionamento getTipoApprovigamento() {
        return tipoApprovigamento == null ? null : Approvigionamento.fromId(tipoApprovigamento);
    }

    public void setTipoApprovigamento(Approvigionamento tipoApprovigamento) {
        this.tipoApprovigamento = tipoApprovigamento == null ? null : tipoApprovigamento.getId();
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