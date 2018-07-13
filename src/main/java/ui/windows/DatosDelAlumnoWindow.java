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

	public WindowOwner padre;
	
	public DatosDelAlumnoWindow(WindowOwner owner) {
		super(owner, new DatosDelAlumnoViewModel());
		padre = owner;
		this.getModelObject().setLegajoInsertado(((LegajoWindows) padre).getModelObject().getLegajoInsertado());
		this.getModelObject().cargarDatos();
	}
	
	@Override
	public void createContents(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		form.setLayout(new ColumnLayout(2));
		
		new Label(form).setText("Nombre:");
		new Label(form).bindValueToProperty("alumno.nombre");
		
		new Label(form).setText("Apellido:");
		new Label(form).bindValueToProperty("alumno.apellido");
		
		new Label(form).setText("Cuenta Git:");
		new Label(form).bindValueToProperty("alumno.cuentaGit");
		
		new Label(form).setText("Legajo:");
		new Label(form).bindValueToProperty("alumno.legajo");
		
		new Button(form).setCaption("Notas");
		new Button(form).setCaption("Modificar datos");
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		
	}

	@Override
	protected void addActions(Panel actions) {
		
	}
}
