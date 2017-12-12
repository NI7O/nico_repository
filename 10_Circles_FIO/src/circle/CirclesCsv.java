package circle;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class CirclesCsv {

	static final String DELIMITER = ";";

	public static void main(String[] args) {



		try {
			ArrayList<Circle> kreisliste = new ArrayList<Circle>();
			// Argumente übergeben
			//final ist wie in C const
			final String INPUT = args[0];
			final String OUTPUT = args[1];
			final Circle referenz = new Circle(args[2], Double.parseDouble(args[3]));

			// File öffnen
			//ich kann auch new File in Scanner Klammer erstellen
			File file = new File(INPUT);
			Scanner sc = new Scanner(file);

			// File einlesen und auf kreisliste speichern
			readFromFile(sc, kreisliste);

			// File schließen
			sc.close();

			// File beschreiben, hole Daten von kreisliste
			PrintWriter writer = new PrintWriter(OUTPUT);

			writeToFile(writer, kreisliste, referenz);
			writer.close();

		} catch (Exception e) {
			// Fehlerbehandlung: wenn keine Zahl bei args[3] eingegeben wurde

			e.printStackTrace();

		}
	}

	/**
	 * @brief Reads from `stream` and adds entries to `list`.
	 *
	 * @param stream Scanner providing read access to file.
	 * @param list ArrayList to store Circle entries.
	 */
	
	public static void readFromFile(Scanner stream, ArrayList<Circle> list) {
		// hasNext so wie in C EOF: end of file
		while (stream.hasNext()) {
			String line = stream.nextLine();
			String[] words = line.split(DELIMITER);

			Circle temporary = new Circle(words[0], Double.parseDouble(words[1]));
			list.add(temporary);
		}
	}

	/**
	 * @brief Writes entries of `list` to `stream`.
	 *
	 * @param stream PrintWriter providing write access to file.
	 * @param list     ArrayList of Circle entries.
	 * @param other  Reference Circle object.
	 */
	public static void writeToFile(PrintWriter stream, ArrayList<Circle> list, Circle other) {

		for (int i = 0; i < list.size(); i++) {
			boolean gleich = list.get(i).hasColorAs(other);

			if (gleich) {

				stream.printf("%s; %.2f; %.2f; %.2f\n",list.get(i).getColor(),list.get(i).getRadius(),
						list.get(i).calculateArea(),list.get(i).calculateAreaDifference(other));

			}
		}
	}
}




