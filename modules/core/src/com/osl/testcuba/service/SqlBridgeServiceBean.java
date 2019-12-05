package com.osl.testcuba.service;

import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.haulmont.cuba.core.Transaction;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service(SqlBridgeService.NAME)
public class SqlBridgeServiceBean implements SqlBridgeService {

    @Inject
    private Persistence persistence;

    @Override
    public List<String> getIDItems(String sqlNative) {
        List list = new ArrayList();
        try (Transaction tx = persistence.createTransaction()) {
            Query query = persistence.getEntityManager().createNativeQuery(sqlNative);
            list = query.getResultList();
            tx.commit();
        }

        return list;
    }
    public void deleteProdotti(){
        try (Transaction tx = persistence.createTransaction()) {
            String sql = "delete from testcuba_prodotto";
            Query query = persistence.getEntityManager().createNativeQuery(sql);
            query.executeUpdate();
            tx.commit();
        }
    }
}