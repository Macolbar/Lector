package controlador;

import java.awt.EventQueue;

import control.logica.LectorBridge;
import vista.UI;

public class Principal {
	
	/**
	 * Launch the application.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LectorBridge frame = new LectorBridge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
