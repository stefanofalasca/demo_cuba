-- begin TESTCUBA_FORNITORE
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
)^
-- end TESTCUBA_FORNITORE
-- begin TESTCUBA_ORDINE_T
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
)^
-- end TESTCUBA_ORDINE_T
-- begin TESTCUBA_CATEGORIA_TECNOLOGICA
create table TESTCUBA_CATEGORIA_TECNOLOGICA (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255),
    DESCRIZIONE varchar(255),
    --
    primary key nonclustered (ID)
)^
-- end TESTCUBA_CATEGORIA_TECNOLOGICA
-- begin TESTCUBA_PIANO_CONTO
create table TESTCUBA_PIANO_CONTO (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255),
    DESCRIZIONE varchar(255),
    --
    primary key nonclustered (ID)
)^
-- end TESTCUBA_PIANO_CONTO
-- begin TESTCUBA_PRODOTTO
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
)^
-- end TESTCUBA_PRODOTTO
-- begin TESTCUBA_CATEGORIA_GESTIONALE
create table TESTCUBA_CATEGORIA_GESTIONALE (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255),
    DESCRIZIONE varchar(255),
    --
    primary key nonclustered (ID)
)^
-- end TESTCUBA_CATEGORIA_GESTIONALE
-- begin TESTCUBA_CLIENTE
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
)^
-- end TESTCUBA_CLIENTE
-- begin TESTCUBA_MAGAZZINO
create table TESTCUBA_MAGAZZINO (
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
    DESCRIZIONE varchar(255) not null,
    FISCALE tinyint,
    ESCLUDI_DISPONIBILITA tinyint,
    --
    primary key nonclustered (ID)
)^
-- end TESTCUBA_MAGAZZINO
-- begin TESTCUBA_COMUNE
create table TESTCUBA_COMUNE (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NOME varchar(255) not null,
    CAP varchar(10),
    PROVINCIA varchar(2) not null,
    --
    primary key nonclustered (ID)
)^
-- end TESTCUBA_COMUNE
-- begin TESTCUBA_UNITA_MISURA
create table TESTCUBA_UNITA_MISURA (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255),
    DESCRIZIONE varchar(255),
    FATTORE_CONVERSIONE_KGM tinyint,
    UTILIZZA_PER_CALCOLO_PESI tinyint,
    METRI_LINEARI tinyint,
    QUANTITA_DISCRETA tinyint,
    --
    primary key nonclustered (ID)
)^
-- end TESTCUBA_UNITA_MISURA
-- begin TESTCUBA_ORDINE_D
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
)^
-- end TESTCUBA_ORDINE_D
-- begin TESTCUBA_SCRIPT_TRIGGER
create table TESTCUBA_SCRIPT_TRIGGER (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NAME varchar(50) not null,
    ENTITY varchar(50) not null,
    ENABLED tinyint not null,
    GROOVY_SCRIPT varchar(max) not null,
    --
    primary key nonclustered (ID)
)^
-- end TESTCUBA_SCRIPT_TRIGGER
-- begin TESTCUBA_MOV_MAG
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
)^
-- end TESTCUBA_MOV_MAG
