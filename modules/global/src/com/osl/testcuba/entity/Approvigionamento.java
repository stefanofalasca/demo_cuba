package com.osl.testcuba.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Approvigionamento implements EnumClass<String> {

    ACQUISTO("A"),
    PRODUZIONE("P"),
    CONSUMO("C");

    private String id;

    Approvigionamento(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Approvigionamento fromId(String id) {
        for (Approvigionamento at : Approvigionamento.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}