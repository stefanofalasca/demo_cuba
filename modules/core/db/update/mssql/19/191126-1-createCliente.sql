create table TESTCUBA_CLIENTE (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    CODICE varchar(32) not null,
    RAGIONE_SOCIALE varchar(255) not null,
    COMUNE_ID uniqueidentifier,
    --
    primary key nonclustered (ID)
);