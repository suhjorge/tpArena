package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;

import ui.vm.LegajoViewModel;

public class LegajoWindows extends SimpleWindow<LegajoViewModel> {

	public LegajoWindows(WindowOwner parent) {
		super(parent, new LegajoViewModel());
	}

	@Override
	public void createContents(Panel form) {
		this.setTitle("Legajo");

		new Label(form).setText("Ingrese su legajo");
		NumericField campoLegajo = new NumericField(form);
		campoLegajo.setWidth(150);
		campoLegajo.bindValueToProperty("legajoInsertado");
		new Button(form).setCaption("Buscar").onClick(this::datosDelAlumno);
		
	}
	@Override
	protected void addActions(Panel panelActions) {
	}

	@Override
	protected void createFormPanel(Panel arg0) {
		// TODO Auto-generated method stub

	}
	public void datosDelAlumno() {
		
		if(this.getModelObject().existeLegajo()) {
		Dialog<?> dialog = new DatosDelAlumnoWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}
		else {
			
		}
	}

}
