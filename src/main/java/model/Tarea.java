package model;

import java.util.List;
import java.util.Optional;

import org.uqbar.commons.utils.Observable;

@Observable
public class Tarea {

	private TipoTarea tipo;
	private List<Nota> notas;
	
	public Tarea(TipoTarea tipo, List<Nota> notas) {
		this.tipo = tipo;
		this.notas = notas;
	}
	
	//getters - setters

	public TipoTarea getTipo() {
		return tipo;
	}

	public void setTipo(TipoTarea tipo) {
		this.tipo = tipo;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	public Nota getNotaActual() {
		return notas.stream().reduce((primerNota, otraNota) -> otraNota);
	}
	
	public boolean tareaAprobada() {
		return Nota.aprobada(this.getNotaActual());
	}
	
}
