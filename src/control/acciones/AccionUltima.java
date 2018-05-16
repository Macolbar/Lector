package control.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.logica.LectorBridge;
import modelo.Libro;
import modelo.acceso.Acceso;

public class AccionUltima implements ActionListener{
	
	LectorBridge paraUI;
	private Libro libro;
	Acceso acceso = new Acceso();
	
	public AccionUltima(LectorBridge paraUI, Libro jdT) {
		super();
		this.paraUI = paraUI;
		this.libro = jdT;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		libro.irAultPag();
		paraUI.getTextArea().setText(acceso.lector(libro.getPaginas().get(libro.getActual()), libro.getLectura()));
		paraUI.getLblNumeroPagina().setText(String.valueOf(libro.getActual()));
		
	}
	
}