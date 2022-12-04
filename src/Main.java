import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean fin = false;
        while (!fin) {
            System.out.println();
        }

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es el nombre del contenido audiovisual a valorar?");
        String nombre = teclado.next();
        System.out.println("¿En qué fecha acabaste de verlo? (Formato: año-mes-día)");
        System.out.println("Año: ");
        int ano = teclado.nextInt();
        System.out.println("Mes: ");
        int mes = teclado.nextInt();
        System.out.println("Dia: ");
        int dia = teclado.nextInt();
        FechaVisualizacion fechaFin = new FechaVisualizacion(ano, mes, dia);
    }
}