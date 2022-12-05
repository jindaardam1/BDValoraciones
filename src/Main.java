import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean fin = false;
        int op;
        while (!fin) {
            System.out.println("1 - Nueva entrada.\n2 - Crear string inserción manual.\n3 - Generar archivo XML con todos los datos guardados.\n" +
                                "4 - Ver todos lods datos guardados en el navegador.\n5 - Configuracion MySQL Worknech\n6 - Salir");
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
                //TODO
            }
            else if (op == 4) {
                //TODO
            }
            else if (op == 5) {
                System.out.println(RegistrarMultimediaEnBD.devolveConfiguracionWorkbench());
            }
            else if (op == 6) {
                fin = true;
            }
            else {
                System.out.println("Introduce un valor válido.");
            }
        }
    }
}