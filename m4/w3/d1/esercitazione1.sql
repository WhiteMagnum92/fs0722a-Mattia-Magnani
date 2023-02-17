create table if not exists clienti (
	id serial primary key,
	nome varchar not null,
	cognome varchar not null,
	dataNascita date not null,
	regioneResidenza varchar not null
	constraint id_fk foreign key (fatture) references fatture(id)
	);
create table if not exists fatture (
	numeroFattura int8 primary key,
	tipologia varchar not null,
	importo decimal not null,
	iva varchar not null default '20%',
	id serial,
	dataFattura int8 not null,
	numeroFornitore int8 not null
	);
create table if not exists prodotti (
	id serial primary key,
	descrizione varchar not null,
	inProduzione boolean not null default 'false',
	inCommercio boolean not null default 'false',
	dataAttivazione date not null,
	dataDisattivazione date not null
	);
create table if not exists fornitori (
	id serial primary key,
	denominazione varchar not null,
	regioneResidenza varchar not null,
	);			
	
	