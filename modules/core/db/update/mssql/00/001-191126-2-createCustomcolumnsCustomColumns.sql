alter table CUSTOMCOLUMNS_CUSTOM_COLUMNS add constraint FK_CUSTOMCOLUMNS_CUSTOM_COLUMNS_ON_USER foreign key (USER_ID) references SEC_USER(ID);
create index IDX_CUSTOMCOLUMNS_CUSTOM_COLUMNS_ON_USER on CUSTOMCOLUMNS_CUSTOM_COLUMNS (USER_ID);
