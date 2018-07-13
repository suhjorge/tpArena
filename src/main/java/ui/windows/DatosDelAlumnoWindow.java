package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import ui.vm.DatosDelAlumnoViewModel;


public class DatosDelAlumnoWindow extends Dialog<DatosDelAlumnoViewModel> {

	public DatosDelAlumnoWindow(WindowOwner owner) {
		super(owner, new DatosDelAlumnoViewModel());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		
	}

	@Override
	protected void addActions(Panel actions) {
		
	}
}
