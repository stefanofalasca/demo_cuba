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
);