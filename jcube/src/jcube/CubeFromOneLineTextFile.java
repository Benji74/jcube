package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CubeFromOneLineTextFile {
	private Cube cube;
	@Before
	public void createCubeFromTextFile(){
		this.cube = Cube.fromTextFile ("templates/One-line-cube.txt");
	}

	@Test
	public void cubeShouldHaveOneFace() {
		
		assertEquals(new Integer(1), this.cube.numberOfFace());
	}
	@Test
	public void titreFaceShouldBeCommentSortirDuCourPlusTot() throws IOException {
		
		assertEquals("Comment sortir du cours plus tôt", this.cube.titreFace(0));
	}

}
