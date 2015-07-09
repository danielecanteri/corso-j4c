create table DIPENDENTI (
	id				number,
	nome			varchar2(25),
	cognome			varchar2(25),
	data_inizio		date,
	data_fine		date
);

create table ESTRAZIONE_DIPENDENTI (
	anno			number,
	mese			number,
	id				number,
	nominativo		varchar2(60)
);

create table PROVA(
	descrizione varchar2(10)
);

create table PROVA_OUT(
	descr varchar2(10),
	length number
);