package UD01;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.TreeSet;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Pregunta1 {

	public static void main(String[] args) {
		ListaLibros lista = new ListaLibros();
		TreeSet<Libro> libros = new TreeSet<Libro>();
		
		try {
			File f = new File("Ficheros\\libros.dat");
			if (f.length() <= 0) {
				System.out.println("El fichero esta vacio. No se va ha crear el fichero XMl....");
				System.exit(-1);
			} else {
				DataInputStream dis = new DataInputStream(new FileInputStream(f));
				dis.read();
				
				for(Libro l : libros) {
					libros.add(l);
				}
				dis.close();
				
			}

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("Final del fichero");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error de entrada y salida");
			e.printStackTrace();
		}

		try {
			XStream xs = new XStream(new DomDriver("UTF-8"));
			xs.alias("ListaLibros", ListaLibros.class);
			xs.alias("Libro", Libro.class);
			xs.addImplicitCollection(ListaLibros.class, "lista");
			xs.toXML(libros, new FileOutputStream("Ficheros\\libros.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
