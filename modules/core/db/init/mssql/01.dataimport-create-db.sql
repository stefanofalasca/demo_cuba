-- begin DDCDI_IMPORT_EXEC_DETAIL
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
)^
-- end DDCDI_IMPORT_EXEC_DETAIL
-- begin DDCDI_IMPORT_EXEC
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
)^
-- end DDCDI_IMPORT_EXEC
-- begin DDCDI_UNIQUE_CONFIGURATION
create table DDCDI_UNIQUE_CONFIGURATION (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    POLICY varchar(50) not null,
    IMPORT_CONFIGURATION_ID uniqueidentifier not null,
    --
    primary key nonclustered (ID)
)^
-- end DDCDI_UNIQUE_CONFIGURATION
-- begin DDCDI_UNIQUE_CONFIGURATION_ATTRIBUTE
create table DDCDI_UNIQUE_CONFIGURATION_ATTRIBUTE (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    ENTITY_ATTRIBUTE varchar(255) not null,
    UNIQUE_CONFIGURATION_ID uniqueidentifier not null,
    --
    primary key nonclustered (ID)
)^
-- end DDCDI_UNIQUE_CONFIGURATION_ATTRIBUTE
-- begin DDCDI_IMPORT_ATTRIBUTE_MAPPER
create table DDCDI_IMPORT_ATTRIBUTE_MAPPER (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    CONFIGURATION_ID uniqueidentifier not null,
    MAPPER_MODE varchar(50) not null,
    ATTRIBUTE_TYPE varchar(50),
    ENTITY_ATTRIBUTE varchar(255),
    ASSOCIATION_LOOKUP_ATTRIBUTE varchar(255),
    FILE_COLUMN_NUMBER integer not null,
    FILE_COLUMN_ALIAS varchar(255),
    CUSTOM_ATTRIBUTE_BIND_SCRIPT varchar(max),
    --
    primary key nonclustered (ID)
)^
-- end DDCDI_IMPORT_ATTRIBUTE_MAPPER
-- begin DDCDI_IMPORT_CONFIGURATION
create table DDCDI_IMPORT_CONFIGURATION (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TRANSACTION_STRATEGY varchar(50) not null,
    ENTITY_CLASS varchar(255) not null,
    AD_HOC tinyint,
    TEMPLATE_ID uniqueidentifier,
    COMMENT_ varchar(max),
    DATE_FORMAT varchar(255),
    BOOLEAN_TRUE_VALUE varchar(255),
    BOOLEAN_FALSE_VALUE varchar(255),
    PRE_COMMIT_SCRIPT varchar(max),
    FILE_CHARSET varchar(255),
    --
    primary key nonclustered (ID)
)^
-- end DDCDI_IMPORT_CONFIGURATION
