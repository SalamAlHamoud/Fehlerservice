package hello;

import java.io.*;

public class FehlermeldungTextPersistence implements FehlermeldungPersistence {

	public void save(Fehlermeldung meldung) {
		File myfile = new File("D:\\eAntrag\\workspaces\\ausbildung2017\\salamservice\\test.txt");
		// myfile.createNewFile();

		try {
			FileWriter fileWriter = new FileWriter(myfile, true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(new FehlermeldungDAO().getFehlermeldungString(meldung));
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	// public void save(Fehlermeldung meldung) {
	// }

}
