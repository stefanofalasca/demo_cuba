package com.osl.testcuba.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum EntrataUscita implements EnumClass<String> {

    ENTRATA("Entrata"),
    USCITA("Uscita");

    private String id;

    EntrataUscita(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static EntrataUscita fromId(String id) {
        for (EntrataUscita at : EntrataUscita.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}