package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	static int cantidadCreados = 0;

	public Automovil(String placa,String nombre,int precio,float peso,Fabricante fabricante,int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
		Automovil.cantidadCreados+=1;
	}

	public int getPuestos(){
		return this.puestos;
	}

	public void setPuestos(int puestos){
		this.puestos = puestos;
	}
}
