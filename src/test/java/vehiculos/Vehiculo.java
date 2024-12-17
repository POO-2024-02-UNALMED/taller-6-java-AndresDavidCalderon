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
	
	public Vehiculo(String placa,int puertas,float velocidadMaxima,String nombre,int precio,float peso,String traccion,Fabricante fabricante){
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.traccion = traccion;
		this.fabricante = fabricante;
		fabricante.agregarVehiculo();
		fabricante.getPais().agregarVehiculo();
	}

	public String vehiclosPorTipo(){
		return "Automoviles: "+Automovil.cantidadCreados+"\n Camionetas: "+Camioneta.cantidadCreados+"\n Camiones: "+Camion.cantidadCreados;
	}

	public String getPlaca(){
		return this.placa;
	}

	public void setPlaca(String placa){
		this.placa = placa;
	}

	public int getPuertas(){
		return this.puertas;
	}

	public void setPuertas(int puertas){
		this.puertas=puertas;
	}

	public float getVelocidadMaxima(){
		return this.velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima){
		this.velocidadMaxima=velocidadMaxima;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public float getPeso(){
		return this.peso;
	}

	public void setPeso(float peso){
		this.peso = peso;
	}

	public int getPrecio(){
		return this.precio;
	}

	public void setPrecio(int precio){
		this.precio = precio;
	}

	public String getTraccion(){
		return this.traccion;
	}

	public void setTraccion(String traccion){
		this.traccion = traccion;
	}

	public Fabricante getFabricante(){
		return this.fabricante;
	}

	public void setFabricante(Fabricante fabricante){
		this.fabricante = fabricante;
	}

	static int getCantidadCreados(){
		return Vehiculo.cantidadVehiculos;
	}
}
