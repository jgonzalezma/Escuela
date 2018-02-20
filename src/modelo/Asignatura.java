package modelo;

import java.util.ArrayList;

public class Asignatura {
	private int id;
	private String nombre;
	private int horas;
	//por la relacion
	private ArrayList<Matricula> matriculas;
	
	public void Asignatura(){
		
	}
	public void Asignatura(int id, String nombre, int horas){
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
}
