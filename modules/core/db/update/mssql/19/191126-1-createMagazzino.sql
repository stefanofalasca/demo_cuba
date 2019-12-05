create table TESTCUBA_MAGAZZINO (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255) not null,
    DESCRIZIONE varchar(255) not null,
    FISCALE tinyint,
    ESCLUDI_DISPONIBILITA tinyint,
    --
    primary key nonclustered (ID)
);