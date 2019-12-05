create table TESTCUBA_ORDINE_T (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NUMERO integer not null,
    ANNO varchar(255) not null,
    CLIENTE_ID uniqueidentifier,
    --
    primary key nonclustered (ID)
);