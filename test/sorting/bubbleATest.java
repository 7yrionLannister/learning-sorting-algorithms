package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bubbleATest {
	private String folderTestName = "testcases"; 
	
	@Test
	public void bubbleA_10() {
		int numberCase = 10;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleA-"+numberCase+".ref", 
					folderTestName+"/bubbleA-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleA failed");
	}

	@Test
	public void bubbleA_1() {
		int numberCase = 1;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleA-"+numberCase+".ref", 
					folderTestName+"/bubbleA-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleA failed");
	}

	@Test
	public void bubbleA_2() {
		int numberCase = 2;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleA-"+numberCase+".ref", 
					folderTestName+"/bubbleA-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleA failed");
	}

	@Test
	public void bubbleA_3() {
		int numberCase = 3;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleA-"+numberCase+".ref", 
					folderTestName+"/bubbleA-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleA failed");
	}

	@Test
	public void bubbleA_4() {
		int numberCase = 4;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleA-"+numberCase+".ref", 
					folderTestName+"/bubbleA-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleA failed");
	}

	@Test
	public void bubbleA_5() {
		int numberCase = 5;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleA-"+numberCase+".ref", 
					folderTestName+"/bubbleA-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleA failed");
	}

	@Test
	public void bubbleA_6() {
		int numberCase = 6;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleA-"+numberCase+".ref", 
					folderTestName+"/bubbleA-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleA failed");
	}

	@Test
	public void bubbleA_7() {
		int numberCase = 7;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleA-"+numberCase+".ref", 
					folderTestName+"/bubbleA-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleA failed");
	}

	@Test
	public void bubbleA_8() {
		int numberCase = 8;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleA-"+numberCase+".ref", 
					folderTestName+"/bubbleA-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleA failed");
	}

	@Test
	public void bubbleA_9() {
		int numberCase = 9;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleA-"+numberCase+".ref", 
					folderTestName+"/bubbleA-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleA failed");
	}

}
