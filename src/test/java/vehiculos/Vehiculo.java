package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private float velocidadMaxima;
	private String nombre;
	private int precio;
	private float peso;
	private String traccion;
	private Fabricante fabricante;
	static int cantidadVehiculos = 0;
	
	Vehiculo(String placa,int puertas,float velocidadMaxima,String nombre,int precio,float peso,String traccion,Fabricante fabricante){
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.traccion = traccion;
		this.fabricante = fabricante;
	}
}
