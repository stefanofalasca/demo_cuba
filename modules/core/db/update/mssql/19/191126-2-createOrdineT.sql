alter table TESTCUBA_ORDINE_T add constraint FK_TESTCUBA_ORDINE_T_ON_CLIENTE foreign key (CLIENTE_ID) references TESTCUBA_CLIENTE(ID);
create index IDX_TESTCUBA_ORDINE_T_ON_CLIENTE on TESTCUBA_ORDINE_T (CLIENTE_ID);
