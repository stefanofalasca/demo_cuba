package com.osl.testcuba.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENTE_ID")
    protected Cliente cliente;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "ordine")
    protected List<OrdineD> dettagli;

    public List<OrdineD> getDettagli() {
        return dettagli;
    }

    public void setDettagli(List<OrdineD> dettagli) {
        this.dettagli = dettagli;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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