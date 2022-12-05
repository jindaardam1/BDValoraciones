public class FechaVisualizacion {
    private int ano;
    private int mes;
    private int dia;

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

    public String toString() {
        return this.getAno() + "-" +
                this.getMes() + "-" +
                this.getDia();
    }
}