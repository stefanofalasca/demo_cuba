create table DDCDI_IMPORT_EXEC (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    FILE_ID uniqueidentifier,
    STARTED_AT datetime2,
    FINISHED_AT datetime2,
    ENTITIES_PROCESSED integer,
    ENTITIES_IMPORT_SUCCESS integer,
    ENTITIES_IMPORT_VAL_ERROR integer,
    ENTITIES_PRE_COMMIT_SKIPPED integer,
    ENTITIES_UNIQUE_CONSTRAINT_SKIPPED integer,
    SUCCESS tinyint not null,
    CONFIGURATION_ID uniqueidentifier,
    --
    primary key nonclustered (ID)
);