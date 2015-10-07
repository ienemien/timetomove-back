package timetomove.model;

import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

@Ignore
public class ActivityDaoImplTest {

	@Mock
	private SessionFactory sessionMock;

	@InjectMocks
	private ActivityDaoImpl fixture;

	@Test
	public void testFindAllActivities() throws Exception {
		fixture.findAllActivities();
	}
}