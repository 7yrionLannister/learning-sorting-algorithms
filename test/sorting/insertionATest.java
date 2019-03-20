package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class insertionATest {
	private String folderTestName = "testcases"; 
	
	@Test
	public void insertionA_10() {
		int numberCase = 10;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionA-"+numberCase+".ref", 
					folderTestName+"/insertionA-"+numberCase+".out"), 
			"Case "+numberCase+" from insertionA failed");
	}

	@Test
	public void insertionA_1() {
		int numberCase = 1;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionA-"+numberCase+".ref", 
					folderTestName+"/insertionA-"+numberCase+".out"), 
			"Case "+numberCase+" from insertionA failed");
	}

	@Test
	public void insertionA_2() {
		int numberCase = 2;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionA-"+numberCase+".ref", 
					folderTestName+"/insertionA-"+numberCase+".out"), 
			"Case "+numberCase+" from insertionA failed");
	}

	@Test
	public void insertionA_3() {
		int numberCase = 3;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionA-"+numberCase+".ref", 
					folderTestName+"/insertionA-"+numberCase+".out"), 
			"Case "+numberCase+" from insertionA failed");
	}

	@Test
	public void insertionA_4() {
		int numberCase = 4;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionA-"+numberCase+".ref", 
					folderTestName+"/insertionA-"+numberCase+".out"), 
			"Case "+numberCase+" from insertionA failed");
	}

	@Test
	public void insertionA_5() {
		int numberCase = 5;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionA-"+numberCase+".ref", 
					folderTestName+"/insertionA-"+numberCase+".out"), 
			"Case "+numberCase+" from insertionA failed");
	}

	@Test
	public void insertionA_6() {
		int numberCase = 6;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionA-"+numberCase+".ref", 
					folderTestName+"/insertionA-"+numberCase+".out"), 
			"Case "+numberCase+" from insertionA failed");
	}

	@Test
	public void insertionA_7() {
		int numberCase = 7;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionA-"+numberCase+".ref", 
					folderTestName+"/insertionA-"+numberCase+".out"), 
			"Case "+numberCase+" from insertionA failed");
	}

	@Test
	public void insertionA_8() {
		int numberCase = 8;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionA-"+numberCase+".ref", 
					folderTestName+"/insertionA-"+numberCase+".out"), 
			"Case "+numberCase+" from insertionA failed");
	}

	@Test
	public void insertionA_9() {
		int numberCase = 9;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionA-"+numberCase+".ref", 
					folderTestName+"/insertionA-"+numberCase+".out"), 
			"Case "+numberCase+" from insertionA failed");
	}

}
