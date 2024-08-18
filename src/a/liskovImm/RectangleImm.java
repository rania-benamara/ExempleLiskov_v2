package a.liskovImm;

public class RectangleImm {
	
	private int c1;
	private int c2;
	
	public RectangleImm(){
		setCote(0,0);
	}
	
	public RectangleImm(int c1, int c2){
		setCote(c1,c2);
	}
	
	/*
	 * Les objets de la classe RectangleImm sont immuables.
	 * La m�thode setCote est "protected". 
	 * */
	protected void setCote(int c1, int c2) {
		if (c1>=0) {this.c1=c1;}
		if (c2>=0) {this.c2=c2;}	
	}
	
	public int getc1() {
		return this.c1;
	}
	
	public int getc2() {
		return this.c2;
	}
	
	public int perimetre() {
		return 2*this.c1 + 2*this.c2;
	}
	public int surface() {
		return this.c1*this.c2;
	}

	@Override 
	public String toString() {
		return "[" + getc1()+", "+ getc2()+"]";
	}

}
