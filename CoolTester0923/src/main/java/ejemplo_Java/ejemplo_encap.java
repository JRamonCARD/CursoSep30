package ejemplo_Java;

public class ejemplo_encap {
	
	private int tipo; //variable int llamada tipo es privada
	
	//meotodo tipo void  del tipo int donde a la variable tipo le asigno el valor de "t"
	public void setTipo (int t) {
		tipo = t;
	}
	
	
	//metodo int tipo get en el que regresare el valor de tipo
	public  int getTipo() {
		return tipo;
	}

}
