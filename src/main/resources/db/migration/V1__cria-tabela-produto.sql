use beerdb;

CREATE TABLE produto(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    ibu NUMERIC,
    preco NUMERIC(20,2)
);