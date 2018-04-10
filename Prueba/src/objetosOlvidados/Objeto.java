package objetosOlvidados;

public class Objeto {
	
	private int fecha ;
	private int habitacion;
	private String recamarista;
	private String descripcion;
	

	public Objeto(int fecha,int habitacion,String recamarista,String descripcion){
		this.fecha = fecha;
		this.habitacion = habitacion;
		this.recamarista = recamarista;
		this.descripcion = descripcion;		
	}
	
	//getters y setters 
	public int getFecha() {
		return fecha;
	}


	public void setFecha(int fecha) {
		this.fecha = fecha;
	}


	public int getHabitacion() {
		return habitacion;
	}


	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}


	public String getRecamarista() {
		return recamarista;
	}


	public void setRecamarista(String recamarista) {
		this.recamarista = recamarista;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String toString() {
		return "OBJETO NO.  [Fecha=" + fecha + ", Habitacion que se encontro =" + habitacion + ", Recamarista que lo encontro =" + recamarista + ",Descripcion =" + descripcion +"]";
	}

}//fin clase objeto
