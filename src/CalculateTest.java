

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		System.out.println("this is testAdd()...");
		int result = Calculate.add(5, 9);
		assertEquals("�ӷ�������", 14, result);
	}

	@Test
	public void testSubstract() {
		System.out.println("this is testSubstract()...");
		int result = Calculate.substract(17, 5);
		assertEquals("����������", 12, result);
	}

	@Test
	public void testMultiply() {
		int result = Calculate.multiply(4, 3);
		assertEquals("�˷�������", 12, result);
	}

	@Test
	public void testDivide() {
		int result = Calculate.divide(6, 3);
		assertEquals("����������", 2, result);
	}

}
