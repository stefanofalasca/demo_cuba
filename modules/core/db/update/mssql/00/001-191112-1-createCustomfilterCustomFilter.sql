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
);