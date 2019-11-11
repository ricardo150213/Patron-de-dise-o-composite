package Modelo;

public abstract class Especie {
	protected String nombre;
	
	public Especie (String nombre){
		this.nombre = nombre;
	}
	
	abstract public void agregar(Especie c);
	abstract public void buscar(String esp);
	abstract public void mostrar(int altura);
}
