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
);