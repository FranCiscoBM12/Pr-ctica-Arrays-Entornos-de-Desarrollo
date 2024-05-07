package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMinimo {

	private static int[] notasValidas;
	private static int []notasInvalidas;

	
	 @BeforeAll
	    public static void setUp() {
	        notasValidas = new int[]{8, 7, 9, 6, 5};
	        notasInvalidas = new int[] {8, 7, 11, 6, 8};
	    }

	    @Test
	    public void testMaximo() {
	    	int minimoEsperada=5;
	    	int minimoObtenida=MisArrays.minimaNota(notasValidas);
	    	assertEquals(minimoEsperada,minimoObtenida);
	    }
	    @Test
	    public void testMaximoInvalido() {
	    	int minimoEsperada=6;
	    	int minimoObtenida=MisArrays.minimaNota(notasInvalidas);
	    	assertEquals(minimoEsperada,minimoObtenida);
	    }
}
