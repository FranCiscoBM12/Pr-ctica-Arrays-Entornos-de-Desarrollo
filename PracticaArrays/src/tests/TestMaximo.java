package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMaximo {


	private static int[] notasValidas;
	private static int []notasInvalidas;

	
	 @BeforeAll
	    public static void setUp() {
	        notasValidas = new int[]{8, 7, 9, 6, 5};
	        notasInvalidas = new int[] {8, 7, 11, 6, 8};
	    }

	    @Test
	    public void testMaximo() {
	    	float maximoEsperada=9;
	    	float maximoObtenida=MisArrays.maximaNota(notasValidas);
	    	assertEquals(maximoEsperada,maximoObtenida);
	    }
	    @Test
	    public void testMaximoInvalido() {
	    	float maximoEsperada=11;
	    	float maximoObtenida=MisArrays.medianaNotas(notasInvalidas);
	    	assertEquals(maximoEsperada,maximoObtenida);
	    }

}
