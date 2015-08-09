insert into PROVA  values ('abc');
insert into PROVA  values ('def');
insert into PROVA  values ('ghi');

insert into TIPO_CONTRATTO (id, descrizione) values (1, 'Tempo indeterminato');
insert into TIPO_CONTRATTO (id, descrizione) values (2, 'Partita iva');
insert into TIPO_CONTRATTO (id, descrizione) values (3, 'Apprendistato');

insert into DIPENDENTI (id, nome, cognome, data_inizio, data_fine, tipo_contratto) values (1, 'Mario', 'Rossi', '2010-10-09', '2012-12-31', 1); 
insert into DIPENDENTI (id, nome, cognome, data_inizio, data_fine, tipo_contratto) values (2, 'Luigi', 'Bianchi', '2012-02-01', null, 2); 
insert into DIPENDENTI (id, nome, cognome, data_inizio, data_fine, tipo_contratto) values (3, 'Alice', 'Avesani', '2015-01-01', '2015-12-31', 3); 