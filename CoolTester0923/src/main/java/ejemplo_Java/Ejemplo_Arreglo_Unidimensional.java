package ejemplo_Java;

public class Ejemplo_Arreglo_Unidimensional {

	public static void main(String[] args) {
		
		//Arreglo de enteros
		int intArray[];
		
		//declarar array de strings
		String[] arr;
		
		//asignando memoria/posiciones para 5 enteros
		arr = new  String[5];
		
		//Inicializar y asignar el primer elemento del arreglo
		arr[0]= "cero";
		arr[1]= "uno";
		arr[2]= "dos";
		arr[3]= "tres";
		arr[4]= "cuatro";
		
		
		System.out.println("El valor de la posisicion dos en el arreglo es: " + arr[2]);
		
		//acceder a todos los elementos del arreglo 
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Elemento en la posicion: " + i + " es -> " + arr[i] );
			
		}
		
	}

}
