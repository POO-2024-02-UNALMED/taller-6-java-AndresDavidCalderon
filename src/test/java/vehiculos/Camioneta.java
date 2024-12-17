package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    static int cantidadCreados=0;

    public Camioneta(String placa,int puertas,String nombre,int precio,float peso,Fabricante fabricante,boolean volco){
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
        this.volco=volco;
        Camioneta.cantidadCreados+=1;
	}

    public boolean isVolco(){
        return this.volco;
    }

    public void setVolco(boolean volco){
        this.volco = volco;
    }
}
