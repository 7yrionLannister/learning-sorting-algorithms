package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class selectionATest {
	private String folderTestName = "testcases"; 
	
	@Test
	public void selectionA_10() {
		int numberCase = 10;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionA-"+numberCase+".ref", 
					folderTestName+"/selectionA-"+numberCase+".out"), 
			"Case "+numberCase+" from selectionA failed");
	}

	@Test
	public void selectionA_1() {
		int numberCase = 1;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionA-"+numberCase+".ref", 
					folderTestName+"/selectionA-"+numberCase+".out"), 
			"Case "+numberCase+" from selectionA failed");
	}

	@Test
	public void selectionA_2() {
		int numberCase = 2;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionA-"+numberCase+".ref", 
					folderTestName+"/selectionA-"+numberCase+".out"), 
			"Case "+numberCase+" from selectionA failed");
	}

	@Test
	public void selectionA_3() {
		int numberCase = 3;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionA-"+numberCase+".ref", 
					folderTestName+"/selectionA-"+numberCase+".out"), 
			"Case "+numberCase+" from selectionA failed");
	}

	@Test
	public void selectionA_4() {
		int numberCase = 4;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionA-"+numberCase+".ref", 
					folderTestName+"/selectionA-"+numberCase+".out"), 
			"Case "+numberCase+" from selectionA failed");
	}

	@Test
	public void selectionA_5() {
		int numberCase = 5;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionA-"+numberCase+".ref", 
					folderTestName+"/selectionA-"+numberCase+".out"), 
			"Case "+numberCase+" from selectionA failed");
	}

	@Test
	public void selectionA_6() {
		int numberCase = 6;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionA-"+numberCase+".ref", 
					folderTestName+"/selectionA-"+numberCase+".out"), 
			"Case "+numberCase+" from selectionA failed");
	}

	@Test
	public void selectionA_7() {
		int numberCase = 7;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionA-"+numberCase+".ref", 
					folderTestName+"/selectionA-"+numberCase+".out"), 
			"Case "+numberCase+" from selectionA failed");
	}

	@Test
	public void selectionA_8() {
		int numberCase = 8;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionA-"+numberCase+".ref", 
					folderTestName+"/selectionA-"+numberCase+".out"), 
			"Case "+numberCase+" from selectionA failed");
	}

	@Test
	public void selectionA_9() {
		int numberCase = 9;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionA-"+numberCase+".ref", 
					folderTestName+"/selectionA-"+numberCase+".out"), 
			"Case "+numberCase+" from selectionA failed");
	}

}
