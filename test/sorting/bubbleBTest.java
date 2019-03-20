package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bubbleBTest {
	private String folderTestName = "testcases"; 
	
	@Test
	public void bubbleB() {
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleB.ref", 
					folderTestName+"/bubbleB.out"), 
			"bubbleB failed");
	}
}
