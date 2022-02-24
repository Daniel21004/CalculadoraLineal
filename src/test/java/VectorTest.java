import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.calculadoralineal.modelos.Vectores;

public class VectorTest {
	
	Vectores vectores;
	
	@Before
	public void incializarVectores() {
		vectores = new Vectores(5, 6);
	}

	@Test
	public void testCalcularMagnitud() {
		String resultadoEsperado = "0,8761" ; //x=5, y=6
		assertTrue(resultadoEsperado.equals(vectores.getResult()));
	}
	
	@Test
	public void testCalcularAnguloTeta() {
		String resultadoEsperado = "50,1944" ; //x=5, y=6
		assertTrue(resultadoEsperado.equals(vectores.getResultDegrees()));
	}

}
