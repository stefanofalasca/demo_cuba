create table TESTCUBA_ORDINE_D (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    PRODOTTO_ID uniqueidentifier not null,
    PREZZO double precision,
    QUANTITA double precision,
    ORDINE_ID uniqueidentifier not null,
    --
    primary key nonclustered (ID)
);