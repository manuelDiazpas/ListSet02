package unico;

import java.util.Set;
import java.util.TreeSet;

public class Principal {
public static void main(String[] args) {
		
		final Integer MAX_NUM = 10;
		final Integer MAX_AL = 50;
		
		Set<Integer> numAl = new TreeSet<Integer>();
		
		while(numAl.size()<MAX_NUM) {
			numAl.add(generarNumAl(MAX_AL));
		}
		
		System.out.println("Números creados en sentido creciente:");		
		System.out.println(numAl);
		
	}

	private static Integer generarNumAl(Integer max) {
		return (int)(Math.random() * max + 1);
	}

}
