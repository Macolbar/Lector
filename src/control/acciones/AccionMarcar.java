package control.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.logica.LectorBridge;
import modelo.Libro;
import modelo.acceso.Acceso;

public class AccionMarcar implements ActionListener{
	
	LectorBridge paraUI;
	private Libro libro;
	Acceso acceso = new Acceso();
	
	public AccionMarcar(LectorBridge paraUI, Libro jdT) {
		super();
		this.paraUI = paraUI;
		this.libro = jdT;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		libro.marcarPagina();
		
	}

}
