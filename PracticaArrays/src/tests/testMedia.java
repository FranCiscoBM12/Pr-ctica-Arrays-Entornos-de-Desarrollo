package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;
class testMedia {

	private static int[] notasValidas;
	private static int []notasInvalidas;

    @BeforeAll
    public static void setUp() {
        notasValidas = new int[]{8, 7, 9, 6, 5};
        notasInvalidas = new int[] {8, 7, 11, 6, 8};
    }

    @Test
    public void testMediaNotasValidas() {
    	float mediaEsperada=7;
    	float mediaObtenida=MisArrays.mediaNotas(notasValidas);
    	assertEquals(mediaEsperada,mediaObtenida);
    }
   
    @Test
	void mediaParamIncorrecto() {
		//IllegalArgumentException
		//NumberFormatException
		Exception excepcion=assertThrows(IllegalArgumentException.class,
				() -> MisArrays.mediaNotas(notasInvalidas));
		
		String esperado="Las notas deben estar entre 0 y 10";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);
	
	
	}

}
