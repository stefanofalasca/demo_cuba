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
);