package minijuego;

import java.util.ArrayList;

public class escenario {
	private jugador jugadores;
	private Enemigos enemigos;
	private String nombre ;
	private ArrayList<Enemigos>enemigoss=new ArrayList<Enemigos>();
	public escenario(String nombre) {
		this.nombre = nombre;
		
	
	}
	
	public void setJugador(jugador j) {
		this.jugadores = j;
	}
	
	public jugador getJugador() {
		return this.jugadores;
	}
	
	public void añadir(Enemigos enemigos){
		enemigoss.add(enemigos);
	
	}
	
	
	public Enemigos getEnemigo(int posicion) {
		return  enemigoss.get(posicion - 1);
	}

}
