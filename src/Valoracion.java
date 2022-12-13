public class Valoracion {
    private double NotaBandaSonora;
    private double NotaVisual;
    private double NotaTrama;
    private double NotaMedia;
    private String detalles;
    private final double PONDERACIONBANDASONORA = 0.25;
    private final double PONDERACIONVISUAL = 0.35;
    private final double PONDERACIONTRAMA = 0.4;

    public Valoracion() {
        NotaBandaSonora = 0.0;
        NotaVisual = 0.0;
        NotaTrama = 0.0;
        NotaMedia = 0.0;
        detalles = "";
    }

    public double getNotaBandaSonora() {
        return NotaBandaSonora;
    }

    public void setNotaBandaSonora(double notaBandaSonora) {
        NotaBandaSonora = notaBandaSonora;
    }

    public double getNotaVisual() {
        return NotaVisual;
    }

    public void setNotaVisual(double notaVisual) {
        NotaVisual = notaVisual;
    }

    public double getNotaTrama() {
        return NotaTrama;
    }

    public void setNotaTrama(double notaTrama) {
        NotaTrama = notaTrama;
    }

    public double getNotaMedia() {
        return NotaMedia;
    }

    public void setNotaMedia(double notaMedia) {
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

    public String notaBandaSonoraString() {
        String str = "";
        str += getNotaBandaSonora();
        return str;
    }
    public String notaVisualString() {
        String str = "";
        str += getNotaVisual();
        return str;
    }
    public String notaTramaString() {
        String str = "";
        str += getNotaTrama();
        return str;
    }
    public String notaMediaString() {
        String str = "";
        str += calcularNotaMedia();
        return str;
    }

}