package TEST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import SESION.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSumar() {
		assertEquals(5,Calculadora.SUMA(3,2));
	}

	@Test
	void testRestar() {
		assertEquals(0,Calculadora.RESTA(3,3)) ; 
	}
	
	@Test
	void testDividir() {
		assertEquals(4,Calculadora.DIVISION(8,2)) ; 
		
	}
	
	@Test
	void testDividirPor0() {
		assertEquals(-1,Calculadora.DIVISION(8,0)) ; 
		
	}
	
	@Test
	void testMultiplicar() {
		assertEquals(6,Calculadora.MULTIPLICA(3,2)) ; 
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
}
