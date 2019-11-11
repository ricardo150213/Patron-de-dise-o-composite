package Modelo;

import java.util.ArrayList;

public class Composite extends Especie{
	private ArrayList<Especie> lstEspecies = new ArrayList<Especie>();
	
	public Composite (String nombre){
		super(nombre);
	}
	
	@Override
	public void agregar(Especie componente){
		lstEspecies.add(componente);
	}
	
	@Override
	public void mostrar(int altura){
		System.out.println(" ");
		System.out.println(nombre);
		for (int i = 0; i<lstEspecies.size(); i++) {
			lstEspecies.get(i).mostrar(altura + 1);
		}
	}

	@Override
	public void buscar(String esp) {
		System.out.println(" ");
		System.out.println(nombre);
		for (int i = 0; i<lstEspecies.size(); i++) {
			lstEspecies.get(i).buscar(esp);
		}
	}
}
