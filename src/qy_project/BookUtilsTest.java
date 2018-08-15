package qy_project;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BookUtilsTest {

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
	public void testGetBookName() {
		assertEquals(new BookUtils().getBookName(),("非洲三万里"));
	}

	@Test
	public void testGetBookId() {
		assertEquals(new BookUtils().getBookId(),("125"));
	}

	@Test
	public void testGetBookPrice() {
		assertEquals(new BookUtils().getBookPrice(),("47.8"));
	}

	@Test
	public void testGetBookPublicData() {
		assertEquals(new BookUtils().getBookPublicData(),("2015-5-23"));
	}

}
