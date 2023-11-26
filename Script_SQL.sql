CREATE DATABASE bookscore;

USE bookscore;

CREATE TABLE tb_usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(50) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    tipoLivro1 VARCHAR(20),
    tipoLivro2 VARCHAR(20),
    ativo VARCHAR(10) NOT NULL
);

CREATE TABLE tb_livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(150) NOT NULL,
    tipo VARCHAR(150) NOT NULL
);

CREATE TABLE tb_notasLivros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    idLivro INT NOT NULL,
    nota VARCHAR(10) NOT NULL,
    idUsuario INT NOT NULL
);

-- Add usuarios

INSERT INTO tb_usuarios (login, nome, idade, sexo, senha, ativo)
VALUES ('admin.admin', 'admin', 0, 'masculino', '0000', 'ativo');

INSERT INTO tb_usuarios (login, nome, idade, sexo, senha, ativo)
VALUES ('usuario.felipe', 'felipe', 25, 'masculino', '1234', 'ativo');


