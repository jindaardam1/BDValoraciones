import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean fin = false;
        int op;
        while (!fin) {
            System.out.println("1 - Nueva entrada.\n2 - Generar archivo XML con todos los datos guardados.\n" +
                                "3 - Ver todos lods datos guardados en el navegador.\n4 - Salir");
            op = teclado.nextInt();
            if(op == 1){
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
                System.out.println("Valoraciones: (Ponderación - Banda Sonora 25% - Calidad visual 35% - Trama 40%)\n¿Qué nota le pondrías a la banda sonora?");
                double bs = teclado.nextDouble();
                System.out.println("Qué nota le pondrías a la calidad visual?");
                double vis = teclado.nextDouble();
                System.out.println("Qué nota le pondrías a la trama?");
                double tr = teclado.nextDouble();
                System.out.println("¿Queres añadir algo más? (máximo 2000 caracteres)");
                String det = teclado.next();
                Valoracion valoracion = new Valoracion(bs, vis, tr, det);
                RegistrarMultimediaEnBD registro = new RegistrarMultimediaEnBD(nombre, fechaFin, valoracion);
                String insercion = registro.crearInsercion();
            } else if (op == 2) {
                //TODO
            } else if (op == 3) {
                //TODO
            } else if (op == 4) {
                fin = true;
            }
            else {
                System.out.println("Introduce un valor válido.");
            }
        }
    }
}