CREATE DATABASE gestao_veiculos;
USE gestao_veiculos;

CREATE TABLE marca (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE modelo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    id_marca INT NOT NULL,
    FOREIGN KEY (id_marca) REFERENCES marca(id)
);

CREATE TABLE veiculo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_modelo INT NOT NULL,
    ano INT NOT NULL,
    cor VARCHAR(50),
    preco DECIMAL(10,2) NOT NULL,
    quilometragem INT,
    status ENUM('disponivel', 'vendido', 'reservado') DEFAULT 'disponivel',
    FOREIGN KEY (id_modelo) REFERENCES modelo(id)
);