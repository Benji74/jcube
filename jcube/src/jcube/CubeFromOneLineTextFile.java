package jcube;

import static org.junit.Assert.*;


import org.junit.Test;

public class CubeFromOneLineTextFile {
	
	@Test
	public void cubeShouldBeOneFaceWithCommentSortirDuCoursPlusTot(){
		Cube expectedCube = (new Cube())
							.addFace("Comment sortir du cours plus tôt");
		Cube actualCube = Cube.fromTextFile("templates/One-line-cube.txt");
		
		assertEquals(expectedCube, actualCube);
	}

}
