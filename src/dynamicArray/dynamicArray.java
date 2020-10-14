package dynamicArray;

import java.util.Scanner;

public class dynamicArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();

		boolean terminate = false;
		int j = 0;
		String[] dataSet = new String[1];

		// dataSet erstellen/befüllen
		while (!terminate) {
			System.out.println("data to be stored: ");
			dataSet[j] = scan.nextLine();
			
			// Ausgabe dataSet[i]
			System.out.println("data stored: " + dataSet[j]);
			
			//Abfrage Abbruch
			System.out.println("quit? ('y', or else)");
			String input = scan.nextLine();

			// Abbruch Übereinstimmung
			if (input.equals("y")) {
				terminate = true;
			}
			if (j <= dataSet.length) {
				// Hilfsarray
				String[] biggerdataSet = new String[dataSet.length + 1];

				// Daten von Array zu Array kopieren Start [0] solange length
				System.arraycopy(dataSet, 0, biggerdataSet, 0, dataSet.length);
				dataSet = biggerdataSet;
			}
			j++;
		}

		// check sets in data array
		for (int i = 0; i < j; i++) {
			stringBuilder.append(dataSet[i]);
			if (i < j - 1) {
				stringBuilder.append("*");
			}
		}
		System.out.println("stored data-set: " + stringBuilder);
	}
}