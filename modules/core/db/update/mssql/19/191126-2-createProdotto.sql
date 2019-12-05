alter table TESTCUBA_PRODOTTO add constraint FK_TESTCUBA_PRODOTTO_ON_UNITA_MISURA foreign key (UNITA_MISURA_ID) references TESTCUBA_UNITA_MISURA(ID);
alter table TESTCUBA_PRODOTTO add constraint FK_TESTCUBA_PRODOTTO_ON_PIANO_CONTO foreign key (PIANO_CONTO_ID) references TESTCUBA_PIANO_CONTO(ID);
alter table TESTCUBA_PRODOTTO add constraint FK_TESTCUBA_PRODOTTO_ON_MAGAZZINO_DEF foreign key (MAGAZZINO_DEF_ID) references TESTCUBA_MAGAZZINO(ID);
alter table TESTCUBA_PRODOTTO add constraint FK_TESTCUBA_PRODOTTO_ON_FORNITORE_DEFAULT foreign key (FORNITORE_DEFAULT_ID) references TESTCUBA_FORNITORE(ID);
alter table TESTCUBA_PRODOTTO add constraint FK_TESTCUBA_PRODOTTO_ON_CATEGORIA_GESTIONALE foreign key (CATEGORIA_GESTIONALE_ID) references TESTCUBA_CATEGORIA_GESTIONALE(ID);
alter table TESTCUBA_PRODOTTO add constraint FK_TESTCUBA_PRODOTTO_ON_CATEGORIA_TECNOLOGICA foreign key (CATEGORIA_TECNOLOGICA_ID) references TESTCUBA_CATEGORIA_TECNOLOGICA(ID);
create index IDX_TESTCUBA_PRODOTTO_ON_UNITA_MISURA on TESTCUBA_PRODOTTO (UNITA_MISURA_ID);
create index IDX_TESTCUBA_PRODOTTO_ON_PIANO_CONTO on TESTCUBA_PRODOTTO (PIANO_CONTO_ID);
create index IDX_TESTCUBA_PRODOTTO_ON_MAGAZZINO_DEF on TESTCUBA_PRODOTTO (MAGAZZINO_DEF_ID);
create index IDX_TESTCUBA_PRODOTTO_ON_FORNITORE_DEFAULT on TESTCUBA_PRODOTTO (FORNITORE_DEFAULT_ID);
create index IDX_TESTCUBA_PRODOTTO_ON_CATEGORIA_GESTIONALE on TESTCUBA_PRODOTTO (CATEGORIA_GESTIONALE_ID);
create index IDX_TESTCUBA_PRODOTTO_ON_CATEGORIA_TECNOLOGICA on TESTCUBA_PRODOTTO (CATEGORIA_TECNOLOGICA_ID);
