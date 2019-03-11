package minijuego;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int opcion;
		jugador jugador ;
		Enemigos enemigo;
		escenario escenario= new escenario("Luis");
		do{
			System.out.println("Menu");
			System.out.println("1.Introduce un enemigo");
			System.out.println("2.Introduce un jugador ");
			System.out.println("3.Comenzar batalla entre enemigos y jugador");
		
			String nombre;
			String clase;
			int vida;
			int ataque;
			int resistencia;
			
			opcion=leer.nextInt();
			
		switch(opcion){
			
			case 1:
				System.out.println("Introduce los siguientes datos para el jugador nuevo...");
				System.out.println("Nombre: ");
				 nombre=leer.next();
				System.out.println("Clase: ");
				 clase=leer.next();
				System.out.println("Vida: ");
				 vida=leer.nextInt();
				System.out.println("Ataque: ");
				 ataque=leer.nextInt();
				System.out.println("Resistencia: ");
				 resistencia=leer.nextInt();
			    Enemigos e = new Enemigos(nombre,clase,vida,ataque,resistencia);
				escenario.añadir(e);
				break;
			case 2:
				System.out.println("Nombre: ");
				 nombre=leer.next();
				System.out.println("Clase: ");
			     clase=leer.next();
				System.out.println("Vida: ");
				 vida=leer.nextInt();
				System.out.println("Ataque: ");
				 ataque=leer.nextInt();
				System.out.println("Resistencia: ");
				 resistencia=leer.nextInt();
			    jugador j = new jugador(nombre,clase,vida,ataque,resistencia);
				escenario.setJugador(j);
				break;
			case 3:
				int opcion2;
				int opcion3 = 1;
				int opcion4;
				do {
				System.out.println("1.-Atacar...");
				System.out.println("2.-Saltar...");
				System.out.println("3.-Hacerse el muerto...");
				System.out.println("4.-Modo furia...");
			
				 opcion2 = leer.nextInt();
			switch(opcion2) {
			case 1: 
				System.out.println("Enemigo que quieres que sea atacado: ");
				 opcion3 = leer.nextInt();
				Acciones.atacar(escenario.getJugador(),escenario.getEnemigo(opcion3) , escenario.getEnemigo(opcion3).getVida());
				System.out.println("Despues de este ataque le queda de vida al enenmigo: " +  escenario.getEnemigo(opcion3).getVida() );
				break;
			case 2: 
				escenario.getJugador().saltar(escenario.getJugador());
			
			break;
			
			case 3:
				escenario.getJugador().hacerse_el_muerto(escenario.getJugador());
				
			break;
				
			case 4:
				escenario.getJugador().furia(escenario.getJugador());
			break;
			
			
			}
			System.out.println("1.-Atacar...");
			System.out.println("2.-Saltar...");
			System.out.println("3.-Hacerse el muerto...");
			
			opcion4 = leer.nextInt();
			switch(opcion4) {
			case 1: 
				System.out.println("Que enemigo quieres que ataque");
				opcion3 = leer.nextInt();
				Acciones.atacarE(escenario.getJugador(),escenario.getEnemigo(opcion3) , escenario.getEnemigo(opcion3).getVida());
				System.out.println("Despues de este ataque le queda de vida al jugador: " +  escenario.getJugador().getVida() );
				break; 
			case 2: 
				
			    escenario.getEnemigo(opcion3).saltar(escenario.getEnemigo(opcion3));
			break;
			
			case 3:
				
				escenario.getEnemigo(opcion3).hacerse_el_muerto(escenario.getEnemigo(opcion3));
			break;
			
			}
			 }while(opcion2!= 5);
				
				
				
				
				
				
			}		
		}while(opcion!=4);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}


