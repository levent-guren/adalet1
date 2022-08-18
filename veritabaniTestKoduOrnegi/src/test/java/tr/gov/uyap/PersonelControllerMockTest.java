package tr.gov.uyap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import tr.gov.uyap.controller.PersonelController;
import tr.gov.uyap.dao.PersonelDAO;
import tr.gov.uyap.entity.Personel;

@ExtendWith(MockitoExtension.class)
public class PersonelControllerMockTest {
	@Mock
	private PersonelDAO personelDAO;

	@InjectMocks
	private PersonelController personelController;

	@Test
	public void test2() {
		List<Personel> liste = new ArrayList<Personel>();
		when(personelDAO.getTumPersoneller()).thenReturn(liste);

		List<Personel> sonuc = personelController.getPersoneller();
		assertEquals(0, sonuc.size());
		verify(personelDAO, times(1)).getTumPersoneller();
	}
}
