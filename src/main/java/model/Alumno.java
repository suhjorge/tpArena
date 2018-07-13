package model;

import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class Alumno {

	private String nombre;
	private String apellido;
	private String cuentaGit;
	private int legajo;
	private List<Tarea> tareas;
	
	
	
	//getter - setter
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCuentaGit() {
		return cuentaGit;
	}
	public void setCuentaGit(String cuentaGit) {
		this.cuentaGit = cuentaGit;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public List<Tarea> getTareas() {
		return tareas;
	}
	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}
	
}
