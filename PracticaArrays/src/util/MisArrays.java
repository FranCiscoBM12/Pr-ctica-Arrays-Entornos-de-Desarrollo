package util;

import java.util.Arrays;

public abstract class MisArrays {
	/**
	 * 
	 * @param notas
	 * @return la media de las notas del Array que se introduce como parametro
	 */
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
	
	/**
	 * 
	 * @param notas
	 * @return la mediana de las notas del Array introducido como parametro
	 */
	public static float medianaNotas(int[] notas) {
		for (int nota : notas) {
	    	if (nota < 0 || nota > 10) {
	            throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
	    }
		}
		Arrays.sort(notas);
	    int n = notas.length;
	    if (n % 2 == 0) {
	        return (float) (notas[n / 2 - 1] + notas[n / 2]) / 2;
	    } else {
	        return (float) notas[n / 2];
	    }
	
	}
	
	/**
	 * 
	 * @param notas
	 * @return la maxima nota de las notas que se introducen en el array 
	 */
	public static int maximaNota(int[] notas) {
        int max = Integer.MIN_VALUE;
        for (int nota : notas) {
        	if (nota < 0 || nota > 10) {
	            throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
	    }
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }
	
	/**
	 * 
	 * @param notas
	 * @return la minima nota de las notas que se introducen en el array
	 */
	public static int minimaNota(int[] notas) {
        int min = Integer.MAX_VALUE;
        for (int nota : notas) {
        	if (nota < 0 || nota > 10) {
	            throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
	    }
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }
	
}
