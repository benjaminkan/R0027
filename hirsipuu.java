package hirsipuu;

import java.util.Scanner;

public class hirsipuu {

	public static void main(String[] args) {

		// Taulukko sanoista

		String[] sanaLista = { "kissa", "koira", "hevonen", "apina", "kana", "kirahvi", "krokotiili", "kenguru",
				"virtahepo", "hämähäkki", "käärme", "siili", "sarvikuono", "leijona", "muurahainen" };

		// Valitse satunnainen sana taulukosta

		int sananNumero = (int) (Math.random() * sanaLista.length);

		// Taulukko syötetyistä kirjaimista

		char[] syötetytKirjaimet = new char[sanaLista[sananNumero].length()];

		int arvaustenMäärä = 0;

		int vääriäArvauksia = 0;

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

				"Tervetuloa pelaamaan Hirsipuu-peliä!\nEnintään 8 väärää arvausta sallitaan.\nOnnea peliin!\n");

		int i = 0;

		while (sanaArvattu == false) {

			Scanner lukija = new Scanner(System.in);

			System.out.println("Sana: " + piilotettuSana);

			System.out.print("Anna kirjain: ");

			syötetytKirjaimet[i] = lukija.next().charAt(0);

			arvaustenMäärä++;

			// tarkista kirjaimet

			int index = oikeaSana.indexOf(syötetytKirjaimet[i]);

			// Korvaa alaviivat oikeilla kirjaimilla

			if (index >= 0) {

				char[] t = piilotettuSana.toCharArray();

				for (int j = 0; j < oikeaSana.length(); j++) {

					if (oikeaSana.charAt(j) == syötetytKirjaimet[i])

						t[j] = syötetytKirjaimet[i];

				}

				t[index] = syötetytKirjaimet[i];

				String uusiSana = "";

				for (int j = 0; j < t.length; j++) {

					uusiSana += t[j];

				}

				piilotettuSana = uusiSana;

			}

			// Vääriä arvauksia

			if (oikeaSana.indexOf(syötetytKirjaimet[i]) < 0) {

				vääriäArvauksia++;

			}

			System.out.println("Vääriä arvauksia: " + vääriäArvauksia + "\n");

			if (!piilotettuSana.contains(Character.toString('_'))) {

				sanaArvattu = true;

			}

			hirrenPiirto(vääriäArvauksia);

			// Voitit pelin

			if (sanaArvattu == true) {

				System.out.println("\n\nVoitit pelin!\nOikea sana: " + oikeaSana + "\nArvausten määrä: "

						+ arvaustenMäärä + "\nVääriä arvauksia: " + vääriäArvauksia);

			}

			// Hävisit pelin

			if (vääriäArvauksia >= 9) {

				System.out.println("\nHävisit pelin!\nArvasit väärin " + vääriäArvauksia

						+ " kertaa!\n ___\n|  |\n|  o\n| /|\\\n| / \\\n|");

				break;

			}

		}

	}

	public static void hirrenPiirto(int vääriäArvauksia) {

		if (vääriäArvauksia >= 1 && vääriäArvauksia <= 8) {

			switch (vääriäArvauksia) {

			case 1:

				// (vääriäArvauksia = 1)

				System.out.println("");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("|");

				System.out.println("");

				break;

			case 2:

				// (vääriäArvauksia = 2)

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

				// (vääriäArvauksia = 3)

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

				// (vääriäArvauksia = 4)

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

				// (vääriäArvauksia = 5)

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

				// (vääriäArvauksia = 6)

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

				// (vääriäArvauksia = 7)

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

				// (vääriäArvauksia = 8)

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