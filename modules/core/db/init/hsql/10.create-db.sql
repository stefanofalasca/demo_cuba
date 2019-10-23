-- begin TESTCUBA_CLIENTE
create table TESTCUBA_CLIENTE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODICE varchar(32) not null,
    RAGIONE_SOCIALE varchar(255) not null,
    COMUNE_ID varchar(36),
    --
    primary key (ID)
)^
-- end TESTCUBA_CLIENTE
-- begin TESTCUBA_COMUNE
create table TESTCUBA_COMUNE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NOME varchar(255) not null,
    PROVINCIA varchar(2) not null,
    --
    primary key (ID)
)^
-- end TESTCUBA_COMUNE
