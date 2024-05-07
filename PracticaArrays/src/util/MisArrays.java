package util;

public abstract class MisArrays {
	public static float mediaNotas(int[] notas) {
	    int suma = 0;
	    for (int nota : notas) {
	    	if (nota < 0 || nota > 10) {
	            throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
	        }
	        suma += nota;
	    }
	    return (float) suma / notas.length;
	}

}
