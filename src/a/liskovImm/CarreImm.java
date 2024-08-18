package a.liskovImm;

public class CarreImm extends RectangleImm {

	public CarreImm(){
//		super();
		this.setCote(0, 0);
	}
	
	public CarreImm(int c){
//		super(c,c);
		this.setCote(c, c);
	}
    
	/*
	 * Les objets de la classe CarreImm sont immuables.
	 * La m�thode setCote (h�rit�e de la classe RectangleImm) 
	 * est "protected". 
	 * */
}
