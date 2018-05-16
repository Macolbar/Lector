package modelo;

import java.util.ArrayList;

public class Libro implements Legible{
	
	private String lectura;
	private int actual=0;//num pagina
	private int marca=0;//=
	private ArrayList<Pagina> paginas;
	
	public Libro(String lecturaz){
		super();
		this.lectura= lecturaz;
	}
	

	@Override
	public boolean avanzarPagina() {
		if(comprobarUltimaPagina()){
			this.actual=actual+1;
			return true;
		}else{
			return false;
		}
		
	}

	private boolean comprobarUltimaPagina() {
		
		if(paginas.get(actual)==paginas.get(paginas.size()-1)){
			return false;
		}else{
			return true;
		}
	}

//	private boolean cargarSiguientePagina() {//usar offset
//		Acceso acceso = new Acceso();
//		setLectura(acceso.lector(paginas.get(actual)));
//		
//		return true;
//	}

	@Override
	public boolean retrocederPagina() {
		if(comprobarPrimeraPagina()){
				actual--;
				return true;
		}else{
			return false;
		}
		
	}

//	private boolean cargarPaginaAnterior() {
//		
//		return false;
//	}


	private boolean comprobarPrimeraPagina() {
		if(this.paginas.get(actual)==this.paginas.get(0)){
			return false;
		}else{
			return true;
		}
	}
	
	public void irAultPag(){
		this.actual=this.paginas.size()-1;
		
	}
	
	public void irAprimPag(){
		this.actual=0;
	}


	@Override
	public void marcarPagina() {
		this.marca = this.actual;
		
	}

	@Override
	public void irAMarca() {
		this.actual = this.marca;
	}
	
	
	public String getLectura() {
		return lectura;
	}

	public void setLectura(String lectura) {
		this.lectura = lectura;
	}

	public int getActual() {
		return actual;
	}

	public void setActual(int actual) {
		this.actual = actual;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public ArrayList<Pagina> getPaginas() {
		return paginas;
	}

	public void setPaginas(ArrayList<Pagina> paginas) {
		this.paginas = paginas;
	}

}
