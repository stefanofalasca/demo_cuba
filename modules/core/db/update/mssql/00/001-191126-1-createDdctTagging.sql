create table DDCT_TAGGING (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    TAG_ID uniqueidentifier not null,
    TAGGABLE varchar(255) not null,
    TAGGER_ID uniqueidentifier,
    CONTEXT varchar(255),
    --
    primary key nonclustered (ID)
);