-- begin DDCT_TAG
create table DDCT_TAG (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    VALUE_ varchar(255) not null,
    CONTEXT varchar(255),
    --
    primary key nonclustered (ID)
)^
-- end DDCT_TAG
-- begin DDCT_TAGGING
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
)^
-- end DDCT_TAGGING
