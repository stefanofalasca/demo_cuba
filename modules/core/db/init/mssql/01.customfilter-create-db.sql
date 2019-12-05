-- begin CUSTOMFILTER_TEST_CF
create table CUSTOMFILTER_TEST_CF (
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
    QUANTITA double precision,
    --
    primary key nonclustered (ID)
)^
-- end CUSTOMFILTER_TEST_CF
-- begin CUSTOMFILTER_CUSTOM_FILTER
create table CUSTOMFILTER_CUSTOM_FILTER (
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
    GROOVY_SCRIPT varchar(max) not null,
    COLLECTION varchar(50) not null,
    SCREEN varchar(50) not null,
    USER_ID uniqueidentifier not null,
    ENABLED tinyint,
    --
    primary key nonclustered (ID)
)^
-- end CUSTOMFILTER_CUSTOM_FILTER
