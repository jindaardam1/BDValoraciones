public class FechaVisualizacion {
    private int ano;
    private int mes;
    private int dia;

    public FechaVisualizacion(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public FechaVisualizacion() {
        this.ano = 0;
        this.mes = 0;
        this.dia = 0;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return ano + "-" +
                mes + "-" +
                dia;
    }
}