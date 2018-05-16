package control.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.logica.LectorBridge;
import modelo.Libro;
import modelo.acceso.Acceso;

public class AccionIraMarca implements ActionListener{
	
	LectorBridge paraUI;
	private Libro libro;
	Acceso acceso = new Acceso();
	
	public AccionIraMarca(LectorBridge paraUI, Libro jdT) {
		super();
		this.paraUI = paraUI;
		this.libro = jdT;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		libro.irAMarca();
		paraUI.getTextArea().setText(acceso.lector(libro.getPaginas().get(libro.getActual()), libro.getLectura()));
		paraUI.getLblNumeroPagina().setText(String.valueOf(libro.getActual()));
		
	}

}
