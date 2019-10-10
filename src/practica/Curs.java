package practica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Curs implements Serializable {

	private String tutor;
	private ArrayList<String> alumnes = new ArrayList<String>();
	private HashMap<String, Object> moduls = new HashMap<String, Object>();
	private static Scanner reader = new Scanner(System.in);

	public Curs() {
		super();
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public ArrayList<String> getAlumnes() {
		return alumnes;
	}

	public void setAlumnes(ArrayList<String> alumnes) {
		this.alumnes = alumnes;
	}

	public HashMap<String, Object> getModuls() {
		return moduls;
	}

	public void setModuls(HashMap<String, Object> moduls) {
		this.moduls = moduls;
	}

	public Modul getModul(String modul) {
		return null;
	}

	public void setCurs() {
		System.out.println("Nombre del tutor:");
		this.tutor = reader.nextLine();

		ArrayList<String> alumnes = new ArrayList<String>();
		System.out.println("Introduce el numero de alumnos que cursan este curso:");
		int nAlumnos = validacion();
		for (int i = 0; i < nAlumnos; i++) {

		}
		this.alumnes = alumnes;
		this.moduls = moduls;
	}

	public void printCurs() {
		System.out.println("Tutor: " + tutor);
		System.out.println("Alumnes:");
		for (String string : alumnes) {
			System.out.println(string);
		}
		System.out.println("Moduls:");
		for (String string : moduls.keySet()) {
			System.out.println(string);
		}
	}

	private static int validacion() {
		while (!reader.hasNextInt()) {
			reader.next();
			System.out.println("No valido");
		}
		int numero = reader.nextInt();
		return numero;
	}
}
