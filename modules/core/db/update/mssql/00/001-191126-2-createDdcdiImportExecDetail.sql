alter table DDCDI_IMPORT_EXEC_DETAIL add constraint FK_DDCDI_IMPORT_EXEC_DETAIL_ON_IMPORT_EXEC foreign key (IMPORT_EXEC_ID) references DDCDI_IMPORT_EXEC(ID);
create index IDX_DDCDI_IMPORT_EXEC_DETAIL_ON_IMPORT_EXEC on DDCDI_IMPORT_EXEC_DETAIL (IMPORT_EXEC_ID);
