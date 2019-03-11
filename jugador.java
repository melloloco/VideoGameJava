package minijuego;

public class jugador {
	private String nombre;
	private String clase;
	private int vida;
	private int ataque;
	private int resistencia;
	
	public jugador(String nombre, String clase, int vida, int ataque, int resistencia) {
		this.nombre = nombre;
		this.clase = clase;
		this.vida = vida;
		this.ataque = ataque;
		this.resistencia = resistencia;
	
	}
	
	
	
	public String getNombre() {
		return this.nombre;
	}

	public static void saltar(jugador j) {
		System.out.println("El jugador esta saltando");
	}

    public static void atacar(jugador j) {
	System.out.println("El jugador esta atacando");
	}
	

    public static void hacerse_el_muerto(jugador j) {
	System.out.println("El jugador esta haciendose el muerto");
	}
	
	
    public static void correr(jugador j) {
		System.out.println("El jugador esta corriendo");
	}
	
    public  void furia(jugador j) {
    	System.out.println("Has entrado en mnodo furia");
		this.ataque += this.ataque + 50;
	}
	
    public int getAtaque() {
    	return this.ataque; 
    }
	
    public int getReistencia() {
  		return this.resistencia; 
  	}
    
    public void setVida(int j) {
    	this.vida = j;
    }
	
    public int getVida() {
  		return this.vida; 
  	}
	

}
