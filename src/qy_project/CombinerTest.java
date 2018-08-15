package qy_project;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CombinerTest {
	@Test
	public void testmethod() {
		Result result = JUnitCore.runClasses(CalculateTest.class, BookUtilsTest.class);
		for (Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("All tests finished successfully...");
		}
	}
}
