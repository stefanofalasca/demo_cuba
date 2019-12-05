package com.osl.testcuba.service;

import java.util.List;
import java.util.UUID;

public interface SqlBridgeService {
    String NAME = "testcuba_SqlBridgeService";

    List<String> getIDItems(String sqlNative);
    void deleteProdotti();

}