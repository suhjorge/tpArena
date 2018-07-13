package model;

public enum Nota {
	NUMERICA {
		int nota;
		public boolean estaAprobada(int nota) {
			return nota>6;
		}
	},
	CONCEPTUAL{
		String nota;
		public boolean estaAprobada(String nota) {
			return nota!="M";
		}
	};

}

