package ejemplo_Java;

public class DemoVehiculo {

	public static void main(String[] args) {
		

		//Creando un nuevo objeto llamado miniVan en el clase Vehiculo
		Vehiculo miniVan = new Vehiculo();
		
		int rango;
		
		//asignar valores a las variables 
		miniVan.pasajeros = 9;
		miniVan.capacidad = 15;
		miniVan.kmh = 20;
		
		//calcular el rango asumiendo un tanque lleno
		rango = miniVan.capacidad * miniVan.kmh;
		
		System.out.println("La minivan puede llevar " + miniVan.pasajeros + " pasajeros con un rango de: " + rango + "kilometros");
		
		//Creo un nuevo objeto llamado Carro
		Vehiculo carro = new Vehiculo();
	
		carro.pasajeros = 4;
		
		System.out.println("Numero de pasajeros de carro es: " + carro.pasajeros);
	}

}
