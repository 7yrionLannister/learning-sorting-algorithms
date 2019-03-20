package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class selectionBTest {
	private String folderTestName = "testcases"; 
	
	@Test
	public void selectionB() {
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/selectionB.ref", 
					folderTestName+"/selectionB.out"), 
			"selectionB failed");
	}
}
