package control.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.logica.LectorBridge;
import modelo.Libreria;
import modelo.acceso.Acceso;

public class AccionLeer implements ActionListener{

	LectorBridge paraUI;
	Libreria libreria;
	Acceso acceso = new Acceso();
	
	
	
	public AccionLeer(LectorBridge paraUI, Libreria libreria) {
		super();
		this.paraUI = paraUI;
		this.libreria = libreria;
	}




	@Override
	public void actionPerformed(ActionEvent e) {//vvcdsdvcpav
		
		for (int i = 0; i < libreria.getLibros().size(); i++) {
			if(e.getActionCommand().endsWith(String.valueOf(i))){//aqui cogemos un boton libreria.getBotonera().get(i).getLabel())
				paraUI.setLibro(libreria.getLibros().get(i));//y aqui un libro libreria.getLibros().get(i)
				//paraUI.getTextArea().setText(acceso.lector(libreria.getLibro(i).getPaginas().get(1)));
				paraUI.getTextArea().setText(acceso.lector(libreria.getLibro(0).getPaginas().get(1), libreria.getLibro(i).getLectura()));
			}
		}
		
		
	}

}
