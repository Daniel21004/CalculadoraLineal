import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.calculadoralineal.controllers.MatrizController;
import com.mycompany.calculadoralineal.modelos.MatrizInversa;

public class MatrizTest {

	MatrizInversa matrizInversa;
	MatrizController matrizController;
	private int dimension;

	@Before
	public void before() {
		matrizInversa = new MatrizInversa(2);
	}

	@Test
	public void testGenerarMatrizA() {
		matrizInversa.rellenarMatriz();
		double[][] matrizPrueba_A = new double[][] { { 1, 2 }, { 3, 4 } };
		assertArrayEquals(matrizPrueba_A[0], matrizInversa.getMatrizA()[0], 0);
		assertArrayEquals(matrizPrueba_A[1], matrizInversa.getMatrizA()[1], 0);
		testVerificarMatrizInversa();
	}

	@Test
	public void testGenerarMatrizIdentidad() {
		double[][] matrizPruebaIdentidad = new double[][] { { 1, 0 }, { 0, 1 } };
		assertArrayEquals(matrizPruebaIdentidad[0], matrizInversa.getMatrizUnidad()[0], 0);
		assertArrayEquals(matrizPruebaIdentidad[1], matrizInversa.getMatrizUnidad()[1], 0);
	}

	@Test
	public void testVerificarMatrizInversa() {
		matrizInversa.rellenarMatriz();
		double[][] matrizInversaPrueba = new double[][] { { -2, 1 }, { 1.5, -0.5 } };
		matrizInversa.calcularMatrizInversa();
		assertArrayEquals(matrizInversaPrueba[0], matrizInversa.getMatrizUnidad()[0], 0);
		assertArrayEquals(matrizInversaPrueba[1], matrizInversa.getMatrizUnidad()[1], 0);
	}
}
