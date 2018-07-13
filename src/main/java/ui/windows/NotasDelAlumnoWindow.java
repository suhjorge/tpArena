package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import ui.vm.NotasDelAlumnoViewModel;
import model.Nota;
public class NotasDelAlumnoWindow extends Dialog<NotasDelAlumnoViewModel> {


	public NotasDelAlumnoWindow(WindowOwner owner) {
		super(owner, new NotasDelAlumnoViewModel());
	}

	@Override
	public void createContents(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		this.setTitle("Estado alumno");
		
		Table tableNotas = new Table<>(form, Nota.class);
		Column<Nota> columnaMateria = new Column<Nota>(tableNotas);
		columnaMateria.setTitle("Materia");
		
		Column<Nota> columnaNota = new Column<Nota>(tableNotas);
		columnaNota.setTitle("Nota Actual");
		
		Column<Nota> columnaAprobo = new Column<Nota>(tableNotas);
		columnaAprobo.setTitle("Estado");
		
		tableNotas.setHeight(300);
		tableNotas.setWidth(600);
		
	}


	@Override
	protected void createFormPanel(Panel mainPanel) {
	}

	@Override
	protected void addActions(Panel actions) {

	}
}