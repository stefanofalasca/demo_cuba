create table TESTCUBA_PRODOTTO (
    ID varchar(36) not null,
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
    MAGAZZINO_DEF_ID varchar(36),
    --
    primary key (ID)
);