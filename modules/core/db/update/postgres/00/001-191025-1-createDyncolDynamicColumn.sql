create table DYNCOL_DYNAMIC_COLUMN (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONTEXT varchar(50) not null,
    NAME varchar(50) not null,
    SCRIPT text,
    --
    primary key (ID)
);