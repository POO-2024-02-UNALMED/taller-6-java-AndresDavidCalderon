package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	public Automovil(String placa,String nombre,int precio,float peso,Fabricante fabricante,int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
	}
}
