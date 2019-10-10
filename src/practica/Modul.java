package practica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Modul implements Serializable {
	private String nom;
	private String profe;
	private ArrayList<String> ufs = new ArrayList<String>();
	private static Scanner reader = new Scanner(System.in);

	public Modul() {
		super();
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

	public void setModul(String nom) {
		this.nom = nom;
		System.out.println("Nombre del profesor:");
		this.profe = reader.nextLine();
		System.out.println("Numero de UFS que tiene:");
		int nUfs = validacion();
		reader.nextLine();
		for (int i = 0; i < nUfs; i++) {
			System.out.println("Nombre de la UF" + (i +1));
			ufs.add(reader.nextLine());
		}
	}

	public void printModul() {
		System.out.println("Nom: " + nom + "\nProfe: " + profe + "UFS:\n");
		printUFs();
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
