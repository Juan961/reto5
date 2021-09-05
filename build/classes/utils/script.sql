DROP SCHEMA IF EXISTS EJEMPLORETO5;
CREATE SCHEMA EJEMPLORETO5;

USE EJEMPLORETO5;

CREATE TABLE USUARIO(
    idUsuario INT NOT NULL AUTO_INCREMENT,
    nombreUsuario VARCHAR(70) NOT NULL,
    emailUsuario VARCHAR(70) NOT NULL UNIQUE,
    contraseñaUsuario VARCHAR(40) NOT NULL,
    directorUsuario BOOLEAN NOT NULL,
    shareEmailUsuario BOOLEAN NULL DEFAULT(true),

    PRIMARY KEY(idUsuario)

);

CREATE TABLE CONTENIDO(
    idContenido INT NOT NULL AUTO_INCREMENT,
    tituloContenido VARCHAR(70) NOT NULL,
    descripcionContenido VARCHAR(1000) NOT NULL,
    categoriaContenido ENUM("Ciencia ficcion","Terror","Accion","Realista","Aventura","Comedia","Otro") NOT NULL,
    produccionContenido ENUM("Serie","Pelicula","Cortometraje","Largometraje","Blog","Libro","Otro") NOT NULL,
    
    usuario_idUsuario INT NOT NULL,

    PRIMARY KEY (idContenido),
    FOREIGN KEY (usuario_idUsuario) REFERENCES USUARIO(idUsuario)
    
);

CREATE TABLE RESEÑA(
    idReseña INT NOT NULL AUTO_INCREMENT,
    calificacionReseña FLOAT NOT NULL,
    contenidoReseña VARCHAR(200) NOT NULL,
    
    contenido_idContenido INT NOT NULL,
    usuario_idUsuario INT NOT NULL,

    PRIMARY KEY (idReseña),
    FOREIGN KEY (contenido_idContenido) REFERENCES CONTENIDO(idContenido),
    FOREIGN KEY (usuario_idUsuario) REFERENCES USUARIO(idUsuario)

);


INSERT INTO USUARIO(nombreUsuario, emailUsuario, contraseñaUsuario, directorUsuario) VALUES ("Felipe", "felipe@gmail.com", "12345", true);
INSERT INTO USUARIO(nombreUsuario, emailUsuario, contraseñaUsuario, directorUsuario) VALUES ("Daniel", "daniel@gmail.com", "54321", true);

INSERT INTO CONTENIDO (tituloContenido, descripcionContenido, categoriaContenido, produccionContenido, usuario_idUsuario) VALUES ("Titanic", "Una joven de la alta sociedad abandona a su arrogante pretendiente por un artista humilde en el trasatlántico que se hundió durante su viaje inaugural.", "Aventura", "Pelicula", 1);
INSERT INTO CONTENIDO (tituloContenido, descripcionContenido, categoriaContenido, produccionContenido, usuario_idUsuario) VALUES ("Cronica de una muerte anunciada", "na novela del escritor colombiano Gabriel García Márquez, publicada por primera vez en 1981", "Otro", "Libro", 1);
INSERT INTO CONTENIDO (tituloContenido, descripcionContenido, categoriaContenido, produccionContenido, usuario_idUsuario) VALUES ("La casa de papel", "Una banda organizada de ladrones se propone cometer el atraco del siglo en la Fábrica Nacional de Moneda y Timbre", "Accion", "Serie", 2);
INSERT INTO CONTENIDO (tituloContenido, descripcionContenido, categoriaContenido, produccionContenido, usuario_idUsuario) VALUES ("Hamlet", "La tragedia de Hamlet, príncipe de Dinamarca, o simplemente Hamlet, es una tragedia del dramaturgo inglés William Shakespeare", "Otro", "Otro", 2);

INSERT INTO reseña (calificacionReseña, contenidoReseña, contenido_idContenido, usuario_idUsuario) VALUES (4.0, "Un filme bien trabajado que narra una historia de amor dentro de una de las más grandes catástrofes del transporte marítimo", 1, 2);
INSERT INTO reseña (calificacionReseña, contenidoReseña, contenido_idContenido, usuario_idUsuario) VALUES (5.0, "Me lo recomendaron, no lo leí ni siquiera hice el intento de comprarlo, asi que la persona que me lo habia recomendadodo me lo regaló y sin duda yo estaba muy equivicado en mi apreciacion", 2, 2);
INSERT INTO reseña (calificacionReseña, contenidoReseña, contenido_idContenido, usuario_idUsuario) VALUES (4.0, "Pero este espectáculo está formado por los atracadores que son profesionales en atracos", 3, 1);
INSERT INTO reseña (calificacionReseña, contenidoReseña, contenido_idContenido, usuario_idUsuario) VALUES (5.0, "Se nota el esfuerzo en algo hecho hace 400 años pero en esta era digamos que no es mucho. La verdad no me gustó", 4, 1);