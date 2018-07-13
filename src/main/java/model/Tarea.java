package model;

import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class Tarea {

	private String tipo;
	private List<Nota> notas;
	
	//getters - setters

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
}
