package control.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import control.logica.LectorBridge;
import modelo.Libro;
import modelo.acceso.Acceso;

public class AccionAlante implements ActionListener{
	
	LectorBridge paraUI;
	private Libro libro;
	Acceso acceso = new Acceso();
	
	public AccionAlante(LectorBridge paraUI, Libro jdT) {
		super();
		this.paraUI = paraUI;
		this.libro = jdT;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(libro.avanzarPagina()){
		//libro.setActual(libro.getActual()+1);
		paraUI.getLblNumeroPagina().setText(String.valueOf(libro.getActual()));
		paraUI.getTextArea().setText(acceso.lector(libro.getPaginas().get(libro.getActual()), libro.getLectura()));
		}
		
	}

}
