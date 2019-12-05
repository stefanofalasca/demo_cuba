package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@PublishEntityChangedEvents
@NamePattern("%s %s|codice,descrizione")
@Table(name = "TESTCUBA_PRODOTTO")
@Entity(name = "testcuba_Prodotto")
public class Prodotto extends StandardEntity {
    private static final long serialVersionUID = 2300092457839681064L;

    @NotNull
    @Column(name = "CODICE", nullable = false)
    protected String codice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UNITA_MISURA_ID")
    protected UnitaMisura unitaMisura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PIANO_CONTO_ID")
    protected PianoConto pianoConto;

    @Column(name = "COSTO_PRIMO")
    protected Double costoPrimo;

    @Column(name = "COSTO_STANDARD")
    protected Double costoStandard;

    @NotNull
    @Column(name = "DESCRIZIONE", nullable = false)
    protected String descrizione;

    @Column(name = "DESCRIZIONE1")
    protected String descrizione1;

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

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "prodotto")
    protected List<OrdineD> ordini;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FORNITORE_DEFAULT_ID")
    protected Fornitore fornitoreDefault;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORIA_GESTIONALE_ID")
    protected CategoriaGestionale categoriaGestionale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORIA_TECNOLOGICA_ID")
    protected CategoriaTecnologica categoriaTecnologica;

    public Double getCostoStandard() {
        return costoStandard;
    }

    public void setCostoStandard(Double costoStandard) {
        this.costoStandard = costoStandard;
    }

    public Double getCostoPrimo() {
        return costoPrimo;
    }

    public void setCostoPrimo(Double costoPrimo) {
        this.costoPrimo = costoPrimo;
    }

    public PianoConto getPianoConto() {
        return pianoConto;
    }

    public void setPianoConto(PianoConto pianoConto) {
        this.pianoConto = pianoConto;
    }

    public UnitaMisura getUnitaMisura() {
        return unitaMisura;
    }

    public void setUnitaMisura(UnitaMisura unitaMisura) {
        this.unitaMisura = unitaMisura;
    }

    public CategoriaTecnologica getCategoriaTecnologica() {
        return categoriaTecnologica;
    }

    public void setCategoriaTecnologica(CategoriaTecnologica categoriaTecnologica) {
        this.categoriaTecnologica = categoriaTecnologica;
    }

    public CategoriaGestionale getCategoriaGestionale() {
        return categoriaGestionale;
    }

    public void setCategoriaGestionale(CategoriaGestionale categoriaGestionale) {
        this.categoriaGestionale = categoriaGestionale;
    }

    public String getDescrizione1() {
        return descrizione1;
    }

    public void setDescrizione1(String descrizione1) {
        this.descrizione1 = descrizione1;
    }

    public Fornitore getFornitoreDefault() {
        return fornitoreDefault;
    }

    public void setFornitoreDefault(Fornitore fornitoreDefault) {
        this.fornitoreDefault = fornitoreDefault;
    }

    public List<OrdineD> getOrdini() {
        return ordini;
    }

    public void setOrdini(List<OrdineD> ordini) {
        this.ordini = ordini;
    }

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