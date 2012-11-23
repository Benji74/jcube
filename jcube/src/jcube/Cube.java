package jcube;


import java.io.IOException;
import org.w3c.dom.Element;


public class Cube {
	private String faceOne;

	public static Cube fromTextFile(String filepath) throws IOException {
		return (new CubeTextFile(filepath)).newCube();
			
	}

	public Cube addFace(String string) {
		this.faceOne = string;
		return this;
	}
	
	public boolean equals(Object other) {
		Cube otherCube = (Cube)other;
		return this.faceOne.equals(otherCube.faceOne);
	}

	public String xmlFromSVGFile(String filePath) throws Exception{
		XMLDocument cube = (new XMLDocument()).loadXMLFile(filePath);
		Element blocNode = cube.getFirstNodeFromXPath("//tspan[contains(text(), \"$BLOCK1\")]");
		blocNode.setTextContent(faceOne);
		return cube.asXMLString();
	}

}
