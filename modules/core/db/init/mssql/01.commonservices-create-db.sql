-- begin COMMONSERVICES_GROOVY_FILTER_TEST
create table COMMONSERVICES_GROOVY_FILTER_TEST (
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
    QUANTITA double precision,
    COSTO double precision,
    --
    primary key nonclustered (ID)
)^
-- end COMMONSERVICES_GROOVY_FILTER_TEST
-- begin COMMONSERVICES_GROOVY_FILTER
create table COMMONSERVICES_GROOVY_FILTER (
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
    ENABLED tinyint not null,
    USER_ID uniqueidentifier,
    SHARE_WITH_ALL tinyint,
    --
    primary key nonclustered (ID)
)^
-- end COMMONSERVICES_GROOVY_FILTER
-- begin COMMONSERVICES_GROOVY_FILTER_GROUP_LINK
create table COMMONSERVICES_GROOVY_FILTER_GROUP_LINK (
    GROOVY_FILTER_ID uniqueidentifier,
    GROUP_ID uniqueidentifier,
    primary key (GROOVY_FILTER_ID, GROUP_ID)
)^

-- end COMMONSERVICES_GROOVY_FILTER_GROUP_LINK
