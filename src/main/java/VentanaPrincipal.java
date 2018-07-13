import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import ui.windows.LegajoWindows;

//import model.Fixture;
//import ui.windows.ListadoVentasWindow;

public class VentanaPrincipal extends Application{

	public static void main(String[] args) {
//		Fixture.initialize();
		new VentanaPrincipal().start();
	}
	
	@Override
	protected Window<?> createMainWindow() {
		return new LegajoWindows(this);
	}
}