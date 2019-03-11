package minijuego;

	public class Acciones {
		
		public static void atacar(jugador j, Enemigos e, int vida) {
			int daño = j.getAtaque() - e.getReistencia();
			e.setVida(vida - daño);
	
	}
		public static void atacarE (jugador j, Enemigos e, int vida){
			int daño = e.getAtaque() - j.getReistencia();
			j.setVida(vida - daño);

	}	
	
}



