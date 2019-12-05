-- begin DDCA_ATTACHMENT_CATEGORY
create table DDCA_ATTACHMENT_CATEGORY (
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
    CODE varchar(255),
    --
    primary key nonclustered (ID)
)^
-- end DDCA_ATTACHMENT_CATEGORY
-- begin DDCA_ATTACHEMENT
create table DDCA_ATTACHEMENT (
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
    ATTACHABLE varchar(255) not null,
    FILE_ID uniqueidentifier,
    CATEGORY_ID uniqueidentifier,
    --
    primary key nonclustered (ID)
)^
-- end DDCA_ATTACHEMENT
