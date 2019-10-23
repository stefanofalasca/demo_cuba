package com.osl.testcuba.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "TESTCUBA_ORDINE_T")
@Entity(name = "testcuba_OrdineT")
public class OrdineT extends StandardEntity {
    private static final long serialVersionUID = -1963358368184426763L;

    @NotNull
    @Column(name = "NUMERO", nullable = false)
    protected Integer numero;

    @NotNull
    @Column(name = "ANNO", nullable = false)
    protected String anno;

    @OneToMany(mappedBy = "ordine")
    protected List<OrdineD> dettagli;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENTE_ID")
    protected Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<OrdineD> getDettagli() {
        return dettagli;
    }

    public void setDettagli(List<OrdineD> dettagli) {
        this.dettagli = dettagli;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}