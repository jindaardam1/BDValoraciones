import java.util.Scanner;

import static java.lang.System.*;

public class RegistrarMultimediaEnBD {
    private String nombre;
    private final FechaVisualizacion fechaFin;
    private final Valoracion valoracion;

    public RegistrarMultimediaEnBD() {
        nombre = "";
        fechaFin = new FechaVisualizacion();
        valoracion = new Valoracion();
    }

    public String getNombre() {
        return nombre;
    }

    public FechaVisualizacion getFechaFin() {
        return fechaFin;
    }

    public Valoracion getValoracion() {
        return valoracion;
    }

    public String crearInsercion() {
        return "INSERT INTO " + "valoracionesbd.valoraciones " + "(nombre, fecha_fin, nota_bandaSonora, nota_visual, nota_trama, nota_media, detalles) " +
                "VALUES " + "('" + getNombre() + "', " + fechaFin.toString() + ", " + valoracion.getNotaBandaSonora() + ", " + valoracion.getNotaVisual() + ", " +
                valoracion.getNotaTrama() + ", " + valoracion.calcularNotaMedia() + ", '" + valoracion.getDetalles() + "')";
    }

    public void obtenerDatoInsercion() {
        Scanner teclado = new Scanner(in);
        out.println("¿Cuál es el nombre del contenido audiovisual a valorar?");
        nombre = teclado.nextLine();
        out.println("¿En qué fecha acabaste de verlo? (Formato: aaaa-mm-dd)");
        out.println("Año: ");
        fechaFin.setAno(teclado.nextInt());
        out.println("Mes: ");
        fechaFin.setMes(teclado.nextInt());
        out.println("Dia: ");
        fechaFin.setDia(teclado.nextInt());
        out.println("Valoraciones: (Ponderación - Banda Sonora 25% - Calidad visual 35% - Trama 40%)\n¿Qué nota le pondrías a la banda sonora?");
        valoracion.setNotaBandaSonora(teclado.nextDouble());
        out.println("¿Qué nota le pondrías a la calidad visual?");
        valoracion.setNotaVisual(teclado.nextDouble());
        out.println("¿Qué nota le pondrías a la trama?");
        valoracion.setNotaTrama(teclado.nextDouble());
        out.println("¿Quieres añadir algo más? (máximo 2000 caracteres)");
        teclado.next();
        valoracion.setDetalles(teclado.nextLine());
    }

    public static String devolveConfiguracionWorkbench() {
        return "DROP DATABASE IF EXISTS valoracionesBD;\n" +
                "CREATE DATABASE valoracionesBD;\n" +
                "USE valoracionesBD;\n" +
                "\n" +
                "CREATE TABLE valoraciones\n" +
                "(\n" +
                "    id               INTEGER PRIMARY KEY AUTO_INCREMENT,\n" +
                "    nombre           VARCHAR(100) NOT NULL,\n" +
                "    fecha_fin        DATE NOT NULL,\n" +
                "    nota_bandaSonora DOUBLE NOT NULL,\n" +
                "    nota_visual      DOUBLE NOT NULL,\n" +
                "    nota_trama       DOUBLE NOT NULL,\n" +
                "    nota_media       DOUBLE NOT NULL,\n" +
                "    detalles         VARCHAR(2000)\n" +
                ");\n" +
                "\n" +
                "\n" +
                "USE valoracionesbd;\n" +
                "DROP PROCEDURE IF EXISTS inserta;\n" +
                "DELIMITER $$\n" +
                "CREATE PROCEDURE inserta(nom VARCHAR(100), fe_fi DATE, no_ba_so DOUBLE,\n" +
                "                         no_vi DOUBLE, no_tra DOUBLE, no_med DOUBLE, det VARCHAR(2000))\n" +
                "BEGIN\n" +
                "INSERT INTO valoracionesbd.valoraciones (nombre, fecha_fin, nota_bandaSonora, nota_visual, nota_trama, nota_media, detalles)\n" +
                "VALUES (nom, fe_fi, no_ba_so, no_vi, no_tra, no_med, det);\n" +
                "END\n" +
                "$$\n" +
                "DELIMITER ;";
    }
}