package main;

import a.liskovImm.*;

public class Main_a {

	public static void main(String[] args) {

		/* 
		 * L'h�ritage entre CarreImm e RectagleImm respecte 
		 * le principle de Liskov.  On n'a pas de probl�mes.
		 * */
		
		RectangleImm r = new RectangleImm(3,5);
		System.out.println("Retangle r: "+r);
		System.out.println("C�t� 1 du rectangle r: "+ r.getc1());
		System.out.println("C�t� 2 du rectangle r: "+ r.getc2());
		System.out.println("P�rim�tre du rectangle r: "+ r.perimetre());
		System.out.println("Aire du rectangle r: "+ r.surface());
				
		CarreImm c = new CarreImm(3);
		System.out.println("Carr� c: "+ c);
		System.out.println("C�t� 1 du carr� c: "+ c.getc1());
		System.out.println("C�t� 2 du carr� c: "+ c.getc2());
		System.out.println("P�rim�tre du carr� c: "+ c.perimetre());
		System.out.println("Aire du carr� c: "+ c.surface());
		
		RectangleImm d = new CarreImm(3);
		System.out.println("Carr� d: "+ d);
		System.out.println("C�t� 1 du carr� d: "+ d.getc1());
		System.out.println("C�t� 2 du carr� d: "+ d.getc2());
		System.out.println("P�rim�tre du carr� d: "+ d.perimetre());
		System.out.println("Aire du carr� d: "+ d.surface());
			
	}

}
