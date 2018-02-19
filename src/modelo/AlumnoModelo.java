package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AlumnoModelo extends Conector {
	public ArrayList<Alumno> selectAll(){
		//crear arraylist
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		//ejecutar consulta
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM alumnos");
			
			//recorrer el resultset y rellenar el arraylist
			while(rs.next()){
				Alumno al = new Alumno();
				al.setId(rs.getInt("id"));
				al.setDni(rs.getString("dni"));
				al.setNombre(rs.getString("nombre"));
				al.setEmail(rs.getString("email"));
				//añadir alumno a lista
				alumnos.add(al);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return alumnos;
		
	}
	public Alumno matriculaId(int id){
		Alumno al = new Alumno();
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM alumnos WHERE id=?");			
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				al.setId(rs.getInt("id"));
				al.setDni(rs.getString("dni"));
				al.setNombre(rs.getString("nombre"));
				al.setEmail(rs.getString("email"));
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
}	
