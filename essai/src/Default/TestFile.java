package Default;

import java.io.*;
import java.util.*;

public class TestFile {

	public void readFile(String uri) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(uri));

		br.readLine();// saute la premiere
		String line = br.readLine();

		/*
		 * FileReader filereader = new FileReader(uri); 
		 * FileWriter fileWrite
		 * =new FileWriter(uri);
		 */

		while (line != null) {
			StringTokenizer st = new StringTokenizer(line, ";");
			String titre = st.nextToken();
			String author = st.nextToken();
			double price = Double.parseDouble(st.nextToken());
			int id = Integer.parseInt(st.nextToken());
			System.out.println(titre + "    " + price + "     " + author);
			line = br.readLine();

			// fileWrite.close();

		}
		br.close();

	}

}
