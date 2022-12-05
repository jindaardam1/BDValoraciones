DROP DATABASE IF EXISTS valoracionesBD;
CREATE DATABASE valoracionesBD;
USE valoracionesBD;

CREATE TABLE valoraciones
(
    id               INTEGER PRIMARY KEY AUTO_INCREMENT,
    nombre           VARCHAR(100) NOT NULL,
    fecha_fin        DATE NOT NULL,
    nota_bandaSonora DOUBLE NOT NULL,
    nota_visual      DOUBLE NOT NULL,
    nota_trama       DOUBLE NOT NULL,
    nota_media       DOUBLE NOT NULL,
    detalles         VARCHAR(2000)
);

USE valoracionesbd;
DROP PROCEDURE IF EXISTS inserta;
DELIMITER $$
CREATE PROCEDURE inserta(nom VARCHAR(100), fe_fi DATE, no_ba_so DOUBLE,
                         no_vi DOUBLE, no_tra DOUBLE, no_med DOUBLE, det VARCHAR(2000))
BEGIN
INSERT INTO valoracionesbd.valoraciones (nombre, fecha_fin, nota_bandaSonora, nota_visual, nota_trama, nota_media, detalles)
VALUES (nom, fe_fi, no_ba_so, no_vi, no_tra, no_med, det);
END
$$
DELIMITER ;