create table CUSTOMCOLUMNS_TEST_CC (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255),
    DESCRIZIONE varchar(255),
    IMPORTO double precision,
    DATA_ORA timestamp,
    QUANTITA double precision,
    --
    primary key (ID)
);