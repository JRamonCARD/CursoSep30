package ejemplo_Java;

public class ejemplo_encap_Demo {

	public static void main(String[] args) {
		

		//creando un objeto llamado encap  instanciado de la clase ejemplo_encap
		ejemplo_encap encap = new ejemplo_encap();

		//aqui le estoy mandado el valor de 5 a la variable que tengo en el setTipo -> t
		encap.setTipo(5);
		
		//imprimo  el contenido de getTipo que traera -> 5
		System.out.println("El tipo es: " + encap.getTipo());

	}

}
