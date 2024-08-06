create table pgms(

    id bigint not null auto_increment,
    nome varchar(40) not null,
    dia varchar(20) not null,
    hora varchar(15) not null unique,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    uf char(2) not null,
    cidade varchar(100) not null,

    primary key(id)

);