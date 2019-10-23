create table TESTCUBA_ORDINE_D (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODOTTO_ID varchar(36) not null,
    QUANTITA double precision,
    ORDINE_ID varchar(36) not null,
    --
    primary key (ID)
);