package model;

public class Nota {
	static TipoNota tipo;
	String nota;
	
	public Nota(TipoNota tipo, String nota) {
		this.tipo = tipo;
		this.nota = nota;
	}
	
	public TipoNota getTipoNota() {
		return tipo;
	}
	
	public static boolean aprobada(String nota) {
		if(tipo == TipoNota.NUMERICA) {
			return Integer.parseInt(nota) >= 6;
		}
		return nota!="M";
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public void setTipo(TipoNota tipo) {
		this.tipo = tipo;
	}
}

