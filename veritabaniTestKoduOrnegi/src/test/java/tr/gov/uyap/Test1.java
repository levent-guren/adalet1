package tr.gov.uyap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tr.gov.uyap.controller.PersonelController;

@SpringBootTest
public class Test1 {
	@Autowired
	private PersonelController personelController;

	@BeforeAll
	public static void once() {

	}

	@Test
	public void test1() {
		assertEquals(8, personelController.getPersoneller().size());
	}
}
