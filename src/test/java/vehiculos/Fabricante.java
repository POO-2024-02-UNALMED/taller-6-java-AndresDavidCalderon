package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int cantidadVehiculos = 0;
	private static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();

	public Fabricante(String nombre, Pais pais){
		this.nombre=nombre;
		this.pais = pais;
		listado.add(this);
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public Pais getPais(){
		return this.pais;
	}

	public void setPais(Pais pais){
		this.pais = pais;
	}

	
	public int getCantidadVehiculos(){
		return this.cantidadVehiculos;
	}

	public void agregarVehiculo(){
		this.cantidadVehiculos+=1;
	}

	public Fabricante fabricaMayorVentas(){
		int masVentas = -1;
		Fabricante mayorVendedor = null;

		for(int i=0; i<listado.size(); i++){
			if(listado.get(i).getCantidadVehiculos()>masVentas){
				masVentas=listado.get(i).getCantidadVehiculos();
				mayorVendedor = listado.get(i);
			}
		}

		return mayorVendedor;
	}
}
