-- begin CUSTOMCOLUMNS_TEST_CC
create table CUSTOMCOLUMNS_TEST_CC (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODICE varchar(255),
    DESCRIZIONE varchar(255),
    IMPORTO double precision,
    DATA_ORA timestamp,
    QUANTITA double precision,
    --
    primary key (ID)
)^
-- end CUSTOMCOLUMNS_TEST_CC
-- begin CUSTOMCOLUMNS_CUSTOM_COLUMNS
create table CUSTOMCOLUMNS_CUSTOM_COLUMNS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME text not null,
    GROOVY_SCRIPT text not null,
    COLUMN_FROM_ENTITY boolean,
    CONTEXT varchar(255) not null,
    USER_ID uuid,
    --
    primary key (ID)
)^
-- end CUSTOMCOLUMNS_CUSTOM_COLUMNS
