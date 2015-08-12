insert into PROVA  values ('abc');
insert into PROVA  values ('def');
insert into PROVA  values ('ghi');

insert into TIPO_CONTRATTO (id, descrizione) values (1, 'Tempo indeterminato');
insert into TIPO_CONTRATTO (id, descrizione) values (2, 'Partita iva');
insert into TIPO_CONTRATTO (id, descrizione) values (3, 'Apprendistato');

insert into DIPENDENTI (id, nome, cognome, data_inizio, data_fine, tipo_contratto) values (1, 'Mario', 'Rossi', '2010-10-09', '2012-12-31', 1); 
insert into DIPENDENTI (id, nome, cognome, data_inizio, data_fine, tipo_contratto) values (2, 'Luigi', 'Bianchi', '2012-02-01', null, 2); 
insert into DIPENDENTI (id, nome, cognome, data_inizio, data_fine, tipo_contratto) values (3, 'Alice', 'Avesani', '2015-01-01', '2015-12-31', 3);

insert into PERMESSI (id_dipendente, data_permesso, ore) values (1, '2015-01-03', 2); 
insert into PERMESSI (id_dipendente, data_permesso, ore) values (1, '2015-02-11', 8); 
insert into PERMESSI (id_dipendente, data_permesso, ore) values (1, '2015-02-15', 4); 
insert into PERMESSI (id_dipendente, data_permesso, ore) values (1, '2015-03-20', 8); 
insert into PERMESSI (id_dipendente, data_permesso, ore) values (2, '2015-01-06', 4); 
insert into PERMESSI (id_dipendente, data_permesso, ore) values (2, '2015-07-01', 8); 
insert into PERMESSI (id_dipendente, data_permesso, ore) values (3, '2015-12-31', 8); 
 