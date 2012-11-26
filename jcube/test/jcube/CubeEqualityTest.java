package jcube;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeEqualityTest {

<<<<<<< HEAD

	@Test
	public void twoCubeWithOneDifferentFaceShouldNotBeEqual() {
		Cube cubeGit = (new Cube()).addFace("Git");
		Cube cubeSVN = (new Cube()).addFace("SVN");
		assertFalse(cubeGit.equals(cubeSVN));
	}
	@Test
	public void twoCubeWithTwoDifferentFaceShouldNotBeEqual() {
		Cube cubeGit = (new Cube()).addFace("Git").addFace("Face");
		Cube cubeSVN = (new Cube()).addFace("SVN").addFace("Face2");
=======
	@Test
	public void twoCubeWithOneDifferentFaceShouldNotBeEqual() {
		Cube cubeGit = (new Cube()).addFace("Git");
		Cube cubeSVN = (new Cube()).addFace("SVN");
>>>>>>> refs/remotes/origin/cours_iae
		assertFalse(cubeGit.equals(cubeSVN));
	}

}
