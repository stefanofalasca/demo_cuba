create table TESTCUBA_FORNITORE (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    CODICE varchar(50) not null,
    RAGIONE_SOCIALE varchar(255) not null,
    COMUNE_ID uniqueidentifier not null,
    --
    primary key nonclustered (ID)
);