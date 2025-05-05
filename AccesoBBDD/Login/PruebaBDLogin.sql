DROP DATABASE IF EXISTS login;

CREATE DATABASE login;

USE login;

DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios(
	idUsu int PRIMARY KEY AUTO_INCREMENT,
    nomUsu VARCHAR (100) NOT NULL,
    passwd VARCHAR (100) NOT NULL
);

INSERT INTO login.usuarios (idUsu, nomUsu, passwd) VALUES (1, 'admin', 'admin');

/*
INSERT INTO 'contactos'.'contacto' ('DNI', 'NOMBRE', 'DIRECCION', 'POBLACION', 'CP', 'PROVINCIA', 'TELEFONO', 'MOVIL', 'EMAIL', 'FECHA_NAC', 'TIPO') VALUES ('08785691J', 'Mariano Dorado Serrano', 'C/ Fuencaliente, 1', 'Valencia', 46023, 'Valencia', '963564495', '630838922', 'mardorser@hotmail.com', '1962-12-30', 2);

INSERT INTO 'contactos'.'contacto' ('DNI', 'NOMBRE', 'DIRECCION', 'POBLACION', 'CP', 'PROVINCIA', 'TELEFONO', 'MOVIL', 'EMAIL', 'FECHA_NAC', 'TIPO') VALUES ('09856064N', 'Ana Rodríguez Alonso', 'Avda. Gregrio Gea, 59', 'Mislata', 46920, 'Valencia', '963591236', '640071296', 'anarodalo@hotmail.com', '2001-01-19', 1);
*/