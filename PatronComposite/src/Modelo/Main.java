package Modelo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Composite raiz = new Composite("Animalia");
		raiz.agregar(new TipoEspecie("Chordate"));
		raiz.agregar(new TipoEspecie("Arthropoda"));
		
		Composite comp = new Composite("Chordate");
		comp.agregar(new TipoEspecie("Mamal"));
		raiz.agregar(comp);
		
		Composite comp1 = new Composite("Arthropoda");
		comp1.agregar(new TipoEspecie("Insect"));
		raiz.agregar(comp1);
		
		Composite comp2 = new Composite("Mamal");
		comp2.agregar(new TipoEspecie("Primate"));
		comp2.agregar(new TipoEspecie("Carnivora"));
		comp.agregar(comp2);
		
		Composite comp3 = new Composite("Insect");
		comp3.agregar(new TipoEspecie("Diptera"));
		comp1.agregar(comp3);
		
		Composite comp4 = new Composite("Primate");
		comp4.agregar(new TipoEspecie("Hominidae"));
		comp4.agregar(new TipoEspecie("Pongidae"));
		comp2.agregar(comp4);
		
		Composite comp5 = new Composite("Carnivora");
		comp5.agregar(new TipoEspecie("Felidae"));
		comp2.agregar(comp5);
		
		Composite comp6 = new Composite("Diptera");
		comp6.agregar(new TipoEspecie("Muscidae"));
		comp3.agregar(comp6);
		
		Composite comp7 = new Composite("Hominidae");
		comp7.agregar(new TipoEspecie("Homo"));
		comp4.agregar(comp7);
		
		Composite comp8 = new Composite("Pongidae");
		comp8.agregar(new TipoEspecie("Pan"));
		comp4.agregar(comp8);
		
		Composite comp9 = new Composite("Felidae");
		comp9.agregar(new TipoEspecie("Felis"));
		comp5.agregar(comp9);
		
		Composite comp10 = new Composite("Muscidae");
		comp10.agregar(new TipoEspecie("Musca"));
		comp6.agregar(comp10);
		
		Composite comp11 = new Composite("Homo");
		comp11.agregar(new TipoEspecie("Sapiens"));
		comp7.agregar(comp11);
		
		Composite comp12 = new Composite("Pan");
		comp12.agregar(new TipoEspecie("Troglodytes"));
		comp8.agregar(comp12);
		
		Composite comp13 = new Composite("Felis");
		comp13.agregar(new TipoEspecie("Domestica"));
		comp13.agregar(new TipoEspecie("Leo"));
		comp9.agregar(comp13);
		
		Composite comp14 = new Composite("Musca");
		comp14.agregar(new TipoEspecie("Domestica"));
		comp10.agregar(comp14);
		
		Composite comp15 = new Composite("Sapiens");
		comp15.agregar(new TipoEspecie("Human"));
		comp11.agregar(comp15);
		
		Composite comp16 = new Composite("Troglodytes");
		comp16.agregar(new TipoEspecie("Chimpanzee"));
		comp12.agregar(comp16);
		
		Composite comp17 = new Composite("Domestica");
		comp17.agregar(new TipoEspecie("House Cat"));
		comp13.agregar(comp17);
		
		Composite comp18 = new Composite("Leo");
		comp18.agregar(new TipoEspecie("Lion"));
		comp13.agregar(comp18);
		
		Composite comp19 = new Composite("Domestica");
		comp19.agregar(new TipoEspecie("Housefly"));
		comp14.agregar(comp19);
		
		raiz.mostrar(1);
		System.out.println(" ");
		System.out.println("Ingrese el tipo de especie a buscar: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        raiz.buscar(name);
	}

}
