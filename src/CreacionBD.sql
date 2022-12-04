DROP DATABASE IF EXISTS valoracionesBD;
CREATE DATABASE valoracionesBD;
USE valoracionesBD;

CREATE TABLE valoraciones
(
    id               INTEGER PRIMARY KEY,
    nombre           VARCHAR(100),
    fecha_fin        DATE    NOT NULL,
    nota_bandaSonora INTEGER NOT NULL,
    nota_visual      INTEGER NOT NULL,
    nota_trama       INTEGER NOT NULL,
    nota_media       INTEGER NOT NULL,
    detalles         VARCHAR(2000)
);

-- ejemplo

-- INSERT INTO valoracionesbd.valoraciones (id, , nombre, fecha_fin, nota_bandaSonora, nota_visual, nota_trama,
--                                          nota_media, detalles)
-- VALUES (1, 'ADSADS', 2000-01-01, 8.54, 5.23, 3.52, 2.82123,
--         'dghjkas ghj adghj fgdhajkfgdha jgfdh jkaghdjks fghjka gdsh aj');