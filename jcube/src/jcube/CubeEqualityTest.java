package jcube;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeEqualityTest {

	@Test
	public void twoCubeWithOneDifferentFaceShouldNotBeEqual() {
		Cube cubeGit = (new Cube()).addFace("Git");
		Cube cubeSVN = (new Cube()).addFace("SVN");
		assertFalse(cubeGit.equals(cubeSVN));
	}
	@Test
	public void FusionnerLeCubeEnXML() throws Exception{
		Cube cube = (new Cube()).addFace("Comment sortir du cours plus tôt");
		String xml = cube.xmlFromSVGFile("templates/cube.svg");
		XMLDocument readCubeXML = (new XMLDocument()).loadXMLString(xml);
		assertTrue(readCubeXML.match("//tspan[contains(text(), \"Comment sortir du cours plus tôt\")]"));
	}

}
