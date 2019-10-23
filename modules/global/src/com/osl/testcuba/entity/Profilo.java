package com.osl.testcuba.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Profilo implements EnumClass<String> {

    QUADRO("QUADRO"),
    RETTANGOLO("RETTANGOLO"),
    TONDO("TONDO"),
    ESAGONO("ESAGONO"),
    PENTAGONO("PENTAGONO");

    private String id;

    Profilo(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Profilo fromId(String id) {
        for (Profilo at : Profilo.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}