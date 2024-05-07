package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;
class testMedia {

	private static int[] notas;

    @BeforeAll
    public static void setUp() {
        notas = new int[]{8, 7, 9, 6, 5};
    }

    @Test
    public void testMediaNotasValidas() {
    	float mediaEsperada=7;
    	float mediaObtenida=MisArrays.mediaNotas(notas);
    	assertEquals(mediaEsperada,mediaObtenida);
    }

}
