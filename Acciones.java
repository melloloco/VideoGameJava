package minijuego;

	public class Acciones {
		
		public static void atacar(jugador j, Enemigos e, int vida) {
			int da�o = j.getAtaque() - e.getReistencia();
			e.setVida(vida - da�o);
	
	}
		public static void atacarE (jugador j, Enemigos e, int vida){
			int da�o = e.getAtaque() - j.getReistencia();
			j.setVida(vida - da�o);

	}	
	
}



