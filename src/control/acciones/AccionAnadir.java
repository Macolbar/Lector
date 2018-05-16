package control.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import control.logica.LectorBridge;
import modelo.Libreria;
import modelo.Libro;
import modelo.Pagina;
import modelo.acceso.Acceso;

public class AccionAnadir implements ActionListener{
	
	Libreria libreria;
	LectorBridge paraUI;
	Acceso acceso = new Acceso();
	
	public AccionAnadir(Libreria libreria, LectorBridge paraUI) {
		super();
		this.libreria = libreria;
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String ruta= JOptionPane.showInputDialog("Introduce la ruta del libro");
		Libro libro = new Libro(ruta);
		String nombreAutor= JOptionPane.showInputDialog("Introduce el nombre del libro - Autor");
		ArrayList<Pagina> paginas = acceso.crearPaginas();
		libro.setPaginas(paginas);
		//libreria.anadirLibro(libro ,paraUI.getPanelDos() ,nombreAutor);
		
	
		
		
		
	}

}
