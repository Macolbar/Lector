package modelo;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import control.acciones.AccionLeer;
import control.logica.LectorBridge;

public class Libreria {
	LectorBridge paraUI;
	AccionLeer leer = new AccionLeer(paraUI,this);
	ArrayList<Libro> libros = new ArrayList<Libro>(7);
	ArrayList<JButton> botonera = new ArrayList<JButton>(7);
	
	public Libreria(LectorBridge paraUI) {
		super();
		this.paraUI = paraUI;
	}

	//crea JPanels cuando se va a añadir un libro, de momento no
	public void anadirLibro(Libro libro /*JPanel panel, String nombreAutor*/){//enlazar con botones
		if(libros.size()<7&&libroExiste(libro)){
		this.libros.add(libro);
		
//		JButton boton = new JButton(nombreAutor+" "+(libros.size()-1));
//		boton.setBounds(0, 28*(libros.size()-1), 266, 28);
//		boton.addActionListener(leer);
//		panel.add(boton);
//		botonera.add(boton);
//		
		
		}else{
			JOptionPane.showConfirmDialog(null, "No puedes introducir ese libro");
		}
	}
	
	private boolean libroExiste(Libro libro) {
		File ruta = new File(libro.getLectura());
		if(ruta.exists()){
			return true;
		}else{
			return false;
		}
		
	}

	public void quitarLibro(Libro libro/*, JPanel panel*/){//le quedan cosas
		if(!libros.isEmpty()){
		libros.remove(libro);
		}
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}
	
	public Libro getLibro(int index){
		return this.libros.get(index);
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public ArrayList<JButton> getBotonera() {
		return botonera;
	}

	public void setBotonera(ArrayList<JButton> botonera) {
		this.botonera = botonera;
	}

	
	
}
