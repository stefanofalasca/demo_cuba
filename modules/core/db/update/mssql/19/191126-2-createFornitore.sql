alter table TESTCUBA_FORNITORE add constraint FK_TESTCUBA_FORNITORE_ON_COMUNE foreign key (COMUNE_ID) references TESTCUBA_COMUNE(ID);
create index IDX_TESTCUBA_FORNITORE_ON_COMUNE on TESTCUBA_FORNITORE (COMUNE_ID);
