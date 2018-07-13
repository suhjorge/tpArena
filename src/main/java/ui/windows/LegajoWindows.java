package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
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
	protected void addActions(Panel panelActions) {

		new Button(panelActions).setCaption("Buscar");
		// .onClick(this::registrarVenta);
	}

	@Override
	protected void createFormPanel(Panel form) {
		this.setTitle("Legajo");

		new Label(form).setText("Ingrese su legajo");
		new NumericField(form).setWidth(150);
	}
	//
	// public void registrarVenta() {
	// Dialog<?> dialog = new RegistrarVentaWindow(this);
	// dialog.open();
	// dialog.onAccept(() -> {});
	// }

}
