create table TESTCUBA_MOV_MAG (
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
    QUANTITA double precision not null,
    ENTRATA_USCITA varchar(50) not null,
    --
    primary key nonclustered (ID)
);