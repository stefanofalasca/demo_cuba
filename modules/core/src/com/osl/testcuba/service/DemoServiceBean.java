package com.osl.testcuba.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service(DemoService.NAME)
public class DemoServiceBean implements DemoService {

    private static final Logger log = LoggerFactory.getLogger(DemoServiceBean.class);

    /**
     * Esempio di servizio. Logga una stringa in info mode mediante il servizio LoggerFactory
     * @author Stefano Falasca
     */
    @Override
    public void helloWorld() {
        log.info("Hello World");
    }
}