import static org.junit.Assert.*;
import org.junit.Test;;

public class TriangleTest extends Triangle {

	@Test
	public void test() throws TriangleException {
		double a = 3;
		double b = 4;
		double c = 5;
		Triangle tri1 = Triangle(a,b,c);
		assertTrue(tri1.getArea()==6);
		
		c = 20;
		Triangle tri2 = Triangle(a,b,c);
		tri2.getArea();	}		
	}

