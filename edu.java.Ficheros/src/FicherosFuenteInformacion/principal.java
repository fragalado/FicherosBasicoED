package FicherosFuenteInformacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class principal {

	public static void main(String[] args) {
		// Lista que contendra objetos de tipo Usuario
		List<Usuario> lista = new ArrayList<>();
		
		// Leemos el fichero de texto
		File fichero = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fichero = new File("C:\\zDatosPrueba\\FicheroFuenteInformacion.txt");
			fr = new FileReader(fichero);
			br = new BufferedReader(fr);
			
			// Leemos la primera linea (Cabecera)
			String linea;
			String[] vAux;
			linea = br.readLine();
			// Ahora leemos cada linea del texto y a la vez construimos objetos de tipo Usuario y añadimos a la lista
			while((linea= br.readLine()) != null) {
				// EJ: Afonso;Rodríguez Puente;26
				vAux = linea.split(";");
				Usuario u = new Usuario(vAux[0].trim(), vAux[1].trim(), Integer.parseInt(vAux[2].trim()));
				// Añadimos el objeto creado a la lista
				lista.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			// Cerramos el fichero
			try {
				if(null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		// Ahora recorremos la lista e imprimimos por pantalla los objetos de tipo Usuario
		for (Usuario aux : lista) {
			System.out.println(aux.toString());
		}
	}	

}
