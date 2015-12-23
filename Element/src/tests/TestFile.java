package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class TestFile {

	public void readFile(String uri) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(uri));

		br.readLine();// saute la premiere
		
		String line = br.readLine();
		while (line != null) {
			StringTokenizer st = new StringTokenizer(line, ";");
			String nom = st.nextToken();
			String semiconducteur = st.nextToken();
			double Eg = Double.parseDouble(st.nextToken());
			int id = Integer.parseInt(st.nextToken());
			System.out.println( nom + "    " + semiconducteur + "     " +Eg );
			line = br.readLine();
		}
		br.close();


	}
}
