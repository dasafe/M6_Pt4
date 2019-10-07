package practica;

import java.io.File;
import java.util.HashMap;

public class Pt2 {
	private HashMap<String, String> cursos = new HashMap<String, String>();

	public Pt2(HashMap<String, String> cursos) {
		super();
		this.cursos = cursos;
	}

	public HashMap<String, String> getCursos() {
		return cursos;
	}

	public void setCursos(HashMap<String, String> cursos) {
		this.cursos = cursos;
	}

	public void dadesIn(File dades) {
	}

	public void dadesOut(File dades) {
	}

	public static void main(String[] args) {

	}
}
