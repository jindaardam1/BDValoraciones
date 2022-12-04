public class Valoracion {
    private double NotaBandaSonora;
    private double NotaVisual;
    private double NotaTrama;
    private double NotaMedia;
    private String detalles;
    private final double PONDERACIONBANDASONORA = 0.25;
    private final double PONDERACIONVISUAL = 0.35;
    private final double PONDERACIONTRAMA = 0.4;

    public Valoracion(double notaBandaSonora, double notaVisual, double notaTrama, String observaciones) {
        NotaBandaSonora = notaBandaSonora;
        NotaVisual = notaVisual;
        NotaTrama = notaTrama;
        NotaMedia = 0;
        this.detalles = observaciones;
    }

    public double getNotaBandaSonora() {
        return NotaBandaSonora;
    }

    public void setNotaBandaSonora(int notaBandaSonora) {
        NotaBandaSonora = notaBandaSonora;
    }

    public double getNotaVisual() {
        return NotaVisual;
    }

    public void setNotaVisual(int notaVisual) {
        NotaVisual = notaVisual;
    }

    public double getNotaTrama() {
        return NotaTrama;
    }

    public void setNotaTrama(int notaTrama) {
        NotaTrama = notaTrama;
    }

    public double getNotaMedia() {
        return NotaMedia;
    }

    public void setNotaMedia(int notaMedia) {
        NotaMedia = notaMedia;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double calcularNotaMedia() {
        return (getNotaBandaSonora() * PONDERACIONBANDASONORA) + (getNotaVisual() * PONDERACIONVISUAL) + (getNotaTrama() * PONDERACIONTRAMA);
    }

}