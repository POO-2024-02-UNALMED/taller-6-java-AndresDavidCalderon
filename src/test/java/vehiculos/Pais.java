package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre="";
	private int cantidadVehiculos = 0;
	private static ArrayList<Pais> listado = new ArrayList<Pais>();

	public Pais(String nombre){
		this.nombre=nombre;
		listado.add(this);
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public int getCantidadVehiculos(){
		return this.cantidadVehiculos;
	}

	public void agregarVehiculo(){
		this.cantidadVehiculos+=1;
	}

	public Pais paisMasVendedor(){
		int maxVentas = 0;
		Pais masVendedor = null;
		
		for(int i=0;i<listado.size();i++){
			if (listado.get(i).cantidadVehiculos>=maxVentas){
				maxVentas = listado.get(i).cantidadVehiculos;
				masVendedor = listado.get(i);
			}
		}

		return masVendedor;
	}
}
