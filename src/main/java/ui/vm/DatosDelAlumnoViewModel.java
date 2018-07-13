package ui.vm;

import model.Alumno;
import repository.AlumnoRepositorio;

public class DatosDelAlumnoViewModel {

	public DatosDelAlumnoViewModel() {
		super();
	}

	private int legajoInsertado;
	private Alumno alumno;

	AlumnoRepositorio repositorio = new AlumnoRepositorio();

	public void cargarDatos() {

		alumno = repositorio.getAlumno(legajoInsertado);
		}

	// getter - setter
	
	public Alumno getAlumno() {
		return alumno;
	}
	
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public int getLegajoInsertado() {
		return legajoInsertado;
	}

	public void setLegajoInsertado(int legajoInsertado) {
		this.legajoInsertado = legajoInsertado;
	}

}
