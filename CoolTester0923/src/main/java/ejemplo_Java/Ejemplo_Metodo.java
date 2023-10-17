package ejemplo_Java;

public class Ejemplo_Metodo {

	public static void main(String[] args) {
		
		
		int resultadoSuma = suma(40,50);
		
		System.out.println(resultadoSuma);
		
		
		
		int resultadoSuma3 = suma(40,50, 90);
		
		System.out.println(resultadoSuma3);
	}
	
	public static int suma (int a, int b) {  //Metodo static  de variables int que realiza una suma
		
		int c = a + b;
		
		return c;
	}
	
	
	//Segungo metodo  se llama igual suma pero incluye 3 variables
	public static int suma (int a, int b, int c) {
		
		int d = a+b+c;
		
		return d;
	}

}
