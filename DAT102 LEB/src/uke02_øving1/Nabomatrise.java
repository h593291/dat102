package uke02_øving1;

import java.util.List;
import java.util.HashMap;

public class Nabomatrise implements Graf {

	private int n;
	private int m;
	private boolean[][] matrise;

	private HashMap<String, Integer> nodenavn;
	private String[] navn;

	// Konstruktør
	public Nabomatrise(String[] navnPaaNoder) {

		// Lage klar en matrise for input
		navn = navnPaaNoder;
		n = navnPaaNoder.length;
		m = 0;
		matrise = new boolean[n][n];

		// Lage HashMap-tabell som henter data fra matrisen
		nodenavn = new HashMap<>(n);

		// Legge inn data fra matrisen til hashmapen
		for (int i = 0; i < n; i++) {
			nodenavn.put(navn[i], n);
		}
	}

	@Override
	public int getAntallNoder() {
		return matrise.length;
	}

	@Override
	public int getAntallKanter() {

		int kanter = 0;

		for (int i = 0; i < matrise.length;) {

			int j = 0;

			if (matrise[i][j] == true) {
				kanter++;
				j++;
				i++;
			} else
				i++;
		}
		return kanter;
	}

	@Override
	public List<String> alleNoder() {
		
		List<String> nodeListe = new <String>();
		
		return nodeListe;
	}

	@Override
	public boolean erNaboer(String u, String v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean leggTilNode(String w) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean leggTilKant(String u, String v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean leggTilKanter(String w, String[] naboer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fjern(String u, String v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getNaboer(String w) {
		// TODO Auto-generated method stub
		return null;
	}

}
