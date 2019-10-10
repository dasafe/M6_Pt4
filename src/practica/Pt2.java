package practica;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pt2 implements Serializable {

	private static HashMap<String, Object> cursos = new HashMap<String, Object>();
	private static Scanner reader = new Scanner(System.in);

	public Pt2(HashMap<String, Object> cursos) {
		super();
		this.cursos = cursos;
	}

	public HashMap<String, Object> getCursos() {
		return cursos;
	}

	public void setCursos(HashMap<String, Object> cursos) {
		this.cursos = cursos;
	}

	public void dadesIn(File dades) {
	}

	public void dadesOut(File dades) {
	}

	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println("");
			System.out.println("PROPOSTA DE RESOLUCIO PT2 (STREAMSD'OBJECTES)");

			System.out.println("==============================================");
			System.out.println("1. AFEGIR UN NOU CURS");
			System.out.println("2. MOSTRAR DADES CURS");
			System.out.println("3. ELIMINAR UN CURS");
			System.out.println("4. SORTIR");
			System.out.print("Escull una opcio: ");
			opcion = validacion();
			switch (opcion) {
			case 1:
//				String tutor, nom, profe;
//				ArrayList<String> ufs = new ArrayList<String>();
//				ArrayList<String> alumnes = new ArrayList<String>();
//				HashMap<String, Object> moduls = new HashMap<String, Object>();
//				Modul modul = new Modul();
				
				reader.nextLine();
				System.out.println("Nombre del curso:");
				String key = reader.nextLine();
				Curs curs = new Curs();
				curs.setCurs();
				cursos.put(key, curs);
				
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;

			default:
				System.out.println("Opcion invalida");
				break;
			}
		} while (opcion != 4);
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
