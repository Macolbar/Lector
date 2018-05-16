package modelo.acceso;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Libreria;
import modelo.Libro;
import modelo.Pagina;

public class Acceso {
	
	
	
	public static String lectorDos(Pagina pagine, String ruta){
		
		FileReader flujo = null;
		BufferedReader buffer = null;
		File file = new File(ruta);
		String pagina = "";
		if (file.exists()) {
			try {
				flujo = new FileReader(file);
				buffer = new BufferedReader(flujo);
				String linea = buffer.readLine();
				int tamano=1;
				while(linea!=null){
					linea=buffer.readLine();
					tamano++;
					
					if(tamano>pagine.getPrimer() && tamano <pagine.getUltimo()){
						pagina = pagina+linea+"\n";
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return pagina;
	}
	
	public String lector(Pagina pagine, String ruta){
		FileReader flujo = null;
		BufferedReader buffer = null;
		File file = new File("JuegoTronos.txt");
		String pagina = "";
		if (file.exists()) {
		try {
			flujo = new FileReader(file);
				buffer = new BufferedReader(flujo);
				String linea = buffer.readLine();
				int tamano=1;
				while(linea!=null){
					linea=buffer.readLine();
					tamano++;
					
					if(tamano>pagine.getPrimer() && tamano <pagine.getUltimo()){
						pagina = pagina+linea+"\n";
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return pagina;
	}
	
	
//	public Libro accesoLibro(String label, Libreria libreria){
//		String[] partes = label.split("-");
//		String num = partes[1];
//		return libreria.getLibros().get(Integer.valueOf(num));
//		
//	}
	
	public static long contadorChar(){
		FileReader archivo = null;
		long contador=0;
		try {
			archivo=new FileReader("JuegoTronos.txt");
			int uno=archivo.read();
			while(uno!=-1){
				uno = archivo.read();
				contador++;
				
			}
			archivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contador;
	}
	
	
	public ArrayList<Pagina> crearPaginas(){//hay que leer los chars, que solo haya x en cada linea y x en cada pagina
		ArrayList<Pagina> paginas = new ArrayList<Pagina>();
		long primer=1;
		long ulti=23;
		for (int i = 1; i < Math.abs(contadorChar()/17490); i++) {
			Pagina pagina = new Pagina(primer,ulti);
			paginas.add(pagina);
			primer+=23;
			ulti+=23;
		}
		
		return paginas;
		
	}

}
