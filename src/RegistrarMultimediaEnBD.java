public class RegistrarMultimediaEnBD {
    private int id;
    private String nombre;
    private FechaVisualizacion fechaFin;
    private Valoracion valoracion;

    public RegistrarMultimediaEnBD(String nombre, FechaVisualizacion fechaFin, Valoracion valoracion) {
        this.nombre = nombre;
        this.fechaFin = fechaFin;
        this.valoracion = valoracion;
        this.id = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public String crearInsercion() {
        return "INSERT INTO " + "valoracionesbd.valoraciones " + "(id, nombre, fecha_fin, nota_bandaSonora, nota_visual, nota_trama, nota_media, detalles) " +
                "VALUES " + "(" + id + ", " + getNombre() + ", " + fechaFin.toString() + ", " + valoracion.getNotaBandaSonora() + ", " + valoracion.getNotaVisual() + ", " +
                valoracion.getNotaTrama() + ", " + valoracion.calcularNotaMedia() + ", " + valoracion.getDetalles() + ")";
    }
}