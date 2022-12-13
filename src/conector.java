import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Conector {
    private String database_name = "valoracionesBD";
    private String user = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3307/" + database_name;
    Connection conn = null;

    public Connection getConnection() {
        try{
            //Obtener valor del driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Obtener la conexión
            conn = DriverManager.getConnection(url, user, password);
        }catch (ClassNotFoundException e) {
            System.err.println("Ha ocurrido un ClassNotFoundException " + e.getMessage());
        }catch (SQLException e) {
            System.err.println("Ha ocurrido un SQLException " + e.getMessage());
        }
        return conn;
    }

    public void insertarEnBD(String nombre, String fechaFin, String notaBandaSonora, String notaVisual, String notaTrama, String notaMedia, String detalles) {
        try {
            Connection con = getConnection();
            CallableStatement proc = con.prepareCall(" CALL inserta(?,?,?,?,?,?,?)");
            proc.setString(1, nombre);
            proc.setString(2, fechaFin);
            proc.setString(3, notaBandaSonora);
            proc.setString(4, notaVisual);
            proc.setString(5, notaTrama);
            proc.setString(6, notaMedia);
            proc.setString(7, detalles);
            proc.execute();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void rellenarTablaDatosMySQL() {
        String consulta = "SELECT * FROM valoraciones;";
        Statement st;
        Conector con = new Conector();
        con.getConnection();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("nombre");
        model.addColumn("fecha_fin");
        model.addColumn("nota_bandaSonora");
        model.addColumn("nota_visual");
        model.addColumn("nota_trama");
        model.addColumn("nota_meida");
        model.addColumn("detalles");



    }
}
