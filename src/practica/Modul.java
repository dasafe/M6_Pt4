package practica;

import java.io.Serializable;
import java.util.ArrayList;

public class Modul implements Serializable {
	private String nom;
	private String profe;
	private ArrayList<String> ufs = new ArrayList<String>();

	public Modul(String nom, String profe, ArrayList<String> ufs) {
		super();
		this.nom = nom;
		this.profe = profe;
		this.ufs = ufs;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getProfe() {
		return profe;
	}

	public void setProfe(String profe) {
		this.profe = profe;
	}

	public ArrayList<String> getUfs() {
		return ufs;
	}

	public void setUfs(ArrayList<String> ufs) {
		this.ufs = ufs;
	}

	public void printUFs() {
		for (String string : ufs) {
			System.out.println(string);
		}
	}

	public void printModul() {
		System.out.println("Nom: " + nom + "\nProfe: " + profe + "UFS:\n");
		printUFs();
	}
}
