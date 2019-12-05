create table TESTCUBA_UNITA_MISURA (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255),
    DESCRIZIONE varchar(255),
    FATTORE_CONVERSIONE_KGM tinyint,
    UTILIZZA_PER_CALCOLO_PESI tinyint,
    METRI_LINEARI tinyint,
    QUANTITA_DISCRETA tinyint,
    --
    primary key nonclustered (ID)
);