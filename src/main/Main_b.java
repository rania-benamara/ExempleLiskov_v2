package main;

import b.liskovViolation.*;

public class Main_b {
	
	/*
	 * Quand on duplique le c�t� vertical (c2) d'un rectangle,
	 * l'aire du rectangle doit dupliquer aussi.
	 * La m�thode myF(r) v�rifie cette propri�t�.
	 */
	public static String myF(Rectangle r)
	{
		int aire = r.surface();
		r.setCote(r.getc1(), 2*r.getc2());
		if (r.surface()==2*aire) {
			return "OK";
		}
		else {
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5,7);
		System.out.println("r1 = "+r1);
		System.out.println("r1 is "+ myF(r1));
		System.out.println("r1 = "+r1);
		
		Rectangle r2 = new Rectangle(7,7);
		System.out.println("r2 = "+r2);
		System.out.println("r2 is "+ myF(r2));
		System.out.println("r2 = "+r2);
		
		Carre c = new Carre(5);
		System.out.println("c = "+c);
		/*
		 * �tant donn�e que la classe Carr� a �t� d�finie comme 
		 * d�riv�e de la classe Rectangle, on peut appeler la m�thode 
		 * myF pour c. 
		 * 
		 * Mais quand on essaie de dupliquer le c�t� vertical (c2) d'un carr�,
		 * la m�thode setcote() d�finie pour carr� ne va pas permetre dupliquer 
		 * seulement un c�t�.  Alors le carr� ne changera pas.
		 * La m�thode myF(r) va jeter une exception.
		 * 
		 * Alors, on voit que faire la classe Carre d�riv�e de 
		 * la classe Retangle, dans le cas o� on peut change les c�t�s
		 * apr�s la cr�ation, donne comme r�sultat un h�ritage qui viole 
		 * le Principe de Liskov.
		 */
		System.out.println("c is "+ myF(c));  
		System.out.println("c = "+c);;
	}
}
