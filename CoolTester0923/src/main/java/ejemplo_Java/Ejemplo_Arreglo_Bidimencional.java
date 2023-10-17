package ejemplo_Java;

public class Ejemplo_Arreglo_Bidimencional {

	public static void main(String[] args) {
		
		
		int arr[][] = {{2,7,9}, {3,6,1}, {7,4,2}};
		
		System.out.println(arr[0][2]);  //Imprime el valor ubicado en la posicion 3 del arreglo 1, porque todo inicia en la posicion 0
		
		//imprimir array de 2 dimensiones
		
		for (int i=0; i < 3; i++) {
			
			for (int j=0; j < 3; j++) {
				
				System.out.print(arr[i][j] + " ");
				
			}
			
			
			System.out.println(); //esta sirve para hacer el salto de linea
		}

	}

}
