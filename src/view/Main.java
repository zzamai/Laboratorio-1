package view;

import model.ArrayConjunto;

public class Main {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayConjunto<Nada> array = new ArrayConjunto<>(10);
		
		array.add(new Nada());
		array.add(new Nada());
		array.add(new Nada());
		array.add(new Nada());
		array.add(new Nada());
		
		System.out.println("Temos 5 Nadas");
		
		for(int i=0; i < array.size(); i++) {
			System.out.println(array.get(i).toString());
		}
		
		for(int i=0; i < 20; i++) {
			array.add(new Nada());
		}
		
		System.out.println("Temos 25 Nadas");
		
		for(int i=0; i < array.size(); i++) {
			System.out.println(array.get(i).toString());
		}
		
		System.out.println(array.remove(10));
		System.out.println(array.remove(5));
		System.out.println(array.remove(15));
		System.out.println(array.remove(40));
		System.out.println("Os Nadas restantes");
		
		for(int i=0; i < array.size(); i++) {
			System.out.println(array.get(i).toString());
		}
		
		System.out.println("Contains ----");
		
		Nada nada = new Nada(3);
		System.out.println(array.contains(nada));
		
		System.out.println("---- Contains");
		
		array.clear();
		
		System.out.println("Cadê os Nadas?");
		
		for(int i=0; i < array.size(); i++) {
			System.out.println(array.get(i).toString());
		}
		
	}

}
