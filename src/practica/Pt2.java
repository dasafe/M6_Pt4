package practica;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pt2 implements Serializable {

	private static HashMap<String, Curs> cursos = new HashMap<String, Curs>();
	private static Scanner reader = new Scanner(System.in);

	public Pt2(HashMap<String, Curs> cursos) {
		super();
		this.cursos = cursos;
	}

	public HashMap<String, Curs> getCursos() {
		return cursos;
	}

	public void setCursos(HashMap<String, Curs> cursos) {
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
			System.out.println();
			switch (opcion) {
			case 1:
				reader.nextLine();
				System.out.println("Nombre del curso:");
				String key = reader.nextLine().toUpperCase();
				Curs curs = new Curs();
				curs.setCurs();
				cursos.put(key, curs);

				break;
			case 2:
				System.out.println("-Cursos-");
				int i = 1;
				for (String string : cursos.keySet()) {
					System.out.println(i + ". " + string);
					i++;
				}
				System.out.println("Que curso quieres mostrar?");
				reader.nextLine();
				Curs c = cursos.get(reader.nextLine().toUpperCase());
				c.printCurs();
				break;
			case 3:
				System.out.println("-Cursos-");
				int j = 1;
				for (String string : cursos.keySet()) {
					System.out.println(j + ". " + string);
					j++;
				}
				System.out.println("Que curso quieres eliminar?");
				reader.nextLine();
				cursos.remove(reader.nextLine().toUpperCase());
				break;
			case 4:
				System.out.println("Bye!");
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
