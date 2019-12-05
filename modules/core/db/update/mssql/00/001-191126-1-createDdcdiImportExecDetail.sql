create table DDCDI_IMPORT_EXEC_DETAIL (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    MESSAGE varchar(4000) not null,
    LEVEL_ varchar(50) not null,
    TIME_ datetime2 not null,
    STACKTRACE varchar(max),
    IMPORT_EXEC_ID uniqueidentifier not null,
    DATA_ROW varchar(max),
    DATA_ROW_INDEX integer,
    ENTITY_INSTANCE varchar(max),
    CATEGORY varchar(50),
    --
    primary key nonclustered (ID)
);