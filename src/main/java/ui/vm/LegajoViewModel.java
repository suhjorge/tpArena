package ui.vm;

import org.uqbar.commons.utils.Observable;

import repository.AlumnoRepositorio;

@Observable
public class LegajoViewModel {

	public LegajoViewModel() {
		super();
		
	}
	
	AlumnoRepositorio repositorio = new AlumnoRepositorio();
	private int legajoInsertado;
	
	public boolean existeLegajo() {
		
		return repositorio.existeLegajo(legajoInsertado);
		
	}
	
	//getter - setter
	
	public int getLegajoInsertado() {
		return legajoInsertado;
	}
	

	public void setLegajoInsertado(int legajoInsertado) {
		this.legajoInsertado = legajoInsertado;
	}


}
