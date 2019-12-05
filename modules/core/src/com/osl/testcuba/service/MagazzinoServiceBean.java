package com.osl.testcuba.service;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.osl.commonservices.scannerbeans.ExposeMethod;
import com.osl.commonservices.scannerbeans.ExposeService;
import com.osl.testcuba.entity.MovMag;
import com.osl.testcuba.entity.Prodotto;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@ExposeService
@Service(MagazzinoService.NAME)
public class MagazzinoServiceBean implements MagazzinoService {

    @Inject
    private Persistence persistence;

    @ExposeMethod
    @Override
    public Double getGiacenza(Prodotto prodotto) {
        Double valore = 0.0;
        try (Transaction tx = persistence.getTransaction()) {
            EntityManager entityManager = persistence.getEntityManager();
            String jpql = "select sum (case when (e.entrataUscita = 'uscita') then -e.quantita else e.quantita end) giacenza " +
                    "from testcuba_MovMag e where e.prodotto = :prodotto";

            valore = (Double)entityManager.createQuery(jpql)
                    .setParameter("prodotto", prodotto)
                    .getFirstResult();


            tx.commit();
        }
        return valore==null ? 0 : valore;
    }
}