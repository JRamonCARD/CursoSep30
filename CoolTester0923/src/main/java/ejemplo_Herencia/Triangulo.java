package ejemplo_Herencia;

public class Triangulo extends Dosdimensiones{
	
	String estilo;
	
	
	//Meotodo para calcular el area no retorna nada
	double area () {
		return  (base * altura)/2;
	}
	
	//Metodo void que regresa algo 
	void mostrarEstilo() {
		System.out.println("Triangualo es: " + estilo);
		
	}
}
