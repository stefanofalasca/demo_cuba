alter table DDCDI_IMPORT_CONFIGURATION add constraint FK_DDCDI_IMPORT_CONFIGURATION_ON_TEMPLATE foreign key (TEMPLATE_ID) references SYS_FILE(ID);
create index IDX_DDCDI_IMPORT_CONFIGURATION_ON_TEMPLATE on DDCDI_IMPORT_CONFIGURATION (TEMPLATE_ID);