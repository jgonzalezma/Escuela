package modelo;

import java.util.Date;

public class Matricula {
	private Alumno alumno; //int id_alumnos;
	private Asignatura asignatura; //id_asignaturas;
	private Date fecha;
	
	public void Matricula(){
		
	}
	
	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
