package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import ui.vm.NotasDelAlumnoViewModel;

public class NotasDelAlumnoWindow extends Dialog<NotasDelAlumnoViewModel> {


	public NotasDelAlumnoWindow(WindowOwner owner) {
		super(owner, new NotasDelAlumnoViewModel());
	}

	@Override
	public void createContents(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
	
		
	}


	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		
		

	}

	@Override
	protected void addActions(Panel actions) {

	}
}