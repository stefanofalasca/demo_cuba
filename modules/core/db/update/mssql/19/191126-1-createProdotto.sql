create table TESTCUBA_PRODOTTO (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255) not null,
    UNITA_MISURA_ID uniqueidentifier,
    PIANO_CONTO_ID uniqueidentifier,
    COSTO_PRIMO double precision,
    COSTO_STANDARD double precision,
    DESCRIZIONE varchar(255) not null,
    DESCRIZIONE1 varchar(255),
    TIPO_APPROVIGAMENTO varchar(50) not null,
    IMPORTO double precision,
    PROFILO varchar(50),
    LATO_X double precision,
    LATO_Y double precision,
    DIAMETRO double precision,
    MAGAZZINO_DEF_ID uniqueidentifier,
    FORNITORE_DEFAULT_ID uniqueidentifier,
    CATEGORIA_GESTIONALE_ID uniqueidentifier,
    CATEGORIA_TECNOLOGICA_ID uniqueidentifier,
    --
    primary key nonclustered (ID)
);