package Modelo;

public class TipoEspecie extends Especie{
	
	public TipoEspecie (String nombre){
		super(nombre);
	}
	
	public void agregar(Especie esp){
		System.out.println("no se puede agregar la hoja");
	}
	
	public void mostrar(int n){
		System.out.println('-' + "" + nombre);
	}

	@Override
	public void buscar(String esp) {
		
	}
}
