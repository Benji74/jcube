package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cube {

	private String nameOfFiles;
	private String faceOne;

	private void setNameOfFiles(String nameOfFiles) {
		this.nameOfFiles = nameOfFiles;
	}
	
	public static Cube fromTextFile(String filename) {
		Cube cube = new Cube();
		cube.setNameOfFiles(filename);
		return cube;
	}

	public String titreFace(int i) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File(this.nameOfFiles)));
		String line = reader.readLine();
		reader.close();
		
		return line.substring(2);
	}

	public Cube addFace(String string) {
		this.faceOne = string;
		return this;
	}
	
	public boolean equals(Object other) {
		Cube otherCube = (Cube)other;
		return this.faceOne.equals(otherCube.faceOne);
	}

}
