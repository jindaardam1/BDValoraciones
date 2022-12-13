import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean fin = false;
        int op, op2;
        while (!fin) {
            System.out.println("1 - Nueva entrada.\n2 - Crear string inserción manual.\n3 - Filtrar por...\n4 - Generar archivo XML con todos los datos guardados.\n5 - Ver todos lods datos guardados en el navegador.\n6 - Configuracion MySQL Worknech\n7 - Salir");
            op = teclado.nextInt();
            if(op == 1){
                RegistrarMultimediaEnBD insercion = new RegistrarMultimediaEnBD();
                insercion.obtenerDatoInsercion();
                Conector con = new Conector();
                con.getConnection();
                con.insertarEnBD(insercion.getNombre(), insercion.getFechaFin().toString(),
                        insercion.getValoracion().notaBandaSonoraString(), insercion.getValoracion().notaVisualString(),
                        insercion.getValoracion().notaTramaString(), insercion.getValoracion().notaMediaString(),
                        insercion.getValoracion().getDetalles());
            }
            else if (op == 2) {
                RegistrarMultimediaEnBD insercion = new RegistrarMultimediaEnBD();
                insercion.obtenerDatoInsercion();
                System.out.println(insercion.crearInsercion());
            }
            else if (op == 3) {
                boolean fin2 = false;
                while (!fin2) {
                    System.out.println("1 - Fecha\n2 - Nota de banda sonora\n3 - Nota de calidad visual" +
                                        "\n4 - Nota de trama\n5 - Nota media\n6 - Escribir consulta personalizada\n7 - Atrás");
                    op2 = teclado.nextInt();
                    if (op2 == 1) {
                        //TODO
                    }
                    else if (op2 == 2) {
                        //TODO
                    }
                    else if (op2 == 3) {
                        //TODO
                    }
                    else if (op2 == 4) {
                        //TODO
                    }
                    else if (op2 == 5) {
                        //TODO
                    }
                    else if (op2 == 6) {
                        //TODO
                    }
                    else if (op2 == 7) {
                        fin2 = true;
                    }
                }
            }
            else if (op == 4) {
                //TODO
            }
            else if (op == 5) {
                //TODO
            }
            else if (op == 6) {
                System.out.println(RegistrarMultimediaEnBD.devolveConfiguracionWorkbench());
            }
            else if (op == 7) {
                fin = true;
            }
            else {
                System.out.println("Introduce un valor válido.");
            }
        }
    }
}