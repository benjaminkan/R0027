package hirsipuu;

import java.util.Scanner;

public class hirsipuu {

	public static void main(String[] args) {

		// Taulukko sanoista

		String[] sanaLista = { "kissa", "koira", "hevonen", "apina", "kana", "kirahvi", "krokotiili", "kenguru",
				"virtahepo", "h�m�h�kki", "k��rme", "siili", "sarvikuono", "leijona", "muurahainen" };

		// Valitse satunnainen sana taulukosta

		int sananNumero = (int) (Math.random() * sanaLista.length);

		// Taulukko sy�tetyist� kirjaimista

		char[] sy�tetytKirjaimet = new char[sanaLista[sananNumero].length()];

		int arvaustenM��r� = 0;

		int v��ri�Arvauksia = 0;

		boolean sanaArvattu = false;

		String oikeaSana = sanaLista[sananNumero];

		String piilotettuSana = "";

		// Korvaa sanan kirjaimet alaviivoilla

		for (int i = 0; i < oikeaSana.length(); i++) {

			piilotettuSana += "_";

		}

		if (piilotettuSana.contains(Character.toString('_'))) {

			sanaArvattu = false;

		}

		// Peli alkaa

		System.out.println(

				"Tervetuloa pelaamaan Hirsipuu-peli�!\nEnint��n 8 v��r�� arvausta sallitaan.\nOnnea peliin!\n");

		int i = 0;

		while (sanaArvattu == false) {

			Scanner lukija = new Scanner(System.in);

			System.out.println("Sana: " + piilotettuSana);

			System.out.print("Anna kirjain: ");

			sy�tetytKirjaimet[i] = lukija.next().charAt(0);

			arvaustenM��r�++;

			// tarkista kirjaimet

			int index = oikeaSana.indexOf(sy�tetytKirjaimet[i]);

			// Korvaa alaviivat oikeilla kirjaimilla

			if (index >= 0) {

				char[] t = piilotettuSana.toCharArray();

				for (int j = 0; j < oikeaSana.length(); j++) {

					if (oikeaSana.charAt(j) == sy�tetytKirjaimet[i])

						t[j] = sy�tetytKirjaimet[i];

				}

				t[index] = sy�tetytKirjaimet[i];

				String uusiSana = "";

				for (int j = 0; j < t.length; j++) {

					uusiSana += t[j];

				}

				piilotettuSana = uusiSana;

			}

			// V��ri� arvauksia

			if (oikeaSana.indexOf(sy�tetytKirjaimet[i]) < 0) {

				v��ri�Arvauksia++;

			}

			System.out.println("V��ri� arvauksia: " + v��ri�Arvauksia + "\n");

			if (!piilotettuSana.contains(Character.toString('_'))) {

				sanaArvattu = true;

			}

			hirrenPiirto(v��ri�Arvauksia);

			// Voitit pelin

			if (sanaArvattu == true) {

				System.out.println("\n\nVoitit pelin!\nOikea sana: " + oikeaSana + "\nArvausten m��r�: "

						+ arvaustenM��r� + "\nV��ri� arvauksia: " + v��ri�Arvauksia);

			}

			// H�visit pelin

			if (v��ri�Arvauksia >= 9) {

				System.out.println("\nH�visit pelin!\nArvasit v��rin " + v��ri�Arvauksia

						+ " kertaa!\n ___\n|  |\n|  o\n| /|\\\n| / \\\n|");

				break;

			}

		}

	}

	public static void hirrenPiirto(int v��ri�Arvauksia) {

		if (v��ri�Arvauksia >= 1 && v��ri�Arvauksia <= 8) {

			switch (v��ri�Arvauksia) {

			case 1:

				// (v��ri�Arvauksia = 1)

				System.out.println("");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("");

				break;

			case 2:

				// (v��ri�Arvauksia = 2)

				System.out.println("");

				System.out.println(" ___");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("");

				break;

			case 3:

				// (v��ri�Arvauksia = 3)

				System.out.println("");

				System.out.println(" ___");

				System.out.println("|  |");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("");

				break;

			case 4:

				// (v��ri�Arvauksia = 4)

				System.out.println("");

				System.out.println(" ___");

				System.out.println("|  |");

				System.out.println("|  o");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("");

				break;

			case 5:

				// (v��ri�Arvauksia = 5)

				System.out.println("");

				System.out.println(" ___");

				System.out.println("|  |");

				System.out.println("|  o");

				System.out.println("|  |");

				System.out.println("|");

				System.out.println("|");

				System.out.println("");

				break;

			case 6:

				// (v��ri�Arvauksia = 6)

				System.out.println("");

				System.out.println(" ___");

				System.out.println("|  |");

				System.out.println("|  o");

				System.out.println("| /|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("");

				break;

			case 7:

				// (v��ri�Arvauksia = 7)

				System.out.println("");

				System.out.println(" ___");

				System.out.println("|  |");

				System.out.println("|  o");

				System.out.println("| /|\\");

				System.out.println("|");

				System.out.println("|");

				System.out.println("");

				break;

			case 8:

				// (v��ri�Arvauksia = 8)

				System.out.println("");

				System.out.println(" ___");

				System.out.println("|  |");

				System.out.println("|  o");

				System.out.println("| /|\\");

				System.out.println("| /");

				System.out.println("|");

				System.out.println("");

				break;

			}

		}

	}

}