package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class insertionBTest {
	private String folderTestName = "testcases"; 
	
	@Test
	public void insertionB() {
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/insertionB.ref", 
					folderTestName+"/insertionB.out"), 
			"insertionB failed");
	}
}
