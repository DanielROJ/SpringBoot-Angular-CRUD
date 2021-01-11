
DROP TABLE IF EXISTS ubicacion;
DROP TABLE IF EXISTS persona;


CREATE TABLE persona (
  idPersona INT AUTO_INCREMENT  PRIMARY KEY,
  nombre VARCHAR(250) NOT NULL,
  edad VARCHAR(250) NOT NULL,
  identificacion VARCHAR(250) not  NULL
);


CREATE TABLE ubicacion (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  longitud VARCHAR(250) NOT NULL,
  latitud VARCHAR(250) NOT NULL,
  hora_registro time not null,
  id_persona INT not null,
  foreign key(id_persona) references persona(idPersona)
);



