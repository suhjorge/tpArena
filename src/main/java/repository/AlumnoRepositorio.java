package repository;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.utils.Observable;

import model.Alumno;

@Observable
public class AlumnoRepositorio {
	
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	public AlumnoRepositorio() {
		Alumno alumno1 = new Alumno("Osqui","Cubas", "of.cubas",1413478);
		Alumno alumno2 = new Alumno("Kevin","Gioffre", "godOfWar",1400000);
		Alumno alumno3 = new Alumno("Gabriel","Lourenco", "gabriell24",1529912);
		Alumno alumno4 = new Alumno("Jorge","Suh", "suhjorge",1414460);
		
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
		alumnos.add(alumno4);
	}
	
	
	public boolean existeLegajo(int legajo) {
		return getAlumnos().stream().anyMatch(a->a.getLegajo() == legajo);
	}
	
	public Alumno getAlumno(int legajo) {
		
		return alumnos.stream().filter(a->a.getLegajo() == legajo).findFirst().get();
	}
	//getter - setter
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
}
