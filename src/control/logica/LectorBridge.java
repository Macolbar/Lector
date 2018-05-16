package control.logica;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JButton;

import control.acciones.AccionAlante;
import control.acciones.AccionAnadir;
import control.acciones.AccionAtras;
import control.acciones.AccionIraMarca;
import control.acciones.AccionLeer;
import control.acciones.AccionMarcar;
import control.acciones.AccionPrimera;
import control.acciones.AccionUltima;
import modelo.Libreria;
import modelo.Libro;
import modelo.Pagina;
import modelo.acceso.Acceso;
import vista.UI;

public class LectorBridge extends UI{
	
	Libreria libreria = new Libreria(this);
	Libro JdT = new Libro("JuegoTronos.txt");
	Libro libro = JdT;
	Acceso acceso = new Acceso();
	AccionAlante alante = new AccionAlante(this,libro);
	AccionAtras atras = new AccionAtras(this,libro);
	AccionMarcar marcar = new AccionMarcar(this,libro);
	AccionIraMarca irmarca = new AccionIraMarca(this,libro);
	AccionPrimera primera = new AccionPrimera(this, libro);
	AccionUltima ultima = new AccionUltima(this, libro);
//	AccionAnadir anadir = new AccionAnadir(libreria, this);
	
	
	public LectorBridge(){
		
		ArrayList<Pagina> paginas = acceso.crearPaginas();
		JdT.setPaginas(paginas);
		getTextArea().setText(acceso.lector(JdT.getPaginas().get(JdT.getActual()), JdT.getLectura()));
		libreria.anadirLibro(JdT/* panelDos, "Juego de Tronos - George R. R. Martin"*/ );
		
		System.out.println(libreria.getLibros().size());
		
		
		
		
		//btnAadir.addActionListener(anadir);
		btnSiguiente.addActionListener(alante);
		btnAnterior.addActionListener(atras);
		btnMarcar.addActionListener(marcar);
		btnIrAMarca.addActionListener(irmarca);
		btnPrimera.addActionListener(primera);
		btnUltima.addActionListener(ultima);
		
		
			
			
		
		
		
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	

}
