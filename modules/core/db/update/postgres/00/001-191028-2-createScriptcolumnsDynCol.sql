alter table SCRIPTCOLUMNS_DYN_COL add constraint FK_SCRIPTCOLUMNS_DYN_COL_ON_USER foreign key (USER_ID) references SEC_USER(ID);
create index IDX_SCRIPTCOLUMNS_DYN_COL_ON_USER on SCRIPTCOLUMNS_DYN_COL (USER_ID);