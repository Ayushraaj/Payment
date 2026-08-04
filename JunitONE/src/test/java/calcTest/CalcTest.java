package calcTest;




import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.cal.Calc;

public class CalcTest {
	
	
	Calc c = new Calc();
	
	@Test
	public void addTest(int a, int b) {
		assertEquals(5, c.add(2, 3));
	}

}
