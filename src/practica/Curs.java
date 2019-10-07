package practica;

import java.util.ArrayList;
import java.util.HashMap;

public class Curs {

	private String tutor;
	private ArrayList<String> alumnes = new ArrayList<String>();
	private HashMap<String, String> moduls = new HashMap<String, String>();

	public Curs(String tutor, ArrayList<String> alumnes, HashMap<String, String> moduls) {
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

	public HashMap<String, String> getModuls() {
		return moduls;
	}

	public void setModuls(HashMap<String, String> moduls) {
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

	public void setCurs(String tutor, ArrayList<String> alumnes, HashMap<String, String> moduls) {
		this.tutor = tutor;
		this.alumnes = alumnes;
		this.moduls = moduls;
	}
}
