package com.osl.testcuba.listeners;

import com.haulmont.cuba.core.TransactionalDataManager;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import com.haulmont.cuba.core.global.AppBeans;
import com.osl.testcuba.MyCustomValidationException;
import com.osl.testcuba.entity.Prodotto;
import com.osl.testcuba.entity.ScriptTrigger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@Component("testcuba_ProdottoChangedListener")
public class ProdottoChangedListener {
    @Inject
    private TransactionalDataManager txDm;


    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void beforeCommit(EntityChangedEvent<Prodotto, UUID> event) {
        List<ScriptTrigger> triggerList = null;
        Prodotto prodotto = txDm.load(event.getEntityId()).one();

        try {
            String jpql = "select e from testcuba_ScriptTrigger e where e.entity = 'testcuba_Prodotto' and e.enabled = true";
            triggerList = txDm.load(ScriptTrigger.class).query(jpql).list();
        }
        catch (Exception e){

        }
        if (triggerList!=null){

            ScriptGroovyEvalImpl scriptGroovyEval = AppBeans.get(ScriptGroovyEvalImpl.NAME);
            for (ScriptTrigger item:triggerList){
                scriptGroovyEval.setGroovyScript(item.getGroovyScript());
                if (!scriptGroovyEval.test(prodotto))
                {
                    throw new MyCustomValidationException(scriptGroovyEval.message);
                }
                else
                {
                    txDm.save(prodotto);
                }
            }
        }
        else
            txDm.save(prodotto);
    }
}