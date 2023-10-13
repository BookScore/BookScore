CREATE DATABASE bookscore;

use bookscore;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    sexo varchar(10) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    tipoLivro1 varchar(20),
	tipoLivro2 varchar(20)
);

CREATE TABLE livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(150) NOT NULL,
    tipo varchar(150) NOT NULL
);

CREATE TABLE Notaslivros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    idLivro INT NOT NULL,
	nota VARCHAR(10) NOT NULL
);

INSERT INTO usuarios (nome, idade, sexo, senha)
VALUES ('ADMIN', 0, 'masculino', '0000');
