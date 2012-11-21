package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CubeFromOneLineTextFile {

	@Test
	public void cubeShouldHaveOneFace() {
		Cube cube = Cube.fromTextFile ("templates/One-line-cube.txt");
		assertEquals(new Integer(1), cube.numberOfFace());
	}
	@Test
	public void titreFaceShouldBeCommentSortirDuCourPlusTot() throws IOException {
		Cube cube = Cube.fromTextFile("templates/One-line-cube.txt");
		assertEquals("Comment sortir du cours plus tôt", cube.titreFace(0));
	}

}
