package vehiculos;

public class Fabricante {
	private String nombre;
	private Pais pais;

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
}
