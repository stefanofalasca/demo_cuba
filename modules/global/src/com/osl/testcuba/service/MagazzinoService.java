package com.osl.testcuba.service;

import com.osl.testcuba.entity.Prodotto;

public interface MagazzinoService {
    String NAME = "testcuba_MagazzinoService";

    Double getGiacenza(Prodotto prodotto);
}