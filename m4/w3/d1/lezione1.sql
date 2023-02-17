/* create database dbtest;*/
/* drop database dbtest; */
drop table utente;
drop table citta;
create table if not exists utente (
	id serial primary key,
	nome varchar not null,
	cognome varchar NOT null,
	citta int8 not null,
	constraint citta_fk foreign key (citta) references citta (id)
	);
create table if not exists citta (
	id serial primary key,
	nome varchar not null,
	provincia varchar not null,
	regione varchar not null 
	);
alter table utente add cf varchar not null unique;
 /*drop table citta;*/
 /*alter table utente drop column cf;*/
/* alter table utente rename column citta to city; */
truncate utente;
truncate citta cascade;
/* DML */
insert into utente ( nome, cognome, citta, cf) values ( 'mario', 'rossi', 1,'trn123fttb');
insert into utente ( nome, cognome, citta, cf) values ( 'giuseppe', 'verdi', 2,'ztf123tfz');
insert into utente ( nome, cognome, citta, cf) values ( 'giorgia', 'neri', 1, 'abc123def');
insert into citta ( nome, provincia, regione) values ( 'roma', 'roma', 'lazio');
insert into citta ( nome, provincia, regione) values ( 'milano', 'milano', 'lombardia');
insert into citta ( nome, provincia, regione) values ( 'napoli', 'napoli', 'campania');

update utente set citta = 3, cf = 'asjdgadyu2132' where id=3;

delete from utente where id=2; 

/*DQL*/
select * from citta;
select * from utente;
select nome,cognome from utente;
select nome, cognome from utente where citta=1; /* restituisce un result set */
select nome, cognome from utente like '%123%'; /* qualsiasi cosa davanti e qualsiasi cosa dietro*/
select * from utente inner join citta on utente.citta = citta.id;/* colleghero le due tabelle nel punto di congiunzione, che e la foreign key prendendo solamente in campi collegati*/
select * from utente left join citta on utente.citta = citta.id;
select * from utente right join citta on utente.citta = citta.id;
select * from utente full join citta on utente.citta = citta.id;