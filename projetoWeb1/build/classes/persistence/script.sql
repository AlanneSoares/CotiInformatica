create database db;

use db;

create table aluno (
	id int primary key auto_increment,
	nome varchar (50),
	email varchar (50)
	);
	
create table disciplina (
	id int primary key auto_increment,
	disciplina varchar (50),
	nota1 float,
	nota2 float,
	media float,
	situacao varchar (50),
	id_aluno int,
	foreign key (id_aluno) references aluno(id)
);

insert into aluno values (10, 'joao', 'joao@gmail.com');

insert into disciplina values (200, 'java', 2,1,1.5, 'reprovado', 10);