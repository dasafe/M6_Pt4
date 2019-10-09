package practica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Curs implements Serializable{

	private String tutor;
	private ArrayList<String> alumnes = new ArrayList<String>();
	private HashMap<String, Object> moduls = new HashMap<String, Object>();

	public Curs(String tutor, ArrayList<String> alumnes, HashMap<String, Object> moduls) {
		super();
		this.tutor = tutor;
		this.alumnes = alumnes;
		this.moduls = moduls;
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
}
