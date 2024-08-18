package main;

import e.liskovEsp.*;

public class MainEsp {
	
	
	/*
	 * L'aire du carr� est le carr� de son c�t�.
	 * La m�thode myF(r) v�rifie cette propri�t�.
	 */
	static String myFunction(Carre s)  {
		if (s.surface()== s.getc1()*s.getc1()) {
			return "OK";
		}
		else {
			throw new RuntimeException();
		}
		
	}

	public static void main(String[] args) {
		
		Carre c = new Carre(3);
		System.out.println("c = "+ c);
		System.out.println("c is "+ myFunction(c));
				
		Rectangle r = new Rectangle (3,4);
		/*
		 * �tant donn�e que la classe Rectangle a �t� d�finie comme 
		 * d�riv�e de la classe Carre, on peut appeler la m�thode 
		 * myF pour r. 
		 * 
		 * Mais, l'aire de r n'est pas le carr� de son premier c�t�.
		 * 
		 * Alors, on voit que faire la classe Rectangle d�riv�e de 
		 * la classe Carre, m�me s'ils sont immuables, donne comme 
		 * r�sultat un h�ritage qui viole le Principe de Liskov.
		 */
		System.out.println("r = "+ r);
		System.out.println("r is "+ myFunction(r));

	}
}
