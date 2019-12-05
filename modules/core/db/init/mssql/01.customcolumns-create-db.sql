-- begin CUSTOMCOLUMNS_TEST_CC
create table CUSTOMCOLUMNS_TEST_CC (
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
    IMPORTO double precision,
    DATA_ORA datetime,
    QUANTITA double precision,
    --
    primary key nonclustered (ID)
)^
-- end CUSTOMCOLUMNS_TEST_CC
-- begin CUSTOMCOLUMNS_CUSTOM_COLUMNS
create table CUSTOMCOLUMNS_CUSTOM_COLUMNS (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NAME varchar(max) not null,
    GROOVY_SCRIPT varchar(max) not null,
    COLUMN_FROM_ENTITY tinyint,
    CONTEXT varchar(255) not null,
    USER_ID uniqueidentifier,
    --
    primary key nonclustered (ID)
)^
-- end CUSTOMCOLUMNS_CUSTOM_COLUMNS
