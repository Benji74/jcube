package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cube {

	private String nameOfFiles;

	public void setNameOfFiles(String nameOfFiles) {
		this.nameOfFiles = nameOfFiles;
	}
	
	public static Cube fromTextFile(String string) {
		Cube cube = new Cube();
		cube.setNameOfFiles(string);
		return cube;
	}

	public Integer numberOfFace() {
		return 1;
	}

	public String titreFace(int i) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File(nameOfFiles)));
		String line = reader.readLine();
		reader.close();
		
		return line.substring(2);
	}

}
