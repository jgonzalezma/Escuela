package vista;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Alumno;
import modelo.AlumnoModelo;
import modelo.AsignaturaModelo;

public class MatriculaVista extends Alumno {

	public void menuEscuela() {
		final int ALUMNOS = 1;
		final int ASIGNATURAS = 2;
		final int SALIR = 0;
		
		int opcion;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("---MENU---");
			System.out.println(ALUMNOS + "- Alumnos");
			System.out.println(ASIGNATURAS + "- Asignaturas");
			System.out.println(SALIR + "- Salir");
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case ALUMNOS:
				AlumnoModelo am = new AlumnoModelo();
				am.matriculaId(getId());
				break;
				
			case ASIGNATURAS:
				AsignaturaModelo asm = new AsignaturaModelo();
				asm.matriculaId(getId());
				break;
				
			case SALIR:
					System.out.println("Saliendo...");

				break;
			default:
				System.out.println("Opcion mal");
				break;
			}
		} while (opcion != SALIR);
	}

}
