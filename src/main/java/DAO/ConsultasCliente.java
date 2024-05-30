import DAO.ConexionDAO;
import Models.Reporte;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ESuy
 */
public class ConsultasCliente {

    ConexionDAO con = new ConexionDAO();

    public void insertarReporte(Reporte reporte) throws Exception {
        String query = "INSERT INTO reporte (id_reporte, autor_id, usuario_asignado_id, descripcion, imagen, fecha_creacion, fecha_cierre, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.conexionMysql().prepareStatement(query);

            ps.setLong(1, reporte.getId_reporte()); // Asumiendo que este es de tipo Long
            ps.setString(2, reporte.getAutor_id().toString()); // Conversión explícita de Long a String
            ps.setString(3, reporte.getUsuario_asignado_id().toString()); // Conversión explícita de Long a String
            ps.setString(4, reporte.getDescripcion());
            ps.setString(5, reporte.getImagen())
            ps.setString(6, reporte.getFecha_creacion());
            ps.setString(7, reporte.getFecha_cierre());
            ps.setString(8, reporte.getEstado_reporte());

            ps.executeUpdate();
            System.out.println("Reporte insertado exitosamente");
        } catch (Exception e) {
            System.out.println("Error al insertar Reporte: " + query);
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.conexionMysql().close();
                    System.out.println("Cierre de conexion exitosa");
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexion");
                }
            }
        }
    }
}
