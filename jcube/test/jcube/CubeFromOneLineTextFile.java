package jcube;

import static org.junit.Assert.*;

import java.io.IOException;


import org.junit.Before;
import org.junit.Test;


public class CubeFromOneLineTextFile {
	private Cube actualCube;
	
	@Before
	public void loadCubeFromONeLineCudeDoTxt() throws Exception{
		this.actualCube = Cube.fromTextFile("templates/one-line-cube.txt");
	}
	@Test
	public void cubeShouldBeOneFaceWithCommentSortirDuCoursPlusTot() throws IOException {
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus tôt");
		
		assertEquals(expectedCube, actualCube);
	}
	@Test
	public void FusionnerLeCubeEnXML() throws Exception{
		Cube cube = (new Cube()).addFace("Comment sortir du cours plus tôt");
		String xml = cube.xmlFromSVGFile("templates/cube.svg");
		XMLDocument readCubeXML = (new XMLDocument()).loadXMLString(xml);
		assertTrue(readCubeXML.match("//tspan[contains(text(), \"Comment sortir du cours plus tôt\")]"));
	}
	

}

