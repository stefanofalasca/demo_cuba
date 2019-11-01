create table SCRIPTCOLUMNS_DYN_COL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(50) not null,
    USER_ID uuid not null,
    CONTEXT varchar(255) not null,
    GROOVY_SCRIPT text not null,
    --
    primary key (ID)
);