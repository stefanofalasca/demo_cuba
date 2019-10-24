-- begin TESTCUBA_ORDINE_T
create table TESTCUBA_ORDINE_T (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMERO integer not null,
    ANNO varchar(255) not null,
    CLIENTE_ID uuid,
    --
    primary key (ID)
)^
-- end TESTCUBA_ORDINE_T
-- begin TESTCUBA_PRODOTTO
create table TESTCUBA_PRODOTTO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255) not null,
    DESCRIZIONE varchar(255) not null,
    TIPO_APPROVIGAMENTO varchar(50) not null,
    IMPORTO double precision,
    PROFILO varchar(50),
    LATO_X double precision,
    LATO_Y double precision,
    DIAMETRO double precision,
    MAGAZZINO_DEF_ID uuid,
    --
    primary key (ID)
)^
-- end TESTCUBA_PRODOTTO
-- begin TESTCUBA_CLIENTE
create table TESTCUBA_CLIENTE (
    ID uuid,
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
    COMUNE_ID uuid,
    --
    primary key (ID)
)^
-- end TESTCUBA_CLIENTE
-- begin TESTCUBA_MAGAZZINO
create table TESTCUBA_MAGAZZINO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255) not null,
    DESCRIZIONE varchar(255) not null,
    --
    primary key (ID)
)^
-- end TESTCUBA_MAGAZZINO
-- begin TESTCUBA_COMUNE
create table TESTCUBA_COMUNE (
    ID uuid,
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
-- begin TESTCUBA_ORDINE_D
create table TESTCUBA_ORDINE_D (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODOTTO_ID uuid not null,
    PREZZO double precision,
    QUANTITA double precision,
    ORDINE_ID uuid not null,
    --
    primary key (ID)
)^
-- end TESTCUBA_ORDINE_D
