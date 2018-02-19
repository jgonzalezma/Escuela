package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AsignaturaModelo extends Conector {
	public ArrayList<Asignatura> selectAll(){
		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM asignaturas");
			
			while(rs.next()){
			Asignatura as = new Asignatura();
			as.setId(rs.getInt("id"));
			as.setNombre(rs.getString("nombre"));
			as.setHoras(rs.getInt("horas"));
			asignaturas.add(as);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return asignaturas;
		
	}
	public Asignatura matriculaId(int id){
		Asignatura as = new Asignatura();
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM asignaturas WHERE id=?");			
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				as.setId(rs.getInt("id"));
				as.setNombre(rs.getString("nombre"));
				as.setHoras(rs.getInt("horas"));
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return as;
	}
}
